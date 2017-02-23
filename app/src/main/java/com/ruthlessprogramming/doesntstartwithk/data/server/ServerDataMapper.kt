package com.ruthlessprogramming.doesntstartwithk.data.server

import com.ruthlessprogramming.doesntstartwithk.domain.model.Event as ModelEvent

/**
 * Created by billyparrish on 2/18/17 for DoesntStartWithK.
 */
class ServerDataMapper {

    fun convertEventItemToDomain(event: Event) = with(event) {
       ModelEvent(event.id, event.title, event.url, retrievePerformerImage(event.performers))
    }

    private fun retrievePerformerImage(performers: List<Performer>): String? {
        var nonEmptyResult = ""
        performers
                .filterNot { it.images.huge.isNullOrEmpty() }
                .map { nonEmptyResult = it.images.huge }

        return nonEmptyResult
    }

    fun convertEventResponseToDomain(result: EventResponse): List<ModelEvent>  =
       result.events.map { event ->
           convertEventItemToDomain(event)
       }

}