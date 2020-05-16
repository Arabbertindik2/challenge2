package com.example.smkcodingchallange2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MoveRequest {
    private var endpoint: MoveEndPoint?= null

    private val Base_Url = "https://pokeapi.co/api/v2/"
    
    fun getmove(): MoveEndPoint {
        if (endpoint == null) {
            var retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Base_Url)
                .build()

            endpoint = retrofit.create(MoveEndPoint::class.java)
        }
        return endpoint!!
    }
}