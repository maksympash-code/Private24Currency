package com.example.private24currency.retrofit

import com.example.private24currency.items.PrivateCurrencyItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface Private24Service {
    // https://api.privatbank.ua/p24api/exchange_rates?date=01.12.2014


    @GET("p24api/exchange_rates")
    fun getDateExchange(
        @Query("date") date: String?,
        @Query("json") json: String?
        ): Call<PrivateCurrencyItem>
}