package com.example.scenepick.core.data.datasource.remote

import com.example.scenepick.core.data.model.SummaryMovieEntity

interface MovieRemoteDataSource {
    suspend fun getSummaryMovies(): SummaryMovieEntity
}