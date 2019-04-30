package com.example.mvcparrten.model.api

import com.example.mvcparrten.model.database.item.GetsomethingItem
import com.google.gson.annotations.SerializedName

data class GetSomethingResponse(
    @SerializedName("data")
    val somethingFromApi : ArrayList<GetsomethingItem>
)