package com.example.feature.home.impl

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.feature.home.impl.internal.InternalHomeFeatureApi

@Composable
fun HomeScreen(modifier: Modifier, navController: NavHostController) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            "Главная",
            modifier = Modifier.padding(36.dp),
            fontSize = 28.sp
        )

        Button(
            modifier = Modifier.padding(16.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta, contentColor = Color.White),
            onClick = {
                navController.navigate(InternalHomeFeatureApi.scenarioDetailOrderRoute())
            }) {
            Text("Какая-то вещь с id", fontSize = 18.sp)
        }
    }
}