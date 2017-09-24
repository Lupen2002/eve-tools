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

case class GetUniverseStationsStationIdOk (
  /* max_dockable_ship_volume number */
  maxDockableShipVolume: Float,
  /* name string */
  name: String,
  /* office_rental_cost number */
  officeRentalCost: Float,
  /* ID of the corporation that controls this station */
  owner: Option[Integer],
  position: Option[GetUniverseStationsStationIdPosition],
  /* race_id integer */
  raceId: Option[Integer],
  /* reprocessing_efficiency number */
  reprocessingEfficiency: Float,
  /* reprocessing_stations_take number */
  reprocessingStationsTake: Float,
  /* services array */
  services: List[String],
  /* station_id integer */
  stationId: Integer,
  /* The solar system this station is in */
  systemId: Integer,
  /* type_id integer */
  typeId: Integer
)
