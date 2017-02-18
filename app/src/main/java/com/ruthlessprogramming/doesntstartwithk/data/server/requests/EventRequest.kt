package com.ruthlessprogramming.doesntstartwithk.data.server.requests

import android.util.Log
import com.google.gson.Gson
import com.ruthlessprogramming.doesntstartwithk.data.server.EventResponse
import com.ruthlessprogramming.doesntstartwithk.data.server.clientId
import com.ruthlessprogramming.doesntstartwithk.data.server.useGeoIp
import java.net.URL


/**
 * Created by williamparrish on 11/9/15.
 */

class EventRequest  {
    private val TAG = javaClass.simpleName

    companion object {
        private val URL  = "https://api.seatgeek.com/2/events"
        private val COMPLETE_URL = "$URL?client_id=$clientId&geoip=$useGeoIp"
        val gson: Gson = Gson()
    }

    fun execute(): EventResponse {
        val eventJsonString =  URL(COMPLETE_URL).readText()
        Log.d(TAG, eventJsonString)
        return gson.fromJson(eventJsonString, EventResponse::class.java)
    }

}