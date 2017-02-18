package com.ruthlessprogramming.doesntstartwithk.Model

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson

/**
 * Created by billyparrish on 2/17/17 for DoesntStartWithK.
 */

data class EventResponse(val meta: EventResponse, val events: List<Event>) {
    class Deserializer : ResponseDeserializable<EventResponse> {
        override fun deserialize(content: String) = Gson().fromJson(content, EventResponse::class.java)
    }
}