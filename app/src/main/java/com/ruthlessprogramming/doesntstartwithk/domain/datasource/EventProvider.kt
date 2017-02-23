package com.ruthlessprogramming.doesntstartwithk.domain.datasource


import com.ruthlessprogramming.doesntstartwithk.data.server.EventServer
import com.ruthlessprogramming.doesntstartwithk.domain.model.Event
import com.ruthlessprogramming.doesntstartwithk.firstResult

/**
 * Created by billyparrish on 2/18/17 for DoesntStartWithK.
 */

class EventProvider(val sources: List<EventDataSource> = EventProvider.SOURCES) {

    companion object {
        val SOURCES by lazy { listOf(EventServer()) }
    }

    fun requestEventsByGeoIp(): List<Event>  = requestToSources {
        val res  = it.requestEventsByGeoIp()
        if (res != null ) res else null
    }



    private fun <T : Any> requestToSources(f: (EventDataSource) -> T?): T = sources.firstResult { f(it) }

}