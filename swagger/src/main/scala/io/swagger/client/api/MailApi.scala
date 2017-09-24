/**
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.5.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import io.swagger.client.model.DeleteCharactersCharacterIdMailLabelsLabelIdUnprocessableEntity
import io.swagger.client.model.Forbidden
import io.swagger.client.model.GetCharactersCharacterIdMail200Ok
import io.swagger.client.model.GetCharactersCharacterIdMailLabelsOk
import io.swagger.client.model.GetCharactersCharacterIdMailLists200Ok
import io.swagger.client.model.GetCharactersCharacterIdMailMailIdNotFound
import io.swagger.client.model.GetCharactersCharacterIdMailMailIdOk
import io.swagger.client.model.InternalServerError
import io.swagger.client.model.PostCharactersCharacterIdMailBadRequest
import io.swagger.client.model.PostCharactersCharacterIdMailLabelsLabel
import io.swagger.client.model.PostCharactersCharacterIdMailMail
import io.swagger.client.model.PutCharactersCharacterIdMailMailIdBadRequest
import io.swagger.client.model.PutCharactersCharacterIdMailMailIdContents
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class MailApi(val defBasePath: String = "https://esi.tech.ccp.is/latest",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Delete a mail label
   * Delete a mail label  --- Alternate route: &#x60;/v1/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/{label_id}/&#x60; 
   * @param characterId An EVE character ID 
   * @param labelId An EVE label id 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return void
   */
  def deleteCharactersCharacterIdMailLabelsLabelId(characterId: Int, labelId: Int, datasource: Option[String] /* = tranquility*/, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None) = {
    // create path and map variables
    val path = "/characters/{character_id}/mail/labels/{label_id}/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId)).replaceAll("\\{" + "label_id" + "\\}",apiInvoker.escape(labelId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    token.map(paramVal => queryParams += "token" -> paramVal.toString)
    userAgent.map(paramVal => queryParams += "user_agent" -> paramVal.toString)
    
    xUserAgent.map(paramVal => headerParams += "X-User-Agent" -> paramVal)

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete a mail
   * Delete a mail  --- Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60; 
   * @param characterId An EVE character ID 
   * @param mailId An EVE mail ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return void
   */
  def deleteCharactersCharacterIdMailMailId(characterId: Int, mailId: Int, datasource: Option[String] /* = tranquility*/, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None) = {
    // create path and map variables
    val path = "/characters/{character_id}/mail/{mail_id}/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId)).replaceAll("\\{" + "mail_id" + "\\}",apiInvoker.escape(mailId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    token.map(paramVal => queryParams += "token" -> paramVal.toString)
    userAgent.map(paramVal => queryParams += "user_agent" -> paramVal.toString)
    
    xUserAgent.map(paramVal => headerParams += "X-User-Agent" -> paramVal)

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Return mail headers
   * Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards.  --- Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60;  --- This route is cached for up to 30 seconds
   * @param characterId An EVE character ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param labels Fetch only mails that match one or more of the given labels (optional)
   * @param lastMailId List only mail with an ID lower than the given ID, if present (optional)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return List[GetCharactersCharacterIdMail200Ok]
   */
  def getCharactersCharacterIdMail(characterId: Int, datasource: Option[String] /* = tranquility*/, labels: Option[List[Long]] = None, lastMailId: Option[Int] = None, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[List[GetCharactersCharacterIdMail200Ok]] = {
    // create path and map variables
    val path = "/characters/{character_id}/mail/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    labels.map(paramVal => queryParams += "labels" -> paramVal.toString)
    lastMailId.map(paramVal => queryParams += "last_mail_id" -> paramVal.toString)
    token.map(paramVal => queryParams += "token" -> paramVal.toString)
    userAgent.map(paramVal => queryParams += "user_agent" -> paramVal.toString)
    
    xUserAgent.map(paramVal => headerParams += "X-User-Agent" -> paramVal)

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "array", classOf[GetCharactersCharacterIdMail200Ok]).asInstanceOf[List[GetCharactersCharacterIdMail200Ok]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get mail labels and unread counts
   * Return a list of the users mail labels, unread counts for each label and a total unread count.  --- Alternate route: &#x60;/v3/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/&#x60;  --- This route is cached for up to 30 seconds
   * @param characterId An EVE character ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return GetCharactersCharacterIdMailLabelsOk
   */
  def getCharactersCharacterIdMailLabels(characterId: Int, datasource: Option[String] /* = tranquility*/, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[GetCharactersCharacterIdMailLabelsOk] = {
    // create path and map variables
    val path = "/characters/{character_id}/mail/labels/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    token.map(paramVal => queryParams += "token" -> paramVal.toString)
    userAgent.map(paramVal => queryParams += "user_agent" -> paramVal.toString)
    
    xUserAgent.map(paramVal => headerParams += "X-User-Agent" -> paramVal)

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[GetCharactersCharacterIdMailLabelsOk]).asInstanceOf[GetCharactersCharacterIdMailLabelsOk])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Return mailing list subscriptions
   * Return all mailing lists that the character is subscribed to   --- Alternate route: &#x60;/v1/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/lists/&#x60;  --- This route is cached for up to 120 seconds
   * @param characterId An EVE character ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return List[GetCharactersCharacterIdMailLists200Ok]
   */
  def getCharactersCharacterIdMailLists(characterId: Int, datasource: Option[String] /* = tranquility*/, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[List[GetCharactersCharacterIdMailLists200Ok]] = {
    // create path and map variables
    val path = "/characters/{character_id}/mail/lists/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    token.map(paramVal => queryParams += "token" -> paramVal.toString)
    userAgent.map(paramVal => queryParams += "user_agent" -> paramVal.toString)
    
    xUserAgent.map(paramVal => headerParams += "X-User-Agent" -> paramVal)

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "array", classOf[GetCharactersCharacterIdMailLists200Ok]).asInstanceOf[List[GetCharactersCharacterIdMailLists200Ok]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Return a mail
   * Return the contents of an EVE mail  --- Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;  --- This route is cached for up to 30 seconds
   * @param characterId An EVE character ID 
   * @param mailId An EVE mail ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return GetCharactersCharacterIdMailMailIdOk
   */
  def getCharactersCharacterIdMailMailId(characterId: Int, mailId: Int, datasource: Option[String] /* = tranquility*/, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[GetCharactersCharacterIdMailMailIdOk] = {
    // create path and map variables
    val path = "/characters/{character_id}/mail/{mail_id}/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId)).replaceAll("\\{" + "mail_id" + "\\}",apiInvoker.escape(mailId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    token.map(paramVal => queryParams += "token" -> paramVal.toString)
    userAgent.map(paramVal => queryParams += "user_agent" -> paramVal.toString)
    
    xUserAgent.map(paramVal => headerParams += "X-User-Agent" -> paramVal)

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[GetCharactersCharacterIdMailMailIdOk]).asInstanceOf[GetCharactersCharacterIdMailMailIdOk])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Send a new mail
   * Create and send a new mail  --- Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60; 
   * @param characterId An EVE character ID 
   * @param mail The mail to send 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return Int
   */
  def postCharactersCharacterIdMail(characterId: Int, mail: PostCharactersCharacterIdMailMail, datasource: Option[String] /* = tranquility*/, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[Int] = {
    // create path and map variables
    val path = "/characters/{character_id}/mail/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (mail == null) throw new Exception("Missing required parameter 'mail' when calling MailApi->postCharactersCharacterIdMail")

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    token.map(paramVal => queryParams += "token" -> paramVal.toString)
    userAgent.map(paramVal => queryParams += "user_agent" -> paramVal.toString)
    
    xUserAgent.map(paramVal => headerParams += "X-User-Agent" -> paramVal)

    var postBody: AnyRef = mail

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[Int]).asInstanceOf[Int])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create a mail label
   * Create a mail label  --- Alternate route: &#x60;/v2/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/&#x60; 
   * @param characterId An EVE character ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param label Label to create (optional)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return Long
   */
  def postCharactersCharacterIdMailLabels(characterId: Int, datasource: Option[String] /* = tranquility*/, label: Option[PostCharactersCharacterIdMailLabelsLabel] = None, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[Long] = {
    // create path and map variables
    val path = "/characters/{character_id}/mail/labels/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    token.map(paramVal => queryParams += "token" -> paramVal.toString)
    userAgent.map(paramVal => queryParams += "user_agent" -> paramVal.toString)
    
    xUserAgent.map(paramVal => headerParams += "X-User-Agent" -> paramVal)

    var postBody: AnyRef = label.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[Long]).asInstanceOf[Long])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update metadata about a mail
   * Update metadata about a mail  --- Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60; 
   * @param characterId An EVE character ID 
   * @param contents Data used to update the mail 
   * @param mailId An EVE mail ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return void
   */
  def putCharactersCharacterIdMailMailId(characterId: Int, contents: PutCharactersCharacterIdMailMailIdContents, mailId: Int, datasource: Option[String] /* = tranquility*/, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None) = {
    // create path and map variables
    val path = "/characters/{character_id}/mail/{mail_id}/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId)).replaceAll("\\{" + "mail_id" + "\\}",apiInvoker.escape(mailId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (contents == null) throw new Exception("Missing required parameter 'contents' when calling MailApi->putCharactersCharacterIdMailMailId")

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    token.map(paramVal => queryParams += "token" -> paramVal.toString)
    userAgent.map(paramVal => queryParams += "user_agent" -> paramVal.toString)
    
    xUserAgent.map(paramVal => headerParams += "X-User-Agent" -> paramVal)

    var postBody: AnyRef = contents

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}