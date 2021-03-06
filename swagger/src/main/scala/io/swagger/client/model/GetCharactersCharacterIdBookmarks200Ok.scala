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

case class GetCharactersCharacterIdBookmarks200Ok (
  /* bookmark_id integer */
  bookmarkId: Long,
  /* create_date string */
  createDate: DateTime,
  /* creator_id integer */
  creatorId: Integer,
  /* folder_id integer */
  folderId: Option[Integer],
  /* memo string */
  memo: String,
  /* note string */
  note: String,
  /* owner_id integer */
  ownerId: Integer,
  target: Option[GetCharactersCharacterIdBookmarksTarget]
)

