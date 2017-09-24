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

case class GetFwLeaderboardsVictoryPoints (
  /* Top 4 ranking of factions active in faction warfare by total victory points. A faction is considered \"active\" if they have participated in faction warfare in the past 14 days. */
  activeTotal: List[GetFwLeaderboardsActiveTotal1],
  /* Top 4 ranking of factions by victory points in the past week */
  lastWeek: List[GetFwLeaderboardsLastWeek1],
  /* Top 4 ranking of factions by victory points in the past day */
  yesterday: List[GetFwLeaderboardsYesterday1]
)

