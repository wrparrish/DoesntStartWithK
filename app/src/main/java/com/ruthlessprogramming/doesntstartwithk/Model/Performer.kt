package com.ruthlessprogramming.doesntstartwithk.Model

/**
 * Created by Billy on 4/10/2016.
 */
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.util.ArrayList

class Performer {

    /**
     * @return The stats
     */
    /**
     * @param stats The stats
     */
    @SerializedName("stats")
    @Expose
    var stats: Stats_? = null
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
     * @return The shortName
     */
    /**
     * @param shortName The short_name
     */
    @SerializedName("short_name")
    @Expose
    var shortName: String? = null
    /**
     * @return The divisions
     */
    /**
     * @param divisions The divisions
     */
    @SerializedName("divisions")
    @Expose
    var divisions: Any? = null
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
     * @return The type
     */
    /**
     * @param type The type
     */
    @SerializedName("type")
    @Expose
    var type: String? = null
    /**
     * @return The image
     */
    /**
     * @param image The image
     */
    @SerializedName("image")
    @Expose
    var image: Any? = null
    /**
     * @return The homeVenueId
     */
    /**
     * @param homeVenueId The home_venue_id
     */
    @SerializedName("home_venue_id")
    @Expose
    var homeVenueId: Any? = null
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
     * @return The score
     */
    /**
     * @param score The score
     */
    @SerializedName("score")
    @Expose
    var score: Int? = null
    /**
     * @return The images
     */
    /**
     * @param images The images
     */
    @SerializedName("images")
    @Expose
    var images: Images? = null
    /**
     * @return The taxonomies
     */
    /**
     * @param taxonomies The taxonomies
     */
    @SerializedName("taxonomies")
    @Expose
    var taxonomies: List<Taxonomy_> = ArrayList()
    /**
     * @return The hasUpcomingEvents
     */
    /**
     * @param hasUpcomingEvents The has_upcoming_events
     */
    @SerializedName("has_upcoming_events")
    @Expose
    var hasUpcomingEvents: Boolean? = null
    /**
     * @return The id
     */
    /**
     * @param id The id
     */
    @SerializedName("id")
    @Expose
    var id: Int? = null
    /**
     * @return The primary
     */
    /**
     * @param primary The primary
     */
    @SerializedName("primary")
    @Expose
    var primary: Boolean? = null

}
