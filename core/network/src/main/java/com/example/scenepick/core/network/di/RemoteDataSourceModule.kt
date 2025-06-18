package com.example.scenepick.core.network.di

import com.example.scenepick.core.data.datasource.remote.MovieRemoteDataSource
import com.example.scenepick.core.network.impl.MovieRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RemoteDataSourceModule {

    @Binds
    @Singleton
    abstract fun bindMovieRemoteDataSource(source: MovieRemoteDataSourceImpl): MovieRemoteDataSource
}