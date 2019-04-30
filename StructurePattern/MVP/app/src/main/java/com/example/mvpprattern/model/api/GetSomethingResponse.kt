package com.example.mvpprattern.model.api

import com.example.mvpprattern.model.database.item.GetsomethingItem
import com.google.gson.annotations.SerializedName

data class GetSomethingResponse(
    @SerializedName("id")
    val idApi : Int?=null,
    @SerializedName("Name")
    val NameApi : String?=null,
    @SerializedName("price")
    val priceApi : Int? = null
)