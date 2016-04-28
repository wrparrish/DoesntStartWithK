package com.ruthlessprogramming.doesntstartwithk.Model

import android.util.Log
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


/**
 * Created by williamparrish on 11/9/15.
 */

class EventRequest() {
    private val TAG = javaClass.simpleName
    private var api = SeatGeekService.create()

    fun run() {

        api.getEvents()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ eventResponse ->
                    Log.d(TAG, "size of list: ${eventResponse.events.size}")
                    eventResponse.events.asIterable().forEach { Log.e(TAG, it.title + " : [" + it.venue?.name + "]" ) }
                })

    }
}