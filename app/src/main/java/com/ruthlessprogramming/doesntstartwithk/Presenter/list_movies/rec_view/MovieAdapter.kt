package com.ruthlessprogramming.doesntstartwithk.Presenter.list_movies.rec_view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.ruthlessprogramming.doesntstartwithk.Model.Movie

import com.ruthlessprogramming.doesntstartwithk.R

/**
 * Created by williamparrish on 11/1/15.
 */


class MovieAdapter(val context: Context, val inflater: LayoutInflater, val movies : List<Movie>) : RecyclerView.Adapter<MovieViewHolder>(){


    override fun onBindViewHolder(holder: MovieViewHolder?, position: Int) {
        throw UnsupportedOperationException()
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MovieViewHolder? {
        return MovieViewHolder(inflater.inflate(R.layout.row_movie, parent, false))
    }


}