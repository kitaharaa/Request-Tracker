package com.ivanaf.querytracking.presentation.entity

sealed class AppNavigation(val destination: String) {
    data object Home: AppNavigation("home")
}