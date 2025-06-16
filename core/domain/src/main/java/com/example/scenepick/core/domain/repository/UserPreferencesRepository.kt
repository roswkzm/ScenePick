package com.example.scenepick.core.domain.repository

import com.example.scenepick.core.domain.model.UserPreferences
import kotlinx.coroutines.flow.Flow

interface UserPreferencesRepository {
    val userPreferences: Flow<UserPreferences>

    suspend fun setThemeConfig(themeConfig: String)
}