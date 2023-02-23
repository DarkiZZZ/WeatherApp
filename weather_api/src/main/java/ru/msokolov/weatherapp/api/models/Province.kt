package ru.msokolov.weatherapp.api.models

import com.google.gson.annotations.SerializedName


data class Province (

  @SerializedName("id"   ) var id   : Int?    = null,
  @SerializedName("name" ) var name : String? = null

)