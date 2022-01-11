package com.example.myapplication.main

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.core.dependencyprovider.DependencyProvider
import com.example.myapplication.R

enum class BottomTabs(
    @StringRes
    val title: Int,
    @DrawableRes
    val icon: Int,
    val route: String
) {

    HOME(
        R.string.home,
        R.drawable.ic_check,
        DependencyProvider.homeFeature().homeRoute()
    ),
    SEARCH(
        R.string.search,
        R.drawable.ic_search,
        DependencyProvider.searchFeature().searchRoute()
    ),
    BASKET(
        R.string.basket,
        R.drawable.ic_bag,
        DependencyProvider.basketFeature().basketRoute()
    ),
    FAVORITE(
        R.string.favorite,
        R.drawable.ic_favorite,
        DependencyProvider.favoriteFeature().favoriteRoute()
    ),
    PROFILE(
        R.string.profile,
        R.drawable.ic_profile,
        DependencyProvider.profileFeature().profileRoute()
    )
}
