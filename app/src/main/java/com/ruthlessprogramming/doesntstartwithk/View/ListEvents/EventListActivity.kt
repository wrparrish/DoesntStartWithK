package com.ruthlessprogramming.doesntstartwithk.View.ListEvents

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.ruthlessprogramming.doesntstartwithk.Model.Event
import com.ruthlessprogramming.doesntstartwithk.Presenter.list_movies.rec_view.EventAdapter
import com.ruthlessprogramming.doesntstartwithk.R
import kotlinx.android.synthetic.screen_movie_list.*
import org.jetbrains.anko.find
import java.util.*

/**
 * Created by williamparrish on 11/7/15.
 */

class EventListActivity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_event_list)
        Log.d("kotlin",  "onCreateView")
        val movies : ArrayList<Event> = ArrayList(5)
        val movie1 : Event  = Event("no url yet" , "max max")
        val movie2 : Event  = Event("still no url" , "predator")
        movies.add(0, movie1)
        movies.add(1, movie2)

        val recyclerView : RecyclerView = find(R.id.rv_movie_list)

        val layoutManager : LinearLayoutManager = LinearLayoutManager(applicationContext)
        val orientation : Int = LinearLayoutManager.VERTICAL
        layoutManager.orientation = orientation

        val adapter : EventAdapter = EventAdapter(applicationContext, layoutInflater, movies)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter


    }


}
