package com.ruthlessprogramming.doesntstartwithk.Model

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.github.kittinunf.fuel.android.extension.responseJson
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result

import org.jetbrains.anko.async
import org.jetbrains.anko.uiThread
import org.json.JSONArray
import org.json.JSONObject
import java.net.URL


/**
 * Created by williamparrish on 11/9/15.
 */

class EventRequest(val context: Context,val url :String){
    private val TAG = javaClass.simpleName

    fun run(){



        async() {

          url.httpGet().responseJson { request, response, either ->
                //do something with response
                when (either) {
                    is Result.Failure -> Log.e(javaClass.simpleName , response.toString())


                    is Result.Success -> {
                        Log.d(javaClass.simpleName, response.toString())

                    }

                }
            }

            uiThread { Toast.makeText(context, "Request performed", Toast.LENGTH_LONG).show() }
        }


        async() {
            val jsonResponseString = URL(url).readText()
            Log.d(TAG , jsonResponseString)

            val jsonObject = JSONObject(jsonResponseString)
            Log.d(TAG , jsonObject.toString())

            val jsonArray :JSONArray  = jsonObject.getJSONArray("events")
            Log.d("array length" ,"" + jsonArray.length())

            for (i: Int in 0..jsonArray.length()-1){
                Log.d("title from event objects: "  , "" +  jsonArray.get(i).toString())
            }




            uiThread {Toast.makeText(context, "url opened", Toast.LENGTH_LONG).show()    }
        }

    }
}