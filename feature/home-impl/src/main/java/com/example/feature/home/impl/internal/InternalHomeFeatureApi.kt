package com.example.feature.home.impl.internal

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.core.feature_api.FeatureApi
import com.example.feature.home.impl.ScreenDetail
import com.example.feature.home.impl.ScreenOrder

/**
 * Внутренне API фичи для навигации по внутренним экранам
 */
internal object InternalHomeFeatureApi : FeatureApi {

    private const val scenarioDetailOrderRoute = "home/scenarioDetailOrderRoute"
    private const val parameterKey = "parameterKey"
    private const val screenOrderRoute = "home/screenOrder"
    private const val screenDetailRoute = "home/detailScreen"

    fun scenarioDetailOrderRoute() = scenarioDetailOrderRoute

    fun screenA() = screenDetailRoute

    fun screenB(parameter: String) = "$screenOrderRoute/${parameter}"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {

        navGraphBuilder.navigation(
            route = scenarioDetailOrderRoute,
            startDestination = screenDetailRoute
        ) {

            composable(route = screenDetailRoute) {
                ScreenDetail(modifier = modifier, navController = navController)
            }

            composable(
                route = "$screenOrderRoute/{$parameterKey}",
                arguments = listOf(navArgument(parameterKey) { type = NavType.StringType })
            ) { backStackEntry ->
                val arguments = requireNotNull(backStackEntry.arguments)
                val argument = arguments.getString(parameterKey)
                ScreenOrder(modifier = modifier, argument = argument.orEmpty())
            }
        }
    }
}