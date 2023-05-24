package com.plcoding.weatherapp.presentation

import com.plcoding.weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val wetherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null,
)
