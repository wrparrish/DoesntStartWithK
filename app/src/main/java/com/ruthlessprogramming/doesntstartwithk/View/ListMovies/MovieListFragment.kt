package com.ruthlessprogramming.doesntstartwithk.View.ListMovies

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ruthlessprogramming.doesntstartwithk.Model.Movie
import com.ruthlessprogramming.doesntstartwithk.Presenter.list_movies.rec_view.MovieAdapter
import com.ruthlessprogramming.doesntstartwithk.R
import kotlinx.android.synthetic.screen_movie_list.*
import java.util.*

/**
 * Created by williamparrish on 11/7/15.
 */

class MovieListFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         val view : View? = inflater?.inflate(R.layout.screen_movie_list, container, false);

        val movies : ArrayList<Movie> = ArrayList(5)
        val movie1 : Movie  = Movie("no url yet" , "max max")
        val movie2 : Movie  = Movie("still no url" , "predator")
        movies.add(0, movie1)
        movies.add(1, movie2)

        val layoutManager : LinearLayoutManager = LinearLayoutManager(context)
        val orientation : Int = LinearLayoutManager.VERTICAL
        layoutManager.orientation = orientation

        val adapter : MovieAdapter = MovieAdapter(getContext(), inflater as LayoutInflater, movies )
        rv_movie_list.layoutManager = layoutManager
        rv_movie_list.adapter = adapter

        return view;
    }
}
