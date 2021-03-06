package com.example.smkcodingchallange2


import com.google.gson.annotations.SerializedName

data class ResponseMove(
    @field:SerializedName("next")
    val next: String? = null,

    @field:SerializedName("previous")
    val previous: Any? = null,

    @field:SerializedName("count")
    val count: Int? = null,

    @field:SerializedName("results")
    val results: ArrayList<ResultItem2>? = null
)

data class ResultItem2(
    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("url")
    val url: String? = null
)