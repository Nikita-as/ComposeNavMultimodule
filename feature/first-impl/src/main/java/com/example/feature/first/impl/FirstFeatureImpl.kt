package com.example.feature.first.impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.api.first.FirstFeatureApi

class FirstFeatureImpl : FirstFeatureApi {

    private val route = "first"

    override fun firstRoute() = route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route) {
            FirstScreen(navController)
        }
    }
}