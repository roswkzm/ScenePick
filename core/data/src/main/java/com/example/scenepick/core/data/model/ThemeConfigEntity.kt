package com.example.scenepick.core.data.model

import com.example.scenepick.core.domain.model.ThemeConfig

enum class ThemeConfigEntity {
    FOLLOW_SYSTEM,
    LIGHT,
    DARK,
}

internal fun ThemeConfigEntity.toDomain(): ThemeConfig = when (this) {
    ThemeConfigEntity.FOLLOW_SYSTEM -> ThemeConfig.FOLLOW_SYSTEM
    ThemeConfigEntity.LIGHT -> ThemeConfig.LIGHT
    ThemeConfigEntity.DARK -> ThemeConfig.DARK
}

internal fun ThemeConfig.toEntity(): ThemeConfigEntity = when (this) {
    ThemeConfig.FOLLOW_SYSTEM -> ThemeConfigEntity.FOLLOW_SYSTEM
    ThemeConfig.LIGHT -> ThemeConfigEntity.LIGHT
    ThemeConfig.DARK -> ThemeConfigEntity.DARK
}