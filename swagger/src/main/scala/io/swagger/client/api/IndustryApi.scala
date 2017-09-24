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

import io.swagger.client.model.Forbidden
import io.swagger.client.model.GetCharactersCharacterIdIndustryJobs200Ok
import io.swagger.client.model.GetIndustryFacilities200Ok
import io.swagger.client.model.GetIndustrySystems200Ok
import io.swagger.client.model.InternalServerError
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class IndustryApi(val defBasePath: String = "https://esi.tech.ccp.is/latest",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * List character industry jobs
   * List industry jobs placed by a character  --- Alternate route: &#x60;/v1/characters/{character_id}/industry/jobs/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/industry/jobs/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/industry/jobs/&#x60;  --- This route is cached for up to 300 seconds
   * @param characterId An EVE character ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param includeCompleted Whether retrieve completed character industry jobs as well (optional)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return List[GetCharactersCharacterIdIndustryJobs200Ok]
   */
  def getCharactersCharacterIdIndustryJobs(characterId: Int, datasource: Option[String] /* = tranquility*/, includeCompleted: Option[Boolean] = None, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[List[GetCharactersCharacterIdIndustryJobs200Ok]] = {
    // create path and map variables
    val path = "/characters/{character_id}/industry/jobs/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    includeCompleted.map(paramVal => queryParams += "include_completed" -> paramVal.toString)
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
           Some(apiInvoker.deserialize(s, "array", classOf[GetCharactersCharacterIdIndustryJobs200Ok]).asInstanceOf[List[GetCharactersCharacterIdIndustryJobs200Ok]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List industry facilities
   * Return a list of industry facilities  --- Alternate route: &#x60;/v1/industry/facilities/&#x60;  Alternate route: &#x60;/legacy/industry/facilities/&#x60;  Alternate route: &#x60;/dev/industry/facilities/&#x60;  --- This route is cached for up to 3600 seconds
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return List[GetIndustryFacilities200Ok]
   */
  def getIndustryFacilities(datasource: Option[String] /* = tranquility*/, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[List[GetIndustryFacilities200Ok]] = {
    // create path and map variables
    val path = "/industry/facilities/".replaceAll("\\{format\\}", "json")

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
           Some(apiInvoker.deserialize(s, "array", classOf[GetIndustryFacilities200Ok]).asInstanceOf[List[GetIndustryFacilities200Ok]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * List solar system cost indices
   * Return cost indices for solar systems  --- Alternate route: &#x60;/v1/industry/systems/&#x60;  Alternate route: &#x60;/legacy/industry/systems/&#x60;  Alternate route: &#x60;/dev/industry/systems/&#x60;  --- This route is cached for up to 3600 seconds
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return List[GetIndustrySystems200Ok]
   */
  def getIndustrySystems(datasource: Option[String] /* = tranquility*/, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[List[GetIndustrySystems200Ok]] = {
    // create path and map variables
    val path = "/industry/systems/".replaceAll("\\{format\\}", "json")

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
           Some(apiInvoker.deserialize(s, "array", classOf[GetIndustrySystems200Ok]).asInstanceOf[List[GetIndustrySystems200Ok]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
