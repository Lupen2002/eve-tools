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

case class GetCharactersCharacterIdLocationOk (
  /* solar_system_id integer */
  solarSystemId: Integer,
  /* station_id integer */
  stationId: Option[Integer],
  /* structure_id integer */
  structureId: Option[Long]
)
