package com.ruthlessprogramming.doesntstartwithk.View.ListEvents

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.ruthlessprogramming.doesntstartwithk.Model.Event
import com.ruthlessprogramming.doesntstartwithk.Model.EventRequest
import com.ruthlessprogramming.doesntstartwithk.Presenter.list_movies.rec_view.EventAdapter
import com.ruthlessprogramming.doesntstartwithk.R

import java.net.URL
import java.util.*

/**
 * Created by williamparrish on 11/7/15.
 */

class EventListActivity : Activity(){
    val events : ArrayList<Event>  = ArrayList(10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_event_list)
        Log.d("kotlin",  "onCreateView")
        val event1 : Event  = Event("no url yet" , "max max")
        val event2 : Event  = Event("still no url" , "predator")
        events.add(0, event1)
        events.add(1, event2)
        setupRecView()
        getEventsFromApi()




    }


    fun setupRecView(){

        val recyclerView : RecyclerView = findViewById(R.id.rv_movie_list) as RecyclerView

        val layoutManager : LinearLayoutManager = LinearLayoutManager(applicationContext)
        val orientation : Int = LinearLayoutManager.VERTICAL
        layoutManager.orientation = orientation

        val adapter : EventAdapter = EventAdapter(applicationContext, layoutInflater, events)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

    }

    fun getEventsFromApi(){
        val url  = "http://api.seatgeek.com/2/events?geoip=true"
        val apiRequest : EventRequest = EventRequest(applicationContext ,url)
        apiRequest.run()





    }


}
