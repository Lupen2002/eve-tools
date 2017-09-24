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

import java.util.Date

case class GetCorporationsCorporationIdStructures200Ok (
  /* ID of the corporation that owns the structure */
  corporationId: Integer,
  /* This week's vulnerability windows, Monday is day 0 */
  currentVul: List[GetCorporationsCorporationIdStructuresCurrentVul],
  /* Date on which the structure will run out of fuel */
  fuelExpires: Option[Date],
  /* Next week's vulnerability windows, Monday is day 0 */
  nextVul: List[GetCorporationsCorporationIdStructuresNextVul],
  /* The id of the ACL profile for this citadel */
  profileId: Integer,
  /* Contains a list of service upgrades, and their state */
  services: Option[List[GetCorporationsCorporationIdStructuresService]],
  /* Date at which the structure will move to it's next state */
  stateTimerEnd: Option[Date],
  /* Date at which the structure entered it's current state */
  stateTimerStart: Option[Date],
  /* The Item ID of the structure */
  structureId: Long,
  /* The solar system the structure is in */
  systemId: Integer,
  /* The type id of the structure */
  typeId: Integer,
  /* Date at which the structure will unanchor */
  unanchorsAt: Option[Date]
)

