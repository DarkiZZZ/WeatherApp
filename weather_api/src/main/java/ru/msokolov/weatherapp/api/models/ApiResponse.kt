package ru.msokolov.weatherapp.api.models

import com.google.gson.annotations.SerializedName


data class ApiResponse (

  @SerializedName("now"        ) var now       : Int?                 = null,
  @SerializedName("now_dt"     ) var nowDt     : String?              = null,
  @SerializedName("info"       ) var info      : Info?                = Info(),
  @SerializedName("geo_object" ) var geoObject : GeoObject?           = GeoObject(),
  @SerializedName("yesterday"  ) var yesterday : Yesterday?           = Yesterday(),
  @SerializedName("fact"       ) var fact      : Fact?                = Fact(),
  @SerializedName("forecasts"  ) var forecasts : ArrayList<Forecasts> = arrayListOf()

)