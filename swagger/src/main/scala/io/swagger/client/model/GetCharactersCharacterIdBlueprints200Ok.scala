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

case class GetCharactersCharacterIdBlueprints200Ok (
  /* Unique ID for this item. The ID of an item is stable if that item is not repackaged, stacked, detached from a stack, assembled, or otherwise altered. If an item is changed in one of these ways, then the ID will also change (see notes below). */
  itemId: Long,
  /* Indicates something about this item's storage location. The flag is used to differentiate between hangar divisions, drone bay, fitting location, and similar. */
  locationFlag: String,
  /* References a solar system, station or itemID if this blueprint is located within a container. If an itemID the Character - AssetList API must be queried to find the container using the itemID, from which the correct location of the Blueprint can be derived. */
  locationId: Long,
  /* Material Efficiency Level of the blueprint, can be any integer between 0 and 10. */
  materialEfficiency: Integer,
  /* Typically will be -1 or -2 designating a singleton item, where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (no activities performed on them yet). */
  quantity: Integer,
  /* Number of runs remaining if the blueprint is a copy, -1 if it is an original. */
  runs: Integer,
  /* Time Efficiency Level of the blueprint, can be any even integer between 0 and 20. */
  timeEfficiency: Integer,
  /* type_id integer */
  typeId: Integer
)
