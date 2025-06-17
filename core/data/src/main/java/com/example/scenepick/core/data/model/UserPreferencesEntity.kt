package com.example.scenepick.core.data.model

import com.example.scenepick.core.data.DataMapper
import com.example.scenepick.core.domain.model.UserPreferences

data class UserPreferencesEntity(
    val themeConfigEntity: ThemeConfigEntity,
) : DataMapper<UserPreferences> {

    override fun toDomain(): UserPreferences =
        UserPreferences(
            themeConfig = themeConfigEntity.toDomain(),
        )
}
