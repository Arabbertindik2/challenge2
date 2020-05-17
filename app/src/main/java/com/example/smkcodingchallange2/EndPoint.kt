package com.example.smkcodingchallange2

import okhttp3.Response
import retrofit2.Call
import retrofit2.http.*


interface  EndPoint {
    @GET("pokemon?limit=10")
    fun doTarget(): Call<ResponsePokemon>
}
