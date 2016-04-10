package com.ruthlessprogramming.doesntstartwithk.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by Billy on 4/10/2016.
 */
internal class Event {

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
     * @return The id
     */
    /**
     * @param id The id
     */
    @SerializedName("id")
    @Expose
    var id: Int? = null
    /**
     * @return The stats
     */
    /**
     * @param stats The stats
     */
    @SerializedName("stats")
    @Expose
    var stats: Stats? = null
    /**
     * @return The title
     */
    /**
     * @param title The title
     */
    @SerializedName("title")
    @Expose
    var title: String? = null
    /**
     * @return The announceDate
     */
    /**
     * @param announceDate The announce_date
     */
    @SerializedName("announce_date")
    @Expose
    var announceDate: String? = null
    /**
     * @return The score
     */
    /**
     * @param score The score
     */
    @SerializedName("score")
    @Expose
    var score: Double? = null
    /**
     * @return The dateTbd
     */
    /**
     * @param dateTbd The date_tbd
     */
    @SerializedName("date_tbd")
    @Expose
    var dateTbd: Boolean? = null
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
     * @return The datetimeLocal
     */
    /**
     * @param datetimeLocal The datetime_local
     */
    @SerializedName("datetime_local")
    @Expose
    var datetimeLocal: String? = null
    /**
     * @return The visibleUntilUtc
     */
    /**
     * @param visibleUntilUtc The visible_until_utc
     */
    @SerializedName("visible_until_utc")
    @Expose
    var visibleUntilUtc: String? = null
    /**
     * @return The timeTbd
     */
    /**
     * @param timeTbd The time_tbd
     */
    @SerializedName("time_tbd")
    @Expose
    var timeTbd: Boolean? = null
    /**
     * @return The taxonomies
     */
    /**
     * @param taxonomies The taxonomies
     */
    @SerializedName("taxonomies")
    @Expose
    var taxonomies: List<Taxonomy> = ArrayList()
    /**
     * @return The performers
     */
    /**
     * @param performers The performers
     */
    @SerializedName("performers")
    @Expose
    var performers: List<Performer> = ArrayList()
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
     * @return The createdAt
     */
    /**
     * @param createdAt The created_at
     */
    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null
    /**
     * @return The venue
     */
    /**
     * @param venue The venue
     */
    @SerializedName("venue")
    @Expose
    var venue: Venue? = null
    /**
     * @return The shortTitle
     */
    /**
     * @param shortTitle The short_title
     */
    @SerializedName("short_title")
    @Expose
    var shortTitle: String? = null
    /**
     * @return The datetimeUtc
     */
    /**
     * @param datetimeUtc The datetime_utc
     */
    @SerializedName("datetime_utc")
    @Expose
    var datetimeUtc: String? = null
    /**
     * @return The datetimeTbd
     */
    /**
     * @param datetimeTbd The datetime_tbd
     */
    @SerializedName("datetime_tbd")
    @Expose
    var datetimeTbd: Boolean? = null
    /**
     * @return The generalAdmission
     */
    /**
     * @param generalAdmission The general_admission
     */
    @SerializedName("general_admission")
    @Expose
    var generalAdmission: Boolean? = null

}