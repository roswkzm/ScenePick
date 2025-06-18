package com.example.scenepick.core.data.datasource.remote

import com.example.scenepick.core.data.model.SummaryMovieEntity
import com.example.scenepick.core.data.model.SummaryMovieWrapperEntity

interface MovieRemoteDataSource {
    suspend fun getSummaryMovies(): SummaryMovieWrapperEntity
}