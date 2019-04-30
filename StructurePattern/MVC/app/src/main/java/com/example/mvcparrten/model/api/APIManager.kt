package com.example.mvcparrten.model.api

import com.example.mvpprattern.model.api.SomethingApi
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIManager {
    private  fun apiManager(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("xxxxxxxxxxxxxxxxx")
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder()
                        .create())).build()
    }
    fun getProductList(): SomethingApi {
        return apiManager().create(SomethingApi::class.java)
    }
}