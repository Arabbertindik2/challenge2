package com.example.smkcodingchallange2

import retrofit2.Call
import retrofit2.http.GET

interface MoveEndPoint {
    @GET("ability")
    fun doTarget2(): Call<ResponseMove>
}