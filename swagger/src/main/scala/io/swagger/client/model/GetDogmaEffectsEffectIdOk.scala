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

case class GetDogmaEffectsEffectIdOk (
  /* description string */
  description: Option[String],
  /* disallow_auto_repeat boolean */
  disallowAutoRepeat: Option[Boolean],
  /* discharge_attribute_id integer */
  dischargeAttributeId: Option[Integer],
  /* display_name string */
  displayName: Option[String],
  /* duration_attribute_id integer */
  durationAttributeId: Option[Integer],
  /* effect_category integer */
  effectCategory: Option[Integer],
  /* effect_id integer */
  effectId: Integer,
  /* electronic_chance boolean */
  electronicChance: Option[Boolean],
  /* falloff_attribute_id integer */
  falloffAttributeId: Option[Integer],
  /* icon_id integer */
  iconId: Option[Integer],
  /* is_assistance boolean */
  isAssistance: Option[Boolean],
  /* is_offensive boolean */
  isOffensive: Option[Boolean],
  /* is_warp_safe boolean */
  isWarpSafe: Option[Boolean],
  /* modifiers array */
  modifiers: Option[List[GetDogmaEffectsEffectIdModifier]],
  /* name string */
  name: Option[String],
  /* post_expression integer */
  postExpression: Option[Integer],
  /* pre_expression integer */
  preExpression: Option[Integer],
  /* published boolean */
  published: Option[Boolean],
  /* range_attribute_id integer */
  rangeAttributeId: Option[Integer],
  /* range_chance boolean */
  rangeChance: Option[Boolean],
  /* tracking_speed_attribute_id integer */
  trackingSpeedAttributeId: Option[Integer]
)

