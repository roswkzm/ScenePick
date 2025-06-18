package com.example.scenepick.core.data.datasource.local

import com.example.scenepick.core.data.model.ThemeConfigEntity
import com.example.scenepick.core.data.model.UserPreferencesEntity
import kotlinx.coroutines.flow.Flow

interface UserPreferencesDataSource {
    val userPreferences: Flow<UserPreferencesEntity>

    suspend fun setThemeConfig(themeConfig: ThemeConfigEntity)
}