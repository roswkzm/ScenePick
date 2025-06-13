package com.example.scenepick.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.example.scenepick.feature.home.navigation.HomeRoute
import com.example.scenepick.feature.home.navigation.homeScreen
import com.example.scenepick.feature.saved.navigation.savedScreen
import com.example.scenepick.ui.SpAppState

@Composable
fun SpNavHost(
    appState: SpAppState,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = HomeRoute,
        modifier = modifier,
    ) {
        homeScreen()
        savedScreen()
    }
}
