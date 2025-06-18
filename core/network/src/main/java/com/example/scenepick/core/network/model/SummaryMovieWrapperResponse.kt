package com.example.scenepick.core.network.model

import com.example.scenepick.core.data.model.SummaryMovieWrapperEntity
import com.example.scenepick.core.network.RemoteMapper
import kotlinx.serialization.SerialName

data class SummaryMovieWrapperResponse(
    @SerialName("page")
    val page: Int,
    @SerialName("results")
    val summaryMovies: List<SummaryMovieResponse>,
    @SerialName("total_pages")
    val totalPages: Int,
    @SerialName("total_results")
    val totalResults: Int,
) : RemoteMapper<SummaryMovieWrapperEntity> {
    override fun toData(): SummaryMovieWrapperEntity =
        SummaryMovieWrapperEntity(
            page = page,
            summaryMovies = summaryMovies.map { it.toData() },
            totalPages = totalPages,
            totalResults = totalResults
        )
}