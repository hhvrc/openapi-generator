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


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.IOException


/**
 * A category for a pet
 *
 * @param id 
 * @param name 
 */
@Parcelize
@Serializable

data class Category (

    @SerialName(value = "id")
    val id: kotlin.Long? = null,

    @SerialName(value = "name")
    val name: kotlin.String? = null

) : Parcelable {


}

