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

case class GetFwSystems200Ok (
  /* contested boolean */
  contested: Boolean,
  /* occupier_faction_id integer */
  occupierFactionId: Integer,
  /* owner_faction_id integer */
  ownerFactionId: Integer,
  /* solar_system_id integer */
  solarSystemId: Integer,
  /* victory_points integer */
  victoryPoints: Integer,
  /* victory_points_threshold integer */
  victoryPointsThreshold: Integer
)
