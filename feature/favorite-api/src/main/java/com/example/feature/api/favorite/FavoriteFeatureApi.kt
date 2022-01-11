package com.example.feature.api.favorite

import com.example.core.feature_api.FeatureApi

interface FavoriteFeatureApi : FeatureApi {

    fun favoriteRoute(): String
}