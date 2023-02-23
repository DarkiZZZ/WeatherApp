package ru.msokolov.weatherapp.api.models

import com.google.gson.annotations.SerializedName


data class AccumPrec (

  @SerializedName("1" ) var one : Int?    = null,
  @SerializedName("3" ) var three : Double? = null,
  @SerializedName("7" ) var seven : Double? = null

)