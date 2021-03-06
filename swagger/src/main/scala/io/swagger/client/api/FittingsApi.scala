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
import io.swagger.client.model.GetCharactersCharacterIdFittings200Ok
import io.swagger.client.model.InternalServerError
import io.swagger.client.model.PostCharactersCharacterIdFittingsCreated
import io.swagger.client.model.PostCharactersCharacterIdFittingsFitting
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class FittingsApi(val defBasePath: String = "https://esi.tech.ccp.is/latest",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Delete fitting
   * Delete a fitting from a character  --- Alternate route: &#x60;/v1/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/{fitting_id}/&#x60; 
   * @param characterId An EVE character ID 
   * @param fittingId ID for a fitting of this character 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return void
   */
  def deleteCharactersCharacterIdFittingsFittingId(characterId: Int, fittingId: Int, datasource: Option[String] /* = tranquility*/, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None) = {
    // create path and map variables
    val path = "/characters/{character_id}/fittings/{fitting_id}/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId)).replaceAll("\\{" + "fitting_id" + "\\}",apiInvoker.escape(fittingId))

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
   * Get fittings
   * Return fittings of a character  --- Alternate route: &#x60;/v1/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60;  --- This route is cached for up to 300 seconds
   * @param characterId An EVE character ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return List[GetCharactersCharacterIdFittings200Ok]
   */
  def getCharactersCharacterIdFittings(characterId: Int, datasource: Option[String] /* = tranquility*/, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[List[GetCharactersCharacterIdFittings200Ok]] = {
    // create path and map variables
    val path = "/characters/{character_id}/fittings/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId))

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
           Some(apiInvoker.deserialize(s, "array", classOf[GetCharactersCharacterIdFittings200Ok]).asInstanceOf[List[GetCharactersCharacterIdFittings200Ok]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create fitting
   * Save a new fitting for a character  --- Alternate route: &#x60;/v1/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60; 
   * @param characterId An EVE character ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param fitting Details about the new fitting (optional)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return PostCharactersCharacterIdFittingsCreated
   */
  def postCharactersCharacterIdFittings(characterId: Int, datasource: Option[String] /* = tranquility*/, fitting: Option[PostCharactersCharacterIdFittingsFitting] = None, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[PostCharactersCharacterIdFittingsCreated] = {
    // create path and map variables
    val path = "/characters/{character_id}/fittings/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    datasource.map(paramVal => queryParams += "datasource" -> paramVal.toString)
    token.map(paramVal => queryParams += "token" -> paramVal.toString)
    userAgent.map(paramVal => queryParams += "user_agent" -> paramVal.toString)
    
    xUserAgent.map(paramVal => headerParams += "X-User-Agent" -> paramVal)

    var postBody: AnyRef = fitting.map(paramVal => paramVal)

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[PostCharactersCharacterIdFittingsCreated]).asInstanceOf[PostCharactersCharacterIdFittingsCreated])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
