package com.ruthlessprogramming.doesntstartwithk.domain.datasource

import com.ruthlessprogramming.doesntstartwithk.data.server.EventServer
import com.ruthlessprogramming.doesntstartwithk.domain.model.Event

/**
 * Created by billyparrish on 2/18/17 for DoesntStartWithK.
 */

class EventProvider {

    companion object {
        val SOURCES by lazy { listOf(EventServer()) }
    }

    fun requestEventsByGeoIp(): List<Event>  {
        return SOURCES.first().requestEventsByGeoIp()
    }

}