package ru.msokolov.weatherapp.api.models

import com.google.gson.annotations.SerializedName


data class Yesterday (

  @SerializedName("temp" ) var temp : Int? = null

)