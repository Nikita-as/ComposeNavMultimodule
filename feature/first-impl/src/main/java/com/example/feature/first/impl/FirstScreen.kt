package com.example.feature.first.impl

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.core.dependencyprovider.DependencyProvider

@Composable
internal fun FirstScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Rendez-Vous",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(36.dp),
            fontSize = 24.sp
        )
        SimpleButton(text = "На главную") {
            val homeFeature = DependencyProvider.homeFeature()
            navController.popBackStack()
            navController.navigate(homeFeature.homeRoute())
        }

        SimpleButton(text = "В профиль") {
            val settingsFeature = DependencyProvider.profileFeature()
            navController.popBackStack()
            navController.navigate(settingsFeature.profileRoute())
        }
    }
}

@Composable
private fun SimpleButton(text: String, onClick: () -> Unit) {
    Button(
        modifier = Modifier.padding(16.dp),
        onClick = onClick
    ) {
        Text(text)
    }
}