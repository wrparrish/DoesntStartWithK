package com.ruthlessprogramming.doesntstartwithk.View.ListEvents

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ruthlessprogramming.doesntstartwithk.Model.Event
import com.ruthlessprogramming.doesntstartwithk.Model.requests.EventRequest
import com.ruthlessprogramming.doesntstartwithk.Presenter.list_movies.rec_view.EventAdapter
import com.ruthlessprogramming.doesntstartwithk.R
import java.util.*

/**
 * Created by williamparrish on 11/7/15.
 */

class EventListActivity : AppCompatActivity(){
    val events  = ArrayList<Event>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_event_list)


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
        EventRequest().run()
    }


}
