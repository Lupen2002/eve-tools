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

import io.swagger.client.model.GetWarsWarIdKillmails200Ok
import io.swagger.client.model.GetWarsWarIdKillmailsUnprocessableEntity
import io.swagger.client.model.GetWarsWarIdOk
import io.swagger.client.model.GetWarsWarIdUnprocessableEntity
import io.swagger.client.model.InternalServerError
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class WarsApi(val defBasePath: String = "https://esi.tech.ccp.is/latest",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * List wars
   * Return a list of wars  --- Alternate route: &#x60;/v1/wars/&#x60;  Alternate route: &#x60;/legacy/wars/&#x60;  Alternate route: &#x60;/dev/wars/&#x60;  --- This route is cached for up to 3600 seconds
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param maxWarId Only return wars with ID smaller than this. (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return List[Int]
   */
  def getWars(datasource: Option[String] /* = tranquility*/, maxWarId: Option[Int] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[List[Int]] = {
    // create path and map variables
    val path = "/wars/".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    maxWarId.map(paramVal => queryParams += "max_war_id" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "array", classOf[Int]).asInstanceOf[List[Int]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get war information
   * Return details about a war  --- Alternate route: &#x60;/v1/wars/{war_id}/&#x60;  Alternate route: &#x60;/legacy/wars/{war_id}/&#x60;  Alternate route: &#x60;/dev/wars/{war_id}/&#x60;  --- This route is cached for up to 3600 seconds
   * @param warId ID for a war 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return GetWarsWarIdOk
   */
  def getWarsWarId(warId: Int, datasource: Option[String] /* = tranquility*/, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[GetWarsWarIdOk] = {
    // create path and map variables
    val path = "/wars/{war_id}/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "war_id" + "\\}",apiInvoker.escape(warId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "", classOf[GetWarsWarIdOk]).asInstanceOf[GetWarsWarIdOk])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List kills for a war
   * Return a list of kills related to a war  --- Alternate route: &#x60;/v1/wars/{war_id}/killmails/&#x60;  Alternate route: &#x60;/legacy/wars/{war_id}/killmails/&#x60;  Alternate route: &#x60;/dev/wars/{war_id}/killmails/&#x60;  --- This route is cached for up to 3600 seconds
   * @param warId A valid war ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param page Which page of results to return (optional, default to 1)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return List[GetWarsWarIdKillmails200Ok]
   */
  def getWarsWarIdKillmails(warId: Int, datasource: Option[String] /* = tranquility*/, page: Option[Int] /* = 1*/, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[List[GetWarsWarIdKillmails200Ok]] = {
    // create path and map variables
    val path = "/wars/{war_id}/killmails/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "war_id" + "\\}",apiInvoker.escape(warId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    page.map(paramVal => queryParams += "page" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "array", classOf[GetWarsWarIdKillmails200Ok]).asInstanceOf[List[GetWarsWarIdKillmails200Ok]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
