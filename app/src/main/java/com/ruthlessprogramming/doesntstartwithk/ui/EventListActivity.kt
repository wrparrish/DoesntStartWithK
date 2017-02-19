package com.ruthlessprogramming.doesntstartwithk.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ruthlessprogramming.doesntstartwithk.R
import com.ruthlessprogramming.doesntstartwithk.domain.commands.RequestEventsCommand
import com.ruthlessprogramming.doesntstartwithk.ui.rec_view.EventAdapter
import org.jetbrains.anko.async

/**
 * Created by williamparrish on 11/7/15.
 */

class EventListActivity : AppCompatActivity(){
    val TAG = javaClass.simpleName
    val recyclerView by lazy { findViewById(R.id.rv_movie_list) as RecyclerView }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_event_list)
        setupRecView()
        getEventsFromApi()
    }


    fun setupRecView(){
        val layoutManager: LinearLayoutManager = LinearLayoutManager(applicationContext)
        val orientation: Int = LinearLayoutManager.VERTICAL
        layoutManager.orientation = orientation
        recyclerView.layoutManager = layoutManager

    }

    fun getEventsFromApi() {
        async() {
            val result = RequestEventsCommand().execute()
            runOnUiThread {
                val adapter: EventAdapter = EventAdapter(result)
                recyclerView.adapter = adapter
            }
        }
    }
}
