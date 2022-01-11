package com.example.core.dependencyprovider

import com.example.api.first.FirstFeatureApi
import com.example.feature.api.home.HomeFeatureApi
import com.example.feature.api.profile.ProfileFeatureApi
import com.example.feature.api.search.SearchFeatureApi

object DependencyProvider {

    private lateinit var firstFeatureApi: FirstFeatureApi
    private lateinit var homeFeatureApi: HomeFeatureApi
    private lateinit var searchFeatureApi: SearchFeatureApi
    private lateinit var profileFeatureApi: ProfileFeatureApi

    fun provideImpl(
        firstFeatureApi1: FirstFeatureApi,
        homeFeatureApi: HomeFeatureApi,
        searchFeatureApi: SearchFeatureApi,
        profileFeatureApi: ProfileFeatureApi

    ) {
        this.firstFeatureApi = firstFeatureApi1
        this.homeFeatureApi = homeFeatureApi
        this.searchFeatureApi = searchFeatureApi
        this.profileFeatureApi = profileFeatureApi

    }

    fun firstFeature(): FirstFeatureApi = firstFeatureApi

    fun homeFeature(): HomeFeatureApi = homeFeatureApi

    fun searchFeature(): SearchFeatureApi = searchFeatureApi

    fun profileFeature(): ProfileFeatureApi = profileFeatureApi
}

