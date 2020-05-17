package com.example.smkcodingchallange2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MoveDetailRequest {
    private var endpoint: EndPointMoveDetail? = null

    private val BASE_URL = " https://pokeapi.co/api/v2/"

    fun get(): EndPointMoveDetail {
        if (endpoint == null) {
            var retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            endpoint = retrofit.create(EndPointMoveDetail::class.java)
        }
        return endpoint!!
    }
}