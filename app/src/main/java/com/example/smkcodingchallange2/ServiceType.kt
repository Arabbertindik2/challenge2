package com.example.smkcodingchallange2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceType {
    private var endpoint: TypeEndPoint? = null

    private val BASE_URL = " https://pokeapi.co/api/v2/"

    fun get(): TypeEndPoint {
        if (endpoint == null) {
            var retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            endpoint = retrofit.create(TypeEndPoint::class.java)
        }
        return endpoint!!
    }
}