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

case class GetUniverseStarsStarIdOk (
  /* Age of star in years */
  age: Long,
  /* luminosity number */
  luminosity: Float,
  /* name string */
  name: String,
  /* radius integer */
  radius: Long,
  /* solar_system_id integer */
  solarSystemId: Integer,
  /* spectral_class string */
  spectralClass: String,
  /* temperature integer */
  temperature: Integer,
  /* type_id integer */
  typeId: Integer
)
