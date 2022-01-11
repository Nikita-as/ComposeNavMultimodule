package com.example.myapplication.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.example.core.dependencyprovider.DependencyProvider
import com.example.feature.first.impl.FirstFeatureImpl
import com.example.feature.home.impl.HomeFeatureImpl
import com.example.feature.profile.impl.ProfileFeatureImpl
import com.example.feature.search.impl.SearchFeatureImpl
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, true)

        DependencyProvider.provideImpl(
            firstFeatureApi1 = FirstFeatureImpl(),
            homeFeatureApi = HomeFeatureImpl(),
            searchFeatureApi = SearchFeatureImpl(),
            profileFeatureApi = ProfileFeatureImpl()

        )

        setContent {
            MyApplicationTheme() {
                AppContent()
            }
        }
    }
}