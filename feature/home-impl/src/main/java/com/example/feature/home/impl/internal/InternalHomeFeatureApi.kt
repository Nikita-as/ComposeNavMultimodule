package com.example.feature.home.impl.internal

import androidx.compose.ui.Modifier
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.core.feature_api.FeatureApi
import com.example.feature.home.impl.DetailScreen

internal object InternalHomeFeatureApi : FeatureApi {

    private const val scenarioRoute = "home/scenarioRoute"
    private const val parameterKey = "parameterKey"
    private const val screenDetailRoute = "home/screenDetail"

    fun screenDetail(parameter: Int) = "$screenDetailRoute/${parameter}"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {

        navGraphBuilder.navigation(
            route = scenarioRoute,
            startDestination = screenDetailRoute
        ) {

            composable(
                route = "$screenDetailRoute/{$parameterKey}",
                arguments = listOf(navArgument(parameterKey) { type = NavType.StringType })
            ) { backStackEntry ->
                val arguments = requireNotNull(backStackEntry.arguments)
                val argument = arguments.getString(parameterKey)
                DetailScreen(modifier = modifier, argument = argument.orEmpty())
            }
        }
    }
}