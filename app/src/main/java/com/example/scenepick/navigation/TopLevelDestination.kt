package com.example.scenepick.navigation

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.scenepick.R
import com.example.scenepick.core.designsystem.icon.SpIcons
import com.example.scenepick.feature.home.navigation.HomeRoute
import com.example.scenepick.feature.saved.navigation.SavedRoute
import kotlin.reflect.KClass
import com.example.scenepick.feature.home.R as homeR
import com.example.scenepick.feature.saved.R as savedR

enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    @StringRes val iconTextId: Int,
    @StringRes val titleTextId: Int,
    val route: KClass<*>,
    val baseRoute: KClass<*> = route,
) {
    HOME(
        selectedIcon = SpIcons.Home,
        unselectedIcon = SpIcons.HomeBorder,
        iconTextId = homeR.string.feature_home_title,
        titleTextId = R.string.app_name,
        route = HomeRoute::class,
    ),
    SAVED(
        selectedIcon = SpIcons.Bookmarks,
        unselectedIcon = SpIcons.BookmarksBorder,
        iconTextId = savedR.string.feature_saved_title,
        titleTextId = savedR.string.feature_saved_title,
        route = SavedRoute::class,
    ),
}
