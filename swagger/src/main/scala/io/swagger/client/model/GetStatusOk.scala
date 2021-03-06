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

case class GetStatusOk (
  /* Current online player count */
  players: Integer,
  /* Running version as string */
  serverVersion: String,
  /* Server start timestamp */
  startTime: DateTime,
  /* If the server is in VIP mode */
  vip: Option[Boolean]
)

