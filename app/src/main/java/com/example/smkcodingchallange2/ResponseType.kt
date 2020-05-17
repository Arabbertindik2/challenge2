package com.example.smkcodingchallange2


import com.google.gson.annotations.SerializedName

data class ResponseType(
    @SerializedName("count")
    var count: Int,
    @SerializedName("next")
    var next: Any,
    @SerializedName("previous")
    var previous: Any,
    @SerializedName("results")
    var results: List<Result2>
)

data class Result2(
    @SerializedName("name")
    var name: String,
    @SerializedName("url")
    var url: String
)