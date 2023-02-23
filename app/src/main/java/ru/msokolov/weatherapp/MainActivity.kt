package ru.msokolov.weatherapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import ru.msokolov.weatherapp.api.ApiFactory

class MainActivity : AppCompatActivity() {

    private val apiService = ApiFactory.weatherApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainScope().launch {
            val answer = apiService.getWeatherForecast(55.755864, 37.617698)
            Log.d("TAGMainActivity", answer.toString())
        }
    }
}