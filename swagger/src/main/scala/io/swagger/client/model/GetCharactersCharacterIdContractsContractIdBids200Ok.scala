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

case class GetCharactersCharacterIdContractsContractIdBids200Ok (
  /* The ammount bid */
  amount: Float,
  /* Unique ID for the bid */
  bidId: Integer,
  /* Character ID of the bidder */
  bidderId: Integer,
  /* Datetime when the bid was placed */
  dateBid: DateTime
)

