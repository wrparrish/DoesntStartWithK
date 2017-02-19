package com.ruthlessprogramming.doesntstartwithk.data.server

import com.ruthlessprogramming.doesntstartwithk.data.server.requests.EventRequest
import com.ruthlessprogramming.doesntstartwithk.domain.datasource.EventDataSource
import com.ruthlessprogramming.doesntstartwithk.domain.model.Event

/**
 * Created by billyparrish on 2/18/17 for DoesntStartWithK.
 */

class EventServer(val dataMapper: ServerDataMapper = ServerDataMapper()) : EventDataSource {

    override fun requestEventsByGeoIp(): List<Event> {
        val result = EventRequest().execute()
        return dataMapper.convertEventResponseToDomain(result)
    }

    override fun requestEventById(id: Int): Event? {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}