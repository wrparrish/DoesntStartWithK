package com.ruthlessprogramming.doesntstartwithk.View.ListEvents

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.ruthlessprogramming.doesntstartwithk.Model.Event
import com.ruthlessprogramming.doesntstartwithk.Model.EventRequest
import com.ruthlessprogramming.doesntstartwithk.Model.EventResponse
import com.ruthlessprogramming.doesntstartwithk.Model.SeatGeekService
import com.ruthlessprogramming.doesntstartwithk.Presenter.list_movies.rec_view.EventAdapter
import com.ruthlessprogramming.doesntstartwithk.R
import org.jetbrains.anko.async

import java.net.URL
import java.util.*

/**
 * Created by williamparrish on 11/7/15.
 */

class EventListActivity : Activity(){
    private val events : ArrayList<Event>  = ArrayList(10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_event_list)
        Log.d("kotlin",  "onCreateView")
        setupRecView()
        getEventsFromApi()




    }


    fun setupRecView(){
        var response = EventResponse()

        val recyclerView : RecyclerView = findViewById(R.id.rv_movie_list) as RecyclerView

        val layoutManager : LinearLayoutManager = LinearLayoutManager(applicationContext)
        val orientation : Int = LinearLayoutManager.VERTICAL
        layoutManager.orientation = orientation

        val adapter : EventAdapter = EventAdapter(applicationContext, layoutInflater, response)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

    }

    fun getEventsFromApi(){

        val request : EventRequest = EventRequest()
        request.run()


    }


}
