package com.example.scenepick.core.data.impl

import com.example.scenepick.core.data.datasource.local.UserPreferencesDataSource
import com.example.scenepick.core.data.model.toEntity
import com.example.scenepick.core.domain.model.ThemeConfig
import com.example.scenepick.core.domain.model.UserPreferences
import com.example.scenepick.core.domain.repository.UserPreferencesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

internal class UserPreferencesRepositoryImpl @Inject constructor(
    private val userPreferencesDataSource: UserPreferencesDataSource,
) : UserPreferencesRepository {
    override val userPreferences: Flow<UserPreferences> =
        userPreferencesDataSource.userPreferences
            .map { it.toDomain() }

    override suspend fun setThemeConfig(themeConfig: ThemeConfig) {
        userPreferencesDataSource.setThemeConfig(themeConfig.toEntity())
    }
}