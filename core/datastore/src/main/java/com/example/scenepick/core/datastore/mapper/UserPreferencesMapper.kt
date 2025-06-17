package com.example.scenepick.core.datastore.mapper

import com.example.scenepick.core.data.model.ThemeConfigEntity
import com.example.scenepick.core.data.model.UserPreferencesEntity
import com.example.scenepick.core.datastore.DarkThemeConfigProto
import com.example.scenepick.core.datastore.UserPreferences

fun DarkThemeConfigProto.toData(): ThemeConfigEntity = when (this) {
    DarkThemeConfigProto.DARK_THEME_CONFIG_UNSPECIFIED,
    DarkThemeConfigProto.UNRECOGNIZED,
    DarkThemeConfigProto.DARK_THEME_CONFIG_FOLLOW_SYSTEM,
        -> ThemeConfigEntity.FOLLOW_SYSTEM

    DarkThemeConfigProto.DARK_THEME_CONFIG_LIGHT -> ThemeConfigEntity.LIGHT

    DarkThemeConfigProto.DARK_THEME_CONFIG_DARK -> ThemeConfigEntity.DARK
}


fun ThemeConfigEntity.toLocal(): DarkThemeConfigProto = when (this) {
    ThemeConfigEntity.FOLLOW_SYSTEM -> DarkThemeConfigProto.DARK_THEME_CONFIG_FOLLOW_SYSTEM
    ThemeConfigEntity.LIGHT -> DarkThemeConfigProto.DARK_THEME_CONFIG_LIGHT
    ThemeConfigEntity.DARK -> DarkThemeConfigProto.DARK_THEME_CONFIG_DARK
}

fun UserPreferences.toData(): UserPreferencesEntity = UserPreferencesEntity(
    themeConfigEntity = this.darkThemeConfig.toData()
)