package com.ruthlessprogramming.doesntstartwithk.Model

import retrofit2.Retrofit

/**
 * Created by williamparrish on 4/16/16.
 */
interface SeatGeekService {

    companion object {
        fun create() {
            val baseUrl: String = "https://api.seatgeek.com/2"
            val retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .build();
        }
    }
}