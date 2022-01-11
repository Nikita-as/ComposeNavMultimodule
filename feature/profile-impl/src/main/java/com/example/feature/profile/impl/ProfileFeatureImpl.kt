package com.example.feature.profile.impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.feature.api.profile.ProfileFeatureApi

class ProfileFeatureImpl : ProfileFeatureApi {

    private val route = "profile"

    override fun profileRoute() = route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route) {
            ProfileScreen(modifier = modifier)
        }
    }
}