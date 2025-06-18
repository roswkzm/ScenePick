package com.example.scenepick.core.data.model

import com.example.scenepick.core.data.DataMapper
import com.example.scenepick.core.domain.model.SummaryMovieWrapper

data class SummaryMovieWrapperEntity(
    val page: Int,
    val summaryMovies: List<SummaryMovieEntity>,
    val totalPages: Int,
    val totalResults: Int
) : DataMapper<SummaryMovieWrapper> {
    override fun toDomain(): SummaryMovieWrapper {
        return SummaryMovieWrapper(
            page = page,
            summaryMovies = summaryMovies.map { it.toDomain() },
            totalPages = totalPages,
            totalResults = totalResults
        )
    }
}
