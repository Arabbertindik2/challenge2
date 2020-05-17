package com.example.smkcodingchallange2


import com.google.gson.annotations.SerializedName

data class DetailResponse(
    @SerializedName("height")
    var height: Int,
    @SerializedName("id")
    var id: Int,
    @SerializedName("name")
    var name: String,
    @SerializedName("types")
    var types: List<Type>?,
    @SerializedName("weight")
    var weight: Int
)

data class Type(
    @SerializedName("slot")
    var slot: Int,
    @SerializedName("type")
    var type: TypeX?
)

data class TypeX(
    @SerializedName("name")
    var name: String,
    @SerializedName("url")
    var url: String
)