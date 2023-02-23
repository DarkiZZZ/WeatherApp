package ru.msokolov.weatherapp.api.models

import com.google.gson.annotations.SerializedName


data class Tzinfo (

  @SerializedName("name"   ) var name   : String?  = null,
  @SerializedName("abbr"   ) var abbr   : String?  = null,
  @SerializedName("dst"    ) var dst    : Boolean? = null,
  @SerializedName("offset" ) var offset : Int?     = null

)