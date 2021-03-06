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

case class GetKillmailsKillmailIdKillmailHashOk (
  /* attackers array */
  attackers: List[GetKillmailsKillmailIdKillmailHashAttacker],
  /* ID of the killmail */
  killmailId: Integer,
  /* Time that the victim was killed and the killmail generated  */
  killmailTime: DateTime,
  /* Moon if the kill took place at one */
  moonId: Option[Integer],
  /* Solar system that the kill took place in  */
  solarSystemId: Integer,
  victim: Option[GetKillmailsKillmailIdKillmailHashVictim],
  /* War if the killmail is generated in relation to an official war  */
  warId: Option[Integer]
)

