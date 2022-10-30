package com.erenaslan.weatherappkotlin.service

import com.erenaslan.weatherappkotlin.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

//https://api.openweathermap.org/data/2.5/weather?q=izmir&APPID=d730848e9d4bc9f1a63fdfc9a812ecd6
interface WeatherAPI {
    @GET("data/2.5/weather?&units=metric&APPID=d730848e9d4bc9f1a63fdfc9a812ecd6")
    fun getData(
        @Query("q") cityName: String
    ) : Single<WeatherModel>
}