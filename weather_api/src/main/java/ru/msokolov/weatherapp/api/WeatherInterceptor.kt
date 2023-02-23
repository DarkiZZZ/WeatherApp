package ru.msokolov.weatherapp.api

import okhttp3.Interceptor
import okhttp3.Response

internal object WeatherInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val builder = originalRequest.newBuilder()
            .header(API_NAME, API_VALUE)
        val newRequest = builder.build()
        return chain.proceed(newRequest)
    }

    private const val API_NAME = "X-Yandex-API-Key"
    private const val API_VALUE = "c0cbc9e7-db78-4fef-a5e9-ec62d47dc5f6"
}