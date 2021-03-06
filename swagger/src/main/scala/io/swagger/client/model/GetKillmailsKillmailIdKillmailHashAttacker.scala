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

case class GetKillmailsKillmailIdKillmailHashAttacker (
  /* alliance_id integer */
  allianceId: Option[Integer],
  /* character_id integer */
  characterId: Option[Integer],
  /* corporation_id integer */
  corporationId: Option[Integer],
  /* damage_done integer */
  damageDone: Integer,
  /* faction_id integer */
  factionId: Option[Integer],
  /* Was the attacker the one to achieve the final blow  */
  finalBlow: Boolean,
  /* Security status for the attacker  */
  securityStatus: Float,
  /* What ship was the attacker flying  */
  shipTypeId: Option[Integer],
  /* What weapon was used by the attacker for the kill  */
  weaponTypeId: Option[Integer]
)

