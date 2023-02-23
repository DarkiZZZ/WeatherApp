package ru.msokolov.weatherapp.api

import retrofit2.http.GET
import retrofit2.http.Query
import ru.msokolov.weatherapp.api.models.ApiResponse

interface WeatherApiService {

    @GET("forecast?")
    suspend fun getWeatherForecast(
        @Query(QUERY_LATITUDE) latitude: Double, // = 55.755864
        @Query(QUERY_LONGITUDE) longitude: Double,  // = 37.617698
        @Query(QUERY_LANGUAGE) language: String = LANGUAGE_TYPE,
        @Query(QUERY_HOURS_FORECAST) hours: Boolean = false,
        @Query(QUERY_EXTRA) extra: Boolean = false
    ): ApiResponse

    companion object {
        private const val QUERY_LATITUDE = "lat"
        private const val QUERY_LONGITUDE = "lon"
        private const val QUERY_LANGUAGE = "lang"
        private const val QUERY_HOURS_FORECAST = "hours"
        private const val QUERY_EXTRA = "extra"

        private const val LANGUAGE_TYPE = "ru_RU"
    }
}