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

case class GetCharactersCharacterIdIndustryJobs200Ok (
  /* Job activity ID */
  activityId: Integer,
  /* blueprint_id integer */
  blueprintId: Long,
  /* Location ID of the location from which the blueprint was installed. Normally a station ID, but can also be an asset (e.g. container) or corporation facility */
  blueprintLocationId: Long,
  /* blueprint_type_id integer */
  blueprintTypeId: Integer,
  /* ID of the character which completed this job */
  completedCharacterId: Option[Integer],
  /* Date and time when this job was completed */
  completedDate: Option[DateTime],
  /* The sume of job installation fee and industry facility tax */
  cost: Option[Float],
  /* Job duration in seconds */
  duration: Integer,
  /* Date and time when this job finished */
  endDate: DateTime,
  /* ID of the facility where this job is running */
  facilityId: Long,
  /* ID of the character which installed this job */
  installerId: Integer,
  /* Unique job ID */
  jobId: Integer,
  /* Number of runs blueprint is licensed for */
  licensedRuns: Option[Integer],
  /* Location ID of the location to which the output of the job will be delivered. Normally a station ID, but can also be a corporation facility */
  outputLocationId: Long,
  /* Date and time when this job was paused (i.e. time when the facility where this job was installed went offline) */
  pauseDate: Option[DateTime],
  /* Chance of success for invention */
  probability: Option[Float],
  /* Type ID of product (manufactured, copied or invented) */
  productTypeId: Option[Integer],
  /* Number of runs for a manufacturing job, or number of copies to make for a blueprint copy */
  runs: Integer,
  /* Date and time when this job started */
  startDate: DateTime,
  /* ID of the station where industry facility is located */
  stationId: Long,
  /* status string */
  status: String,
  /* Number of successful runs for this job. Equal to runs unless this is an invention job */
  successfulRuns: Option[Integer]
)

