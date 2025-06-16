package com.example.scenepick.core.domain.usecase

import com.example.scenepick.core.domain.model.UserPreferences
import com.example.scenepick.core.domain.repository.UserPreferencesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserPreferencesUseCase @Inject constructor(
    private val userPreferencesRepository: UserPreferencesRepository
) {
    operator fun invoke(): Flow<UserPreferences> =
        userPreferencesRepository.userPreferences
}