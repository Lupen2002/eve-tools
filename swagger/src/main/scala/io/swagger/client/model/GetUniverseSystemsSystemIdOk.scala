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

case class GetUniverseSystemsSystemIdOk (
  /* The constellation this solar system is in */
  constellationId: Integer,
  /* name string */
  name: String,
  /* planets array */
  planets: List[GetUniverseSystemsSystemIdPlanet],
  position: Option[GetUniverseSystemsSystemIdPosition],
  /* security_class string */
  securityClass: Option[String],
  /* security_status number */
  securityStatus: Float,
  /* star_id integer */
  starId: Integer,
  /* stargates array */
  stargates: List[Integer],
  /* system_id integer */
  systemId: Integer
)

