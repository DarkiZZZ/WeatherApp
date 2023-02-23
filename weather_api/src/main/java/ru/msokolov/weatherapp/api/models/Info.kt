package ru.msokolov.weatherapp.api.models

import com.google.gson.annotations.SerializedName


data class Info (

  @SerializedName("n"               ) var n             : Boolean? = null,
  @SerializedName("geoid"           ) var geoid         : Int?     = null,
  @SerializedName("url"             ) var url           : String?  = null,
  @SerializedName("lat"             ) var lat           : Double?  = null,
  @SerializedName("lon"             ) var lon           : Double?  = null,
  @SerializedName("tzinfo"          ) var tzinfo        : Tzinfo?  = Tzinfo(),
  @SerializedName("def_pressure_mm" ) var defPressureMm : Int?     = null,
  @SerializedName("def_pressure_pa" ) var defPressurePa : Int?     = null,
  @SerializedName("slug"            ) var slug          : String?  = null,
  @SerializedName("zoom"            ) var zoom          : Int?     = null,
  @SerializedName("nr"              ) var nr            : Boolean? = null,
  @SerializedName("ns"              ) var ns            : Boolean? = null,
  @SerializedName("nsr"             ) var nsr           : Boolean? = null,
  @SerializedName("p"               ) var p             : Boolean? = null,
  @SerializedName("f"               ) var f             : Boolean? = null,
  @SerializedName("_h"              ) var H             : Boolean? = null

)