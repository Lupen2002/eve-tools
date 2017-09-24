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

case class GetCharactersCharacterIdSkillqueue200Ok (
  /* finish_date string */
  finishDate: Option[DateTime],
  /* finished_level integer */
  finishedLevel: Integer,
  /* level_end_sp integer */
  levelEndSp: Option[Integer],
  /* Amount of SP that was in the skill when it started training it's current level. Used to calculate % of current level complete. */
  levelStartSp: Option[Integer],
  /* queue_position integer */
  queuePosition: Integer,
  /* skill_id integer */
  skillId: Integer,
  /* start_date string */
  startDate: Option[DateTime],
  /* training_start_sp integer */
  trainingStartSp: Option[Integer]
)

