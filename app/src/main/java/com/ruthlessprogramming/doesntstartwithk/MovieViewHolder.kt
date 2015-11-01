package com.ruthlessprogramming.doesntstartwithk

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.find
import kotlinx.android.synthetic.row_movie.*
/**
 * Created by williamparrish on 11/1/15.
 */

class MovieViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    var image: ImageView? = null
    var title: TextView? = null




}