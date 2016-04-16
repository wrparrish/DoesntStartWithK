package com.ruthlessprogramming.doesntstartwithk.Model

/**
 * Created by Billy on 4/10/2016.
 */
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.ArrayList

class Venue {

    /**
     * @return The city
     */
    /**
     * @param city The city
     */
    @SerializedName("city")
    @Expose
    var city: String? = null
    /**
     * @return The name
     */
    /**
     * @param name The name
     */
    @SerializedName("name")
    @Expose
    var name: String? = null
    /**
     * @return The extendedAddress
     */
    /**
     * @param extendedAddress The extended_address
     */
    @SerializedName("extended_address")
    @Expose
    var extendedAddress: String? = null
    /**
     * @return The url
     */
    /**
     * @param url The url
     */
    @SerializedName("url")
    @Expose
    var url: String? = null
    /**
     * @return The country
     */
    /**
     * @param country The country
     */
    @SerializedName("country")
    @Expose
    var country: String? = null
    /**
     * @return The displayLocation
     */
    /**
     * @param displayLocation The display_location
     */
    @SerializedName("display_location")
    @Expose
    var displayLocation: String? = null
    /**
     * @return The links
     */
    /**
     * @param links The links
     */
    @SerializedName("links")
    @Expose
    var links: List<Any> = ArrayList()
    /**
     * @return The slug
     */
    /**
     * @param slug The slug
     */
    @SerializedName("slug")
    @Expose
    var slug: String? = null
    /**
     * @return The state
     */
    /**
     * @param state The state
     */
    @SerializedName("state")
    @Expose
    var state: String? = null
    /**
     * @return The score
     */
    /**
     * @param score The score
     */
    @SerializedName("score")
    @Expose
    var score: Float? = null
    /**
     * @return The postalCode
     */
    /**
     * @param postalCode The postal_code
     */
    @SerializedName("postal_code")
    @Expose
    var postalCode: String? = null
    /**
     * @return The location
     */
    /**
     * @param location The location
     */
    @SerializedName("location")
    @Expose
    var location: Location? = null
    /**
     * @return The address
     */
    /**
     * @param address The address
     */
    @SerializedName("address")
    @Expose
    var address: String? = null
    /**
     * @return The timezone
     */
    /**
     * @param timezone The timezone
     */
    @SerializedName("timezone")
    @Expose
    var timezone: String? = null
    /**
     * @return The id
     */
    /**
     * @param id The id
     */
    @SerializedName("id")
    @Expose
    var id: Int? = null

}