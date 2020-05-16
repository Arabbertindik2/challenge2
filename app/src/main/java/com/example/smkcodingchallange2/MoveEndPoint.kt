package com.example.smkcodingchallange2

import retrofit2.Call
import retrofit2.http.GET

interface MoveEndPoint {
    @GET("move")
    fun doTarget2(): Call<ResponseMove>
}