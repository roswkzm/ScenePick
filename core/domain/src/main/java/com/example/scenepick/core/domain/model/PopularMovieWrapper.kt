package com.example.scenepick.core.domain.model

data class PopularMovieWrapper(
    val page: Int,
    val summaryMovies: List<PopularMovie>,
    val totalPages: Int,
    val totalResults: Int
)
