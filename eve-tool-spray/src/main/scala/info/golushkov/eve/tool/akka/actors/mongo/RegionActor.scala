package info.golushkov.eve.tool.akka.actors.mongo

import java.util.concurrent.Executors

import akka.actor.{Actor, ActorLogging, ActorRef}
import akka.pattern.pipe
import akka.util.Timeout
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Updates._
import info.golushkov.eve.tool.akka.models.Region
import info.golushkov.eve.tool.akka.mongodb.DB
import info.golushkov.eve.tool.akka.mongodb.models.RegionMongo
import org.mongodb.scala.model.Filters.equal

import scala.concurrent.{Await, ExecutionContext}
import scala.concurrent.duration._
import scala.language.postfixOps

class RegionActor extends Actor with ActorLogging {
  import RegionActor._
  import info.golushkov.eve.tool.akka.mongodb.models.MongoConversion._
  private val coll = DB.database.getCollection[RegionMongo]("regions")

  implicit val ec: ExecutionContext = ExecutionContext.fromExecutor(Executors.newFixedThreadPool(2))
  implicit val to: Timeout = Timeout(5 seconds)

  override def receive = {
    case GetAll =>
      coll.find().toFuture().map(_.map(_.asScala).toList).map(GetAllResult) pipeTo sender()

    case WriteOrUpdate(region) =>
      val s: ActorRef = sender()
      coll.find(equal("id", region.id)).toFuture().map(res => WriteOrUpdate2(res.headOption, region.asMongo)).pipeTo(self)(s)

    case WriteOrUpdate2(Some(res), region) =>
      coll.updateOne(equal("_id", res._id), combine(
        set("id", region.id),
        set("name", region.name),
        set("constellations", region.constellations)
      )).toFuture

    case WriteOrUpdate2(None, region) =>
      coll.insertOne(region).toFuture
  }

  private case class WriteOrUpdate2(res: Option[RegionMongo], region: RegionMongo)
}

object RegionActor {
  case object GetAll
  case class GetAllResult(regions: List[Region])
  case class WriteOrUpdate(region: Region)
}
