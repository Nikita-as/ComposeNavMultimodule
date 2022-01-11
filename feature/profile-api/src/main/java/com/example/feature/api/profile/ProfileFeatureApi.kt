package com.example.feature.api.profile

import com.example.core.feature_api.FeatureApi

interface ProfileFeatureApi : FeatureApi {

    fun profileRoute(): String
}