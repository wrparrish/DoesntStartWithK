package com.ruthlessprogramming.doesntstartwithk.domain.model

/**
 * Created by billyparrish on 2/18/17 for DoesntStartWithK.
 */

data class Event(val id: Int, val name: String, val eventUrl: String, val performerImage: String?)

data class EventList(val events:List<Event>)