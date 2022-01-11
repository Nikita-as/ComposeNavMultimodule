package com.example.feature.basket.impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.feature.api.basket.BasketFeatureApi

class BasketFeatureImpl : BasketFeatureApi {

    private val route = "basket"

    override fun basketRoute() = route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route) {
            BasketScreen(modifier = modifier)
        }
    }
}