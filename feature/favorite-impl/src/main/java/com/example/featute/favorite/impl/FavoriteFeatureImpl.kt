package com.example.featute.favorite.impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.feature.api.favorite.FavoriteFeatureApi

class FavoriteFeatureImpl : FavoriteFeatureApi {

    private val route = "favorite"

    override fun favoriteRoute() = route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route) {
            FavoriteScreen(modifier = modifier)
        }
    }
}