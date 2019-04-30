package com.example.mvpprattern.model.api

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
    fun getProductList():SomethingApi{
        return apiManager().create(SomethingApi::class.java)
    }
}