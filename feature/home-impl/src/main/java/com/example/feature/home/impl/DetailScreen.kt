package com.example.feature.home.impl

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.feature.home.impl.internal.InternalHomeFeatureApi

@Composable
fun ScreenDetail(modifier: Modifier, navController: NavHostController) {
    var text by remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            "Id вещи",
            modifier = Modifier.padding(36.dp),
            fontSize = 24.sp
        )

        OutlinedTextField(
            value = text,
            onValueChange = { value -> text = value },
            modifier = Modifier.padding(36.dp)
        )

        Button(
            modifier = Modifier.padding(16.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta, contentColor = Color.White),
            onClick = {
                navController.navigate(InternalHomeFeatureApi.screenB(parameter = text))
            }) {
            Text("Оформить", fontSize = 18.sp)
        }
    }
}