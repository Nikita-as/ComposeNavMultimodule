package com.example.feature.search.impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.feature.api.search.SearchFeatureApi

class SearchFeatureImpl : SearchFeatureApi {

    private val route = "search"

    override fun searchRoute() = route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route) {
            SearchScreen(modifier = modifier)
        }
    }
}