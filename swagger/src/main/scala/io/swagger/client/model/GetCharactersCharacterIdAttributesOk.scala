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

case class GetCharactersCharacterIdAttributesOk (
  /* Neural remapping cooldown after a character uses remap accrued over time */
  accruedRemapCooldownDate: Option[DateTime],
  /* Number of available bonus character neural remaps */
  bonusRemaps: Option[Integer],
  /* charisma integer */
  charisma: Integer,
  /* intelligence integer */
  intelligence: Integer,
  /* Datetime of last neural remap, including usage of bonus remaps */
  lastRemapDate: Option[DateTime],
  /* memory integer */
  memory: Integer,
  /* perception integer */
  perception: Integer,
  /* willpower integer */
  willpower: Integer
)

