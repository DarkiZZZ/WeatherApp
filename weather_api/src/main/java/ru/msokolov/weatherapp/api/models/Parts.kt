package ru.msokolov.weatherapp.api.models

import com.google.gson.annotations.SerializedName


data class Parts (

  @SerializedName("evening"     ) var evening    : Evening?    = Evening(),
  @SerializedName("day_short"   ) var dayShort   : DayShort?   = DayShort(),
  @SerializedName("morning"     ) var morning    : Morning?    = Morning(),
  @SerializedName("night_short" ) var nightShort : NightShort? = NightShort(),
  @SerializedName("day"         ) var day        : Day?        = Day(),
  @SerializedName("night"       ) var night      : Night?      = Night()

)