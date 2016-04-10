package com.ruthlessprogramming.doesntstartwithk.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Billy on 4/10/2016.
 */
class Location {

    /**
     * @return The lat
     */
    /**
     * @param lat The lat
     */
    @SerializedName("lat")
    @Expose
    var lat: Double? = null
    /**
     * @return The lon
     */
    /**
     * @param lon The lon
     */
    @SerializedName("lon")
    @Expose
    var lon: Double? = null

}