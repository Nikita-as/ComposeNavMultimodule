package com.example.myapplication.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.core.dependencyprovider.DependencyProvider
import com.example.core.feature_api.register

@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = DependencyProvider.firstFeature().firstRoute()
    ) {
        register(
            DependencyProvider.homeFeature(),
            navController = navController,
            modifier = modifier
        )

        register(
            DependencyProvider.profileFeature(),
            navController = navController,
            modifier = modifier
        )

        register(
            DependencyProvider.firstFeature(),
            navController = navController,
            modifier = modifier
        )
        register(
            DependencyProvider.searchFeature(),
            navController = navController,
            modifier = modifier
        )
        register(
            DependencyProvider.basketFeature(),
            navController = navController,
            modifier = modifier
        )
        register(
            DependencyProvider.favoriteFeature(),
            navController = navController,
            modifier = modifier
        )
    }
}
