package com.ruthlessprogramming.doesntstartwithk.domain.datasource

import com.ruthlessprogramming.doesntstartwithk.domain.model.Event

/**
 * Created by billyparrish on 2/18/17 for DoesntStartWithK.
 */

interface EventDataSource {

    fun requestEventsByGeoIp():  List<Event>?

    fun requestEventById(id: Int): Event?

}