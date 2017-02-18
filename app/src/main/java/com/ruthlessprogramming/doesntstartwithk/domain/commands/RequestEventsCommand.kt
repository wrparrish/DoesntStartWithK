package com.ruthlessprogramming.doesntstartwithk.domain.commands

import com.ruthlessprogramming.doesntstartwithk.domain.datasource.EventProvider
import com.ruthlessprogramming.doesntstartwithk.domain.model.Event

/**
 * Created by billyparrish on 2/18/17 for DoesntStartWithK.
 */

class RequestEventsCommand(val eventProvider: EventProvider = EventProvider()) :Command<List<Event>> {
    override fun execute() = eventProvider.requestEventsByGeoIp()
}
