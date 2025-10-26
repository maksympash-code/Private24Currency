package com.example.private24currency.retrofit

import com.example.private24currency.items.PrivateCurrencyItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitPrivate24 {

    val BASE_URL = "https://api.privatbank.ua/"
    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: Private24Service = retrofit.create(Private24Service::class.java)

    fun getDateExchange(resultCallBack: (PrivateCurrencyItem?) -> Unit){
        val call: Call<PrivateCurrencyItem> = service.getDateExchange("01.12.2014", "")

        call.enqueue(object : Callback<PrivateCurrencyItem>{
            override fun onResponse(
                call: Call<PrivateCurrencyItem?>,
                response: Response<PrivateCurrencyItem>,
            ) {
                resultCallBack(response.body())
            }

            override fun onFailure(
                call: Call<PrivateCurrencyItem?>,
                throwable: Throwable,
            ) {
                resultCallBack(null)
            }


        })
    }
}