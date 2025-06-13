package com.example.scenepick.feature.saved.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.scenepick.feature.saved.SavedRoute
import kotlinx.serialization.Serializable

@Serializable
object SavedRoute

fun NavController.navigateToSaved(navOptions: NavOptions) =
    navigate(route = SavedRoute, navOptions = navOptions)

fun NavGraphBuilder.savedScreen(

) {
    composable<SavedRoute> {
        SavedRoute()
    }
}