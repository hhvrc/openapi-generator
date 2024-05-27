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


import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import java.io.IOException


/**
 * A User who is purchasing from the pet store
 *
 * @param id 
 * @param username 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param password 
 * @param phone 
 * @param userStatus User Status
 */


data class User (

    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("username")
    val username: kotlin.String? = null,

    @field:JsonProperty("firstName")
    val firstName: kotlin.String? = null,

    @field:JsonProperty("lastName")
    val lastName: kotlin.String? = null,

    @field:JsonProperty("email")
    val email: kotlin.String? = null,

    @field:JsonProperty("password")
    val password: kotlin.String? = null,

    @field:JsonProperty("phone")
    val phone: kotlin.String? = null,

    /* User Status */
    @field:JsonProperty("userStatus")
    val userStatus: kotlin.Int? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }


}

