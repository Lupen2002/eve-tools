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

case class GetCorporationsCorporationIdRoles200Ok (
  /* character_id integer */
  characterId: Integer,
  /* grantable_roles array */
  grantableRoles: Option[List[String]],
  /* grantable_roles_at_base array */
  grantableRolesAtBase: Option[List[String]],
  /* grantable_roles_at_hq array */
  grantableRolesAtHq: Option[List[String]],
  /* grantable_roles_at_other array */
  grantableRolesAtOther: Option[List[String]],
  /* roles array */
  roles: Option[List[String]],
  /* roles_at_base array */
  rolesAtBase: Option[List[String]],
  /* roles_at_hq array */
  rolesAtHq: Option[List[String]],
  /* roles_at_other array */
  rolesAtOther: Option[List[String]]
)
