package com.example.mvcparrten.model.database.item

import com.google.gson.annotations.SerializedName

data class GetsomethingItem (
    @SerializedName("_id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("price")
    val price: String?

)