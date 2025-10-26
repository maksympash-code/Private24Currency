package com.example.private24currency.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitPrivate24 {
    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: Private24Service = retrofit.create<Private24Service?>(Private24Service::class.java)
}