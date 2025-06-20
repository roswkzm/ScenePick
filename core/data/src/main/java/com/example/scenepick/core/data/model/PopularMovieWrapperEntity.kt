package com.example.scenepick.core.data.model

import com.example.scenepick.core.data.DataMapper
import com.example.scenepick.core.domain.model.PopularMovieWrapper

data class PopularMovieWrapperEntity(
    val page: Int,
    val popularMovies: List<PopularMovieEntity>,
    val totalPages: Int,
    val totalResults: Int
) : DataMapper<PopularMovieWrapper> {

    override fun toDomain(): PopularMovieWrapper =
        PopularMovieWrapper(
            page = page,
            summaryMovies = popularMovies.map { it.toDomain() },
            totalPages = totalPages,
            totalResults = totalResults
        )
}