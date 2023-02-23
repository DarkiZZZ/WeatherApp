package ru.msokolov.weatherapp.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {


    private const val WEATHER_BASE_URL = "https://api.weather.yandex.ru/v2/"

    private val httpClient = OkHttpClient().newBuilder().addInterceptor(WeatherInterceptor).build()

    private val weatherRetrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient)
        .baseUrl(WEATHER_BASE_URL)
        .build()

    val weatherApiService = weatherRetrofit.create(WeatherApiService::class.java)
}