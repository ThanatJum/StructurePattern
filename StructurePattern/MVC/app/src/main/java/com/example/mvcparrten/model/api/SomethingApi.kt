package com.example.mvpprattern.model.api

import com.example.mvcparrten.model.api.GetSomethingResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface SomethingApi {
    @GET("asdasd")
    fun getSomething(): Call<GetSomethingResponse>
    @POST("dadadad")
    fun postSomething():Call<GetSomethingResponse>


}