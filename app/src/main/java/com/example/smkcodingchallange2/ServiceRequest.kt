package com.example.smkcodingchallange2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ServiceRequest {
    private var endpoint: EndPoint? = null

    private val BASE_URL = " https://pokeapi.co/api/v2/"

    fun get(): EndPoint {
        if (endpoint == null) {
            var retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            endpoint = retrofit.create(EndPoint::class.java)
        }
        return endpoint!!
    }
}