package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;
//Create a final entity class to call weather class.
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
