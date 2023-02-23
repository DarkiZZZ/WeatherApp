package ru.msokolov.weatherapp.api.models

import com.google.gson.annotations.SerializedName


data class NightShort (

  @SerializedName("_source"       ) var Source       : String?  = null,
  @SerializedName("temp"          ) var temp         : Int?     = null,
  @SerializedName("wind_speed"    ) var windSpeed    : Double?  = null,
  @SerializedName("wind_gust"     ) var windGust     : Double?  = null,
  @SerializedName("wind_dir"      ) var windDir      : String?  = null,
  @SerializedName("pressure_mm"   ) var pressureMm   : Int?     = null,
  @SerializedName("pressure_pa"   ) var pressurePa   : Int?     = null,
  @SerializedName("humidity"      ) var humidity     : Int?     = null,
  @SerializedName("soil_temp"     ) var soilTemp     : Int?     = null,
  @SerializedName("soil_moisture" ) var soilMoisture : Double?  = null,
  @SerializedName("prec_mm"       ) var precMm       : Double?  = null,
  @SerializedName("prec_prob"     ) var precProb     : Int?     = null,
  @SerializedName("prec_period"   ) var precPeriod   : Int?     = null,
  @SerializedName("cloudness"     ) var cloudness    : Int?     = null,
  @SerializedName("prec_type"     ) var precType     : Int?     = null,
  @SerializedName("prec_strength" ) var precStrength : Double?  = null,
  @SerializedName("icon"          ) var icon         : String?  = null,
  @SerializedName("condition"     ) var condition    : String?  = null,
  @SerializedName("uv_index"      ) var uvIndex      : Int?     = null,
  @SerializedName("feels_like"    ) var feelsLike    : Int?     = null,
  @SerializedName("daytime"       ) var daytime      : String?  = null,
  @SerializedName("polar"         ) var polar        : Boolean? = null,
  @SerializedName("fresh_snow_mm" ) var freshSnowMm  : Double?     = null

)