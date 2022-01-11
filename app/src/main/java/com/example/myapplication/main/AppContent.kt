package com.example.myapplication.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.backgroundWhite
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.navigationBarsHeight
import com.google.accompanist.insets.navigationBarsPadding
import java.util.*

@Composable
fun AppContent() {
    ProvideWindowInsets {
        MyApplicationTheme() {
            val tabs = remember { BottomTabs.values() }
            val navController = rememberNavController()
            Scaffold(
                backgroundColor = backgroundWhite,
                bottomBar = { BottomBar(navController = navController, tabs) }
            ) { innerPaddingModifier ->
                AppNavGraph(
                    navController = navController,
                    modifier = Modifier.padding(innerPaddingModifier)
                )
            }
        }
    }
}

@Composable
fun BottomBar(navController: NavController, tabs: Array<BottomTabs>) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: BottomTabs.HOME.route

    val routes = remember { BottomTabs.values().map { it.route } }
    if (currentRoute in routes) {
        BottomNavigation(
            Modifier.navigationBarsHeight(additional = 56.dp),
            backgroundColor = Color.White,
            contentColor = Color.Black

        ) {
            tabs.forEach { tab ->
                BottomNavigationItem(
                    icon = { Icon(painterResource(tab.icon), contentDescription = null) },
                    label = { Text(stringResource(tab.title), fontSize = 10.sp, softWrap = false, fontStyle = FontStyle.Normal) },
                    selected = currentRoute == tab.route,
                    onClick = {
                        if (tab.route != currentRoute) {
                            navController.navigate(tab.route) {
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    },
                    alwaysShowLabel = false,
                    selectedContentColor = Color.Magenta,
                    unselectedContentColor = Color.Black,
                    modifier = Modifier.navigationBarsPadding()
                )
            }
        }
    }
}
