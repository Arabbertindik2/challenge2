package com.example.smkcodingchallange2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EndPointMoveDetail {
    @GET("move/{id}/")
    fun dotarget(@Path("id") Id:String): Call<ResponseMoveDetail>
}