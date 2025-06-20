package com.example.scenepick.core.domain.repository

import com.example.scenepick.core.domain.model.PopularMovieWrapper
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun getPopularMovieWrapper(
        page: Int,
    ): Flow<PopularMovieWrapper>
}