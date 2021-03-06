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

package io.swagger.client.model

import org.joda.time.DateTime

case class GetCharactersCharacterIdPlanetsPlanetIdPin (
  /* contents array */
  contents: Option[List[GetCharactersCharacterIdPlanetsPlanetIdContent]],
  /* expiry_time string */
  expiryTime: Option[DateTime],
  extractorDetails: Option[GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails],
  factoryDetails: Option[GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails],
  /* install_time string */
  installTime: Option[DateTime],
  /* last_cycle_start string */
  lastCycleStart: Option[DateTime],
  /* latitude number */
  latitude: Float,
  /* longitude number */
  longitude: Float,
  /* pin_id integer */
  pinId: Long,
  /* schematic_id integer */
  schematicId: Option[Integer],
  /* type_id integer */
  typeId: Integer
)

