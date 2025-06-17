package com.example.scenepick.core.datastore.di

import com.example.scenepick.core.data.datasource.UserPreferencesDataSource
import com.example.scenepick.core.datastore.impl.UserPreferencesDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataStoreModule {

    @Binds
    @Singleton
    abstract fun bindUserPreferencesDataSource(
        dataSourceImpl: UserPreferencesDataSourceImpl
    ): UserPreferencesDataSource
}