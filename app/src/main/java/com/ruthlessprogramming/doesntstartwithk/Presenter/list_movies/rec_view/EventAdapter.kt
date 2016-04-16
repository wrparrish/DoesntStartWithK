package com.ruthlessprogramming.doesntstartwithk.Presenter.list_movies.rec_view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.ruthlessprogramming.doesntstartwithk.Model.Event
import com.ruthlessprogramming.doesntstartwithk.Model.EventResponse

import com.ruthlessprogramming.doesntstartwithk.R

/**
 * Created by williamparrish on 11/1/15.
 */


class EventAdapter(val context: Context, val inflater: LayoutInflater, val response : EventResponse?) : RecyclerView.Adapter<EventViewHolder>(){


    override fun onBindViewHolder(holder: EventViewHolder?, position: Int) {




    }

    override fun getItemCount(): Int {
        return response?.events?.size as Int
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): EventViewHolder? {
        return EventViewHolder(inflater.inflate(R.layout.row_movie, parent, false))
    }


}