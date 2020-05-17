package com.example.smkcodingchallange2


import com.google.gson.annotations.SerializedName

data class ResponseMoveDetail(
    @SerializedName("accuracy")
    var accuracy: Int,
    @SerializedName("name")
    var name: String,
    @SerializedName("power")
    var power: Int,
    @SerializedName("pp")
    var pp: Int,
    @SerializedName("priority")
    var priority: Int,
    @SerializedName("type")
    var types2: List<Type2>
)

data class Type2(
    @SerializedName("name")
    var name: String,
    @SerializedName("url")
    var url: String
)