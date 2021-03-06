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

case class GetCharactersCharacterIdCorporationhistory200Ok (
  /* corporation_id integer */
  corporationId: Integer,
  /* True if the corporation has been deleted */
  isDeleted: Option[Boolean],
  /* An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous */
  recordId: Integer,
  /* start_date string */
  startDate: DateTime
)

