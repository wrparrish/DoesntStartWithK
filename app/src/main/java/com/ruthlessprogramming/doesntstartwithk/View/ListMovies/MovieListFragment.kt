package com.ruthlessprogramming.doesntstartwithk.View.ListMovies

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ruthlessprogramming.doesntstartwithk.R
import kotlinx.android.synthetic.screen_movie_list.*

/**
 * Created by williamparrish on 11/7/15.
 */

class MovieListFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         val view : View? = inflater?.inflate(R.layout.screen_movie_list, container, false);

        val layoutManager : LinearLayoutManager = LinearLayoutManager(context)
        val orientation : Int = LinearLayoutManager.VERTICAL
        layoutManager.orientation = orientation

        return view;
    }
}
