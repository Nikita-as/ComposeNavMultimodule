package com.example.feature.api.basket

import com.example.core.feature_api.FeatureApi


interface BasketFeatureApi : FeatureApi {

    fun basketRoute(): String
}