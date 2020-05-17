package com.example.smkcodingchallange2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TypeEndPoint {
    @GET("type")
    fun dotarget(): Call<ResponseType>
}