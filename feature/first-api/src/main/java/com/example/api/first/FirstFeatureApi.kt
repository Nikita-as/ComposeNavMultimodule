package com.example.api.first

import com.example.core.feature_api.FeatureApi

interface FirstFeatureApi: FeatureApi {

    fun firstRoute(): String
}