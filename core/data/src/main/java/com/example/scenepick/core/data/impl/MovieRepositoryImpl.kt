package com.example.scenepick.core.data.impl

import com.example.scenepick.core.data.datasource.remote.MovieRemoteDataSource
import com.example.scenepick.core.domain.model.PopularMovieWrapper
import com.example.scenepick.core.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

internal class MovieRepositoryImpl @Inject constructor(
    private val movieRemoteDataSource: MovieRemoteDataSource,
) : MovieRepository {

    override fun getPopularMovieWrapper(page: Int): Flow<PopularMovieWrapper> =
        flow {
            val response = movieRemoteDataSource.getPopularMovies(page)
            emit(response.toDomain())
        }
}