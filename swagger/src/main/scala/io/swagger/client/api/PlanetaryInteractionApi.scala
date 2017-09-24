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
import io.swagger.client.model.GetCharactersCharacterIdPlanets200Ok
import io.swagger.client.model.GetCharactersCharacterIdPlanetsPlanetIdNotFound
import io.swagger.client.model.GetCharactersCharacterIdPlanetsPlanetIdOk
import io.swagger.client.model.GetUniverseSchematicsSchematicIdNotFound
import io.swagger.client.model.GetUniverseSchematicsSchematicIdOk
import io.swagger.client.model.InternalServerError
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class PlanetaryInteractionApi(val defBasePath: String = "https://esi.tech.ccp.is/latest",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Get colonies
   * Returns a list of all planetary colonies owned by a character.  --- Alternate route: &#x60;/v1/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/planets/&#x60;  --- This route is cached for up to 600 seconds
   * @param characterId An EVE character ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return List[GetCharactersCharacterIdPlanets200Ok]
   */
  def getCharactersCharacterIdPlanets(characterId: Int, datasource: Option[String] /* = tranquility*/, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[List[GetCharactersCharacterIdPlanets200Ok]] = {
    // create path and map variables
    val path = "/characters/{character_id}/planets/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId))

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
           Some(apiInvoker.deserialize(s, "array", classOf[GetCharactersCharacterIdPlanets200Ok]).asInstanceOf[List[GetCharactersCharacterIdPlanets200Ok]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get colony layout
   * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.  --- Alternate route: &#x60;/v3/characters/{character_id}/planets/{planet_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/planets/{planet_id}/&#x60;  --- This route is cached for up to 600 seconds
   * @param characterId An EVE character ID 
   * @param planetId Planet id of the target planet 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param token Access token to use if unable to set a header (optional)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return GetCharactersCharacterIdPlanetsPlanetIdOk
   */
  def getCharactersCharacterIdPlanetsPlanetId(characterId: Int, planetId: Int, datasource: Option[String] /* = tranquility*/, token: Option[String] = None, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[GetCharactersCharacterIdPlanetsPlanetIdOk] = {
    // create path and map variables
    val path = "/characters/{character_id}/planets/{planet_id}/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "character_id" + "\\}",apiInvoker.escape(characterId)).replaceAll("\\{" + "planet_id" + "\\}",apiInvoker.escape(planetId))

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
           Some(apiInvoker.deserialize(s, "", classOf[GetCharactersCharacterIdPlanetsPlanetIdOk]).asInstanceOf[GetCharactersCharacterIdPlanetsPlanetIdOk])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get schematic information
   * Get information on a planetary factory schematic  --- Alternate route: &#x60;/v1/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/legacy/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/dev/universe/schematics/{schematic_id}/&#x60;  --- This route is cached for up to 3600 seconds
   * @param schematicId A PI schematic ID 
   * @param datasource The server name you would like data from (optional, default to tranquility)
   * @param userAgent Client identifier, takes precedence over headers (optional)
   * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
   * @return GetUniverseSchematicsSchematicIdOk
   */
  def getUniverseSchematicsSchematicId(schematicId: Int, datasource: Option[String] /* = tranquility*/, userAgent: Option[String] = None, xUserAgent: Option[String] = None): Option[GetUniverseSchematicsSchematicIdOk] = {
    // create path and map variables
    val path = "/universe/schematics/{schematic_id}/".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "schematic_id" + "\\}",apiInvoker.escape(schematicId))

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
           Some(apiInvoker.deserialize(s, "", classOf[GetUniverseSchematicsSchematicIdOk]).asInstanceOf[GetUniverseSchematicsSchematicIdOk])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
