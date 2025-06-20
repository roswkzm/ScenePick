package com.example.scenepick.core.data.datasource.remote

import com.example.scenepick.core.data.model.PopularMovieWrapperEntity

interface MovieRemoteDataSource {
    suspend fun getPopularMovies(page: Int): PopularMovieWrapperEntity
}