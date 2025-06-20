package com.example.scenepick.core.network.model

import com.example.scenepick.core.data.model.PopularMovieWrapperEntity
import com.example.scenepick.core.network.RemoteMapper
import kotlinx.serialization.SerialName

data class PopularMovieWrapperResponse(
    @SerialName("page")
    var page: Int,
    @SerialName("results")
    var popularMovies: List<PopularMovieResponse>,
    @SerialName("total_pages")
    var totalPages: Int,
    @SerialName("total_results")
    var totalResults: Int,
) : RemoteMapper<PopularMovieWrapperEntity> {
    override fun toData(): PopularMovieWrapperEntity =
        PopularMovieWrapperEntity(
            page = page,
            popularMovies = popularMovies.map { it.toData() },
            totalPages = totalPages,
            totalResults = totalResults
        )
}