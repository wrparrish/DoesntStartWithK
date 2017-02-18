package com.ruthlessprogramming.doesntstartwithk.Model.requests

import android.util.Log
import com.github.kittinunf.fuel.core.Request
import com.github.kittinunf.fuel.httpGet
import com.ruthlessprogramming.doesntstartwithk.Model.EventResponse
import com.ruthlessprogramming.doesntstartwithk.Model.clientId
import com.ruthlessprogramming.doesntstartwithk.Model.useGeoIp


/**
 * Created by williamparrish on 11/9/15.
 */

class EventRequest() {
    private val TAG = javaClass.simpleName

    companion object {

        private val url  = "https://api.seatgeek.com/2/events"
    }

    fun run() :EventResponse {
        val eventRequest =
         url.httpGet(listOf("client_id" to clientId, "geoip" to useGeoIp))
                .responseObject(EventResponse.Deserializer()) { request, response, result ->
                    Log.i(TAG, response.toString())
                    val eventResponse = result.get()
                    val listSize =  eventResponse.events.size

                }


         eventRequest.callback {  }


    }

}