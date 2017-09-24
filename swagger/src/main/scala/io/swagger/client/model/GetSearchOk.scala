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

case class GetSearchOk (
  /* agent array */
  agent: Option[List[Integer]],
  /* alliance array */
  alliance: Option[List[Integer]],
  /* character array */
  character: Option[List[Integer]],
  /* constellation array */
  constellation: Option[List[Integer]],
  /* corporation array */
  corporation: Option[List[Integer]],
  /* faction array */
  faction: Option[List[Integer]],
  /* inventorytype array */
  inventorytype: Option[List[Integer]],
  /* region array */
  region: Option[List[Integer]],
  /* solarsystem array */
  solarsystem: Option[List[Integer]],
  /* station array */
  station: Option[List[Integer]],
  /* wormhole array */
  wormhole: Option[List[Integer]]
)

