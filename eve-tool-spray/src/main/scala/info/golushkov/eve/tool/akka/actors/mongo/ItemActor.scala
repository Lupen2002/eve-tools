package info.golushkov.eve.tool.akka.actors.mongo

import java.util.concurrent.Executors

import akka.actor.{Actor, ActorLogging, ActorRef}
import akka.util.Timeout
import akka.pattern.{ask, pipe}
import info.golushkov.eve.tool.akka.models.{Item, MarketGroup}
import info.golushkov.eve.tool.akka.mongodb.DB
import info.golushkov.eve.tool.akka.mongodb.models._
import info.golushkov.eve.tool.akka.utils.UberFuture
import org.mongodb.scala.model.Filters.equal
import org.mongodb.scala.model.Updates.{combine, set}

import scala.annotation.tailrec
import scala.concurrent.ExecutionContext
import scala.concurrent.duration._

import scala.language.postfixOps

class ItemActor(marketGroupActor: ActorRef) extends Actor with UberFuture with ActorLogging {
  import ItemActor._
  import MongoConversion._
  private val coll = DB.database.getCollection[ItemMongo]("items")

  implicit val ec: ExecutionContext = ExecutionContext.fromExecutor(Executors.newFixedThreadPool(2))
  implicit val to: Timeout = Timeout(5 seconds)

  @tailrec
  private def getChildrenItemsId(mgs: List[MarketGroup], ids: List[Int], tail: List[Int] = Nil): List[Int] = {
    val mg = ids.flatMap(id => mgs.find(_.id == id)).flatMap(_.types)
    val childs = ids.flatMap(id => mgs.filter(_.parentId.contains(id)))
    if (childs.isEmpty) {
      mg ++ tail
    } else {
      getChildrenItemsId(mgs, childs.map(_.id), mg ++ tail)
    }

  }

  override def receive:Actor.Receive = {
    case GetAllOnMarketGroup(marketGroupId) =>
      log.info(s"GetAllOnMarketGroup($marketGroupId)")
      val mgs = (marketGroupActor ? MarketGroupActor.GetAll).map(_.asInstanceOf[List[MarketGroup]]).await
      val ids = getChildrenItemsId(mgs, List(marketGroupId)).toSet
      coll.find().toFuture().map(_.map(_.asScala)).map(_.filter(i => ids(i.id))) pipeTo sender()

    case GetOnId(id) =>
      coll.find(equal("id", id)).toFuture().map(_.headOption.map(_.asScala)) pipeTo sender()

    case WriteOrUpdate(item) =>
      coll.find(equal("id", item.id)).toFuture().map(res => WriteOrUpdate2(res.headOption, item.asMongo)).pipeTo(self)(sender())

    case WriteOrUpdate2(Some(res), item) =>
      coll.updateOne(equal("_id", res._id), combine(
        set("id", item.id),
        set("iconId", item.iconId),
        set("name", item.name),
        set("groupId", item.groupId))).toFuture

    case WriteOrUpdate2(None, item) =>
      coll.insertOne(item).toFuture

    case GetAll =>
      coll.find().toFuture().map(res => GetAllResult(res.map(_.asScala).toList)) pipeTo sender()
  }
  private case class WriteOrUpdate2(res: Option[ItemMongo], item: ItemMongo)
}

object ItemActor{
  case object GetAll
  case class GetAllOnMarketGroup(marketGroupId: Int)
  case class GetOnId(id: Int)
  case class WriteOrUpdate(item: Item)

  case class GetAllResult(items: List[Item])
}
