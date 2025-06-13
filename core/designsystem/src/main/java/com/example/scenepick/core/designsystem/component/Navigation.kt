package com.example.scenepick.core.designsystem.component

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.scenepick.core.designsystem.icon.SpIcons
import com.example.scenepick.core.designsystem.theme.ScenePickTheme
import com.example.scenepick.core.designsystem.theme.ThemePreviews

@Composable
fun RowScope.SpNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    selectedIcon: @Composable () -> Unit = icon,
    enabled: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    alwaysShowLabel: Boolean = true
) {
    NavigationBarItem(
        selected = selected,
        onClick = onClick,
        icon = if (selected) selectedIcon else icon,
        modifier = modifier,
        enabled = enabled,
        label = label,
        alwaysShowLabel = alwaysShowLabel,
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = SpNavigationDefaults.navigationSelectedItemColor(),
            unselectedIconColor = SpNavigationDefaults.navigationContentColor(),
            selectedTextColor = SpNavigationDefaults.navigationSelectedItemColor(),
            unselectedTextColor = SpNavigationDefaults.navigationContentColor(),
            indicatorColor = SpNavigationDefaults.navigationIndicatorColor(),
        )
    )
}

@Composable
fun SpNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    NavigationBar(
        modifier = modifier,
        contentColor = SpNavigationDefaults.navigationContentColor(),
        tonalElevation = 0.dp,
        content = content
    )
}

@ThemePreviews
@Composable
fun SpNavigationPreview() {
    val items = listOf("Home", "Saved")
    val icons = listOf(
        SpIcons.HomeBorder,
        SpIcons.BookmarksBorder,
    )
    val selectedIcons = listOf(
        SpIcons.Home,
        SpIcons.Bookmarks,
    )


    ScenePickTheme {
        SpNavigationBar {
            items.forEachIndexed { index, item ->
                SpNavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = icons[index],
                            contentDescription = item,
                        )
                    },
                    selectedIcon = {
                        Icon(
                            imageVector = selectedIcons[index],
                            contentDescription = item,
                        )
                    },
                    label = { Text(item) },
                    selected = index == 0,
                    onClick = { },
                )
            }
        }
    }
}

object SpNavigationDefaults {
    @Composable
    fun navigationContentColor() = MaterialTheme.colorScheme.onSurfaceVariant

    @Composable
    fun navigationSelectedItemColor() = MaterialTheme.colorScheme.onPrimaryContainer

    @Composable
    fun navigationIndicatorColor() = MaterialTheme.colorScheme.primaryContainer
}