package com.example.scenepick.core.datastore.impl

import androidx.datastore.core.DataStore
import com.example.scenepick.core.data.datasource.UserPreferencesDataSource
import com.example.scenepick.core.data.model.ThemeConfigEntity
import com.example.scenepick.core.data.model.UserPreferencesEntity
import com.example.scenepick.core.datastore.UserPreferences
import com.example.scenepick.core.datastore.copy
import com.example.scenepick.core.datastore.mapper.toData
import com.example.scenepick.core.datastore.mapper.toLocal
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

internal class UserPreferencesDataSourceImpl @Inject constructor(
    private val userPreferencesDataStoreProto: DataStore<UserPreferences>
) : UserPreferencesDataSource {
    override val userPreferences: Flow<UserPreferencesEntity> =
        userPreferencesDataStoreProto.data.map { preferences ->
            UserPreferencesEntity(
                themeConfigEntity = preferences.darkThemeConfig.toData()
            )
        }

    override suspend fun setThemeConfig(themeConfig: ThemeConfigEntity) {
        userPreferencesDataStoreProto.updateData {
            it.copy {
                this.darkThemeConfig = themeConfig.toLocal()
            }
        }
    }
}