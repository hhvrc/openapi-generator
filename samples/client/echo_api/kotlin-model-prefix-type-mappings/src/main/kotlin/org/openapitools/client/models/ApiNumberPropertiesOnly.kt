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
import java.io.IOException


/**
 * 
 *
 * @param number 
 * @param float 
 * @param double 
 */


data class ApiNumberPropertiesOnly (

    @SerializedName("number")
    val number: java.math.BigDecimal? = null,

    @SerializedName("float")
    val float: kotlin.Float? = null,

    @SerializedName("double")
    val double: kotlin.Double? = null

) {


}

