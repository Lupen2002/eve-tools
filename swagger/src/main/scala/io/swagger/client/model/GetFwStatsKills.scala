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

case class GetFwStatsKills (
  /* Last week's total number of kills against enemy factions */
  lastWeek: Integer,
  /* Total number of kills against enemy factions since faction warfare began */
  total: Integer,
  /* Yesterday's total number of kills against enemy factions */
  yesterday: Integer
)
