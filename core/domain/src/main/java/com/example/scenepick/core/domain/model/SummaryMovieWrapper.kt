package com.example.scenepick.core.domain.model

data class SummaryMovieWrapper(
    val page : Int,
    val summaryMovies: List<SummaryMovie>,
    val totalPages : Int,
    val totalResults : Int
)
