package ru.msokolov.weatherapp.api.models

import com.google.gson.annotations.SerializedName


data class Forecasts (

  @SerializedName("date"       ) var date      : String?           = null,
  @SerializedName("date_ts"    ) var dateTs    : Int?              = null,
  @SerializedName("week"       ) var week      : Int?              = null,
  @SerializedName("sunrise"    ) var sunrise   : String?           = null,
  @SerializedName("sunset"     ) var sunset    : String?           = null,
  @SerializedName("rise_begin" ) var riseBegin : String?           = null,
  @SerializedName("set_end"    ) var setEnd    : String?           = null,
  @SerializedName("moon_code"  ) var moonCode  : Int?              = null,
  @SerializedName("moon_text"  ) var moonText  : String?           = null,
  @SerializedName("parts"      ) var parts     : Parts?            = Parts(),
  @SerializedName("hours"      ) var hours     : ArrayList<String> = arrayListOf(),
  @SerializedName("biomet"     ) var biomet    : Biomet?           = Biomet()

)