package com.example.smkcodingchallange2

import com.google.gson.annotations.SerializedName

data class ResponsePokemon(

    @field:SerializedName("next")
    val next: String? = null,

    @field:SerializedName("previous")
    val previous: Any? = null,

    @field:SerializedName("count")
    val count: Int? = null,

    @field:SerializedName("results")
    val results: ArrayList<ResultsItem>? = null
)

data class ResultsItem(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("url")
    val url: String? = null
)


