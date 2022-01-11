package com.example.feature.basket.impl

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
import androidx.navigation.NavController
import com.example.core.dependencyprovider.DependencyProvider.homeFeature
import com.example.core.dependencyprovider.DependencyProvider.searchFeature


@Composable
fun BasketScreen(modifier: Modifier, navController: NavController) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Корзина",
            fontSize = 28.sp
        )
        Button(
            modifier = Modifier.padding(16.dp),
            onClick = {
                navController.navigate(
                    route = searchFeature().searchRoute()
                )
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Magenta,
                contentColor = Color.White
            )
        ) {
            Text(text = "Выбрать товар", fontSize = 22.sp)
        }
    }
}