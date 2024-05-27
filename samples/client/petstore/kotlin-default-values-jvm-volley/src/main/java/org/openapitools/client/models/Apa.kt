/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.google.gson.annotations.SerializedName
import org.openapitools.client.models.room.ApaRoomModel
import org.openapitools.client.infrastructure.ITransformForStorage
import java.io.IOException


/**
 * 
 *
 * @param i0 
 * @param n0 
 * @param i1 
 * @param n1 
 */


data class Apa (

    @SerializedName("i0")
    val i0: kotlin.Int,

    @SerializedName("n0")
    val n0: java.math.BigDecimal,

    @SerializedName("i1")
    val i1: kotlin.Int? = null,

    @SerializedName("n1")
    val n1: java.math.BigDecimal? = null

): ITransformForStorage<ApaRoomModel> {
    companion object { }
    override fun toRoomModel(): ApaRoomModel =
        ApaRoomModel(roomTableId = 0,
        i0 = this.i0,
n0 = this.n0,
i1 = this.i1,
n1 = this.n1,
        )


}

