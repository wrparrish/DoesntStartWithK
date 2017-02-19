package com.ruthlessprogramming.doesntstartwithk.data.db

import com.ruthlessprogramming.doesntstartwithk.data.server.ServerDataMapper
import com.ruthlessprogramming.doesntstartwithk.domain.datasource.EventDataSource
import com.ruthlessprogramming.doesntstartwithk.domain.model.Event

/**
 * Created by billyparrish on 2/18/17 for DoesntStartWithK.
 */
class EventDb(val dataMapper: ServerDataMapper = ServerDataMapper()) : EventDataSource {
    override fun requestEventsByGeoIp(): List<Event>? {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun requestEventById(id: Int): Event? {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}