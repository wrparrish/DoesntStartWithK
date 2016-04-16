package com.ruthlessprogramming.doesntstartwithk.Model

import android.util.Base64
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import rx.Observable
import java.io.IOException

/**
 * Created by williamparrish on 4/16/16.
 */
interface  SeatGeekService {

    @GET ("events/?geoip=true")
    fun getEvents() : Observable<EventResponse>


    companion object {

        fun create() : SeatGeekService {

            val id: String = "MzM5NDk3MHwxNDYwODMxODg3"
            val secret: String = "kohpiOjV2LcPqCvgLwG95yNF6Zm26Au29bLx7KXH"
            val credentials: String = id + ":" + secret
            val basic: String = "Basic " + Base64.encodeToString(credentials.toByteArray(), Base64.NO_WRAP)

            val baseUrl: String = "https://api.seatgeek.com/2/"
            val httpClient: OkHttpClient = OkHttpClient().newBuilder()
                    .addInterceptor {
                        val r = it.request()
                        val request = r.newBuilder()
                                .addHeader("Authorization", basic)
                                .build()
                        it.proceed(request)
                    }
                    .build()


            val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .baseUrl(baseUrl)
                    .client(httpClient)
                    .build();

            return retrofit.create(SeatGeekService::class.java)


        }

        }
    }
