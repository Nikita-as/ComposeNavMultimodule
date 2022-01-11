package com.example.feature.first.impl

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
            fontSize = 28.sp
        )
        SimpleButton(text = "Войти") {
            val homeFeature = DependencyProvider.homeFeature()
            navController.popBackStack()
            navController.navigate(homeFeature.homeRoute())
        }
    }
}

@Composable
private fun SimpleButton(text: String, onClick: () -> Unit) {
    Button(
        modifier = Modifier
            .padding(18.dp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta, contentColor = Color.White)
    ) {
        Text(text, fontSize = 18.sp)
    }
}