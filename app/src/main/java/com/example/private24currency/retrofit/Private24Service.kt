package com.example.private24currency.retrofit

import com.example.private24currency.items.PrivateCurrencyItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface Private24Service {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String?): Call<MutableList<PrivateCurrencyItem?>?>?
}