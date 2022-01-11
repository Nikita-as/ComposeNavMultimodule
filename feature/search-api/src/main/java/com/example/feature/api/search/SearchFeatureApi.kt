package com.example.feature.api.search

import com.example.core.feature_api.FeatureApi

interface SearchFeatureApi : FeatureApi {

    fun searchRoute(): String
}