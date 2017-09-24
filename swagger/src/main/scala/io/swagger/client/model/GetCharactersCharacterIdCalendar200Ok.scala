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

case class GetCharactersCharacterIdCalendar200Ok (
  /* event_date string */
  eventDate: Option[DateTime],
  /* event_id integer */
  eventId: Option[Integer],
  /* event_response string */
  eventResponse: Option[String],
  /* importance integer */
  importance: Option[Integer],
  /* title string */
  title: Option[String]
)

