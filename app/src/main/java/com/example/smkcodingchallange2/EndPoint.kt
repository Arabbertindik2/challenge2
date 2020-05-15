package com.example.smkcodingchallange2

import okhttp3.Response
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


interface EndPoint {
    @GET("pokemon?limit=10")
    fun doTarget(): Call<Response>
}