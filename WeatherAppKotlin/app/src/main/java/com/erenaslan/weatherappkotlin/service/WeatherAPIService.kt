package com.erenaslan.weatherappkotlin.service

import com.erenaslan.weatherappkotlin.model.WeatherModel
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class WeatherAPIService {
    //https://api.openweathermap.org/data/2.5/weather?q=izmir&APPID=d730848e9d4bc9f1a63fdfc9a812ecd6

    private val BASE_URL = "https://api.openweathermap.org/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(WeatherAPI::class.java)
    fun getDataService(cityName : String): Single<WeatherModel>{
        return api.getData(cityName)
    }
}