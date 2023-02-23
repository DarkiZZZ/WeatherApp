package ru.msokolov.weatherapp.api.models

import com.google.gson.annotations.SerializedName


data class GeoObject (

  @SerializedName("district" ) var district : District? = District(),
  @SerializedName("locality" ) var locality : Locality? = Locality(),
  @SerializedName("province" ) var province : Province? = Province(),
  @SerializedName("country"  ) var country  : Country?  = Country()

)