package com.example.core.dependencyprovider

import com.example.api.first.FirstFeatureApi
import com.example.feature.api.basket.BasketFeatureApi
import com.example.feature.api.favorite.FavoriteFeatureApi
import com.example.feature.api.home.HomeFeatureApi
import com.example.feature.api.profile.ProfileFeatureApi
import com.example.feature.api.search.SearchFeatureApi

object DependencyProvider {

    private lateinit var firstFeatureApi: FirstFeatureApi
    private lateinit var homeFeatureApi: HomeFeatureApi
    private lateinit var searchFeatureApi: SearchFeatureApi
    private lateinit var basketFeatureApi: BasketFeatureApi
    private lateinit var favoriteFeatureApi: FavoriteFeatureApi
    private lateinit var profileFeatureApi: ProfileFeatureApi

    fun provideImpl(
        firstFeatureApi1: FirstFeatureApi,
        homeFeatureApi: HomeFeatureApi,
        searchFeatureApi: SearchFeatureApi,
        basketFeatureApi: BasketFeatureApi,
        favoriteFeatureApi: FavoriteFeatureApi,
        profileFeatureApi: ProfileFeatureApi

    ) {
        this.firstFeatureApi = firstFeatureApi1
        this.homeFeatureApi = homeFeatureApi
        this.searchFeatureApi = searchFeatureApi
        this.basketFeatureApi = basketFeatureApi
        this.favoriteFeatureApi = favoriteFeatureApi
        this.profileFeatureApi = profileFeatureApi

    }

    fun firstFeature(): FirstFeatureApi = firstFeatureApi

    fun homeFeature(): HomeFeatureApi = homeFeatureApi

    fun searchFeature(): SearchFeatureApi = searchFeatureApi

    fun basketFeature(): BasketFeatureApi = basketFeatureApi

    fun favoriteFeature(): FavoriteFeatureApi = favoriteFeatureApi

    fun profileFeature(): ProfileFeatureApi = profileFeatureApi
}

