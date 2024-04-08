package com.ivanaf.querytracking.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ivanaf.querytracking.common.theme.QueryTrackingTheme
import com.ivanaf.querytracking.presentation.entity.AppNavigation
import com.ivanaf.querytracking.presentation.home.HomeScreen
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QueryTrackingTheme {
                AppScreens()
            }
        }
    }
}

@Composable
fun AppScreens() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppNavigation.Home.destination
    ) {
        composable(AppNavigation.Home.destination) {
            HomeScreen()
        }
    }
}