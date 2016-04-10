package com.ruthlessprogramming.doesntstartwithk.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by Billy on 4/10/2016.
 */
class EventResponse {

    /**

     * @return
     * * The meta
     */
    /**

     * @param response
     * * The meta
     */
    @SerializedName("meta")
    @Expose
    var response: EventResponse? = null
    /**

     * @return
     * * The events
     */
    /**

     * @param events
     * * The events
     */
    @SerializedName("events")
    @Expose
    internal var events: List<Event> = ArrayList()

}