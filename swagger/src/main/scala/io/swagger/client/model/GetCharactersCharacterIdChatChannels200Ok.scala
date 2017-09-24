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

case class GetCharactersCharacterIdChatChannels200Ok (
  /* allowed array */
  allowed: List[GetCharactersCharacterIdChatChannelsAllowed],
  /* blocked array */
  blocked: List[GetCharactersCharacterIdChatChannelsBlocked],
  /* Unique channel ID. Always negative for player-created channels. Permanent (CCP created) channels have a positive ID, but don't appear in the API */
  channelId: Integer,
  /* Normalized, unique string used to compare channel names */
  comparisonKey: String,
  /* Whether this is a password protected channel */
  hasPassword: Boolean,
  /* Message of the day for this channel */
  motd: String,
  /* muted array */
  muted: List[GetCharactersCharacterIdChatChannelsMuted],
  /* Displayed name of channel */
  name: String,
  /* operators array */
  operators: List[GetCharactersCharacterIdChatChannelsOperator],
  /* owner_id integer */
  ownerId: Integer
)

