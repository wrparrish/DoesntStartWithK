package com.ruthlessprogramming.doesntstartwithk.ui.rec_view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.ruthlessprogramming.doesntstartwithk.R
import org.jetbrains.anko.find

/**
 * Created by williamparrish on 11/1/15.
 */

class EventViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    var image: ImageView = view.find(R.id.iv_row_movie)
    var title: TextView = view.find(R.id.tv_title_movie)



}