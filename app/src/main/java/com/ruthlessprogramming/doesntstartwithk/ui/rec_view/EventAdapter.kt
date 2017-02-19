package com.ruthlessprogramming.doesntstartwithk.ui.rec_view

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.ruthlessprogramming.doesntstartwithk.R
import com.ruthlessprogramming.doesntstartwithk.domain.model.Event
import com.ruthlessprogramming.doesntstartwithk.inflate
import com.ruthlessprogramming.doesntstartwithk.loadUrl


/**
 * Created by williamparrish on 11/1/15.
 */


class EventAdapter(val events: List<Event>) : RecyclerView.Adapter<EventViewHolder>() {

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event: Event = events[position]
        holder.title.text = event.name
        val imageUrl =  event.performerImage ?: ""
        holder.image.loadUrl(imageUrl)
    }

    override fun getItemCount(): Int {
        return events.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder? {
        return EventViewHolder(parent.inflate(R.layout.row_event, false))
    }

}