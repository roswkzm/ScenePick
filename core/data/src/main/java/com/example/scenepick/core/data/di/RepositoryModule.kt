package com.example.scenepick.core.data.di

import com.example.scenepick.core.data.impl.UserPreferencesRepositoryImpl
import com.example.scenepick.core.domain.repository.UserPreferencesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindUserPreferencesRepository(repo: UserPreferencesRepositoryImpl): UserPreferencesRepository

}