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

case class GetCharactersCharacterIdChatChannelsMuted (
  /* ID of a muted channel member */
  accessorId: Integer,
  /* accessor_type string */
  accessorType: String,
  /* Time at which this accessor will no longer be muted */
  endAt: Option[DateTime],
  /* Reason this accessor is muted */
  reason: Option[String]
)

