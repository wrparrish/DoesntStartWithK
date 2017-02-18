package com.ruthlessprogramming.doesntstartwithk.data.server

import  com.ruthlessprogramming.doesntstartwithk.domain.model.Event as ModelEvent

/**
 * Created by billyparrish on 2/18/17 for DoesntStartWithK.
 */
class ServerDataMapper {

    fun convertEventItemToDomain(event: Event) = with(event) {
       ModelEvent(event.id, event.title, event.url, event.performers.first().image)
    }

    fun convertEventResponseToDomain(result: EventResponse): List<ModelEvent> {
        return result.events.mapIndexed { i, event ->
             convertEventItemToDomain(event)
        }
    }

}