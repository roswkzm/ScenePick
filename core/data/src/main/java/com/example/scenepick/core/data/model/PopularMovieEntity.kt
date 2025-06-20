package com.example.scenepick.core.data.model

import com.example.scenepick.core.data.DataMapper
import com.example.scenepick.core.domain.model.PopularMovie
import java.util.Date

data class PopularMovieEntity(
    val id: Int,
    val name: String,
    val description: String,
    val posterImageUrl: String,
    val rating: Float,
    val rateCount: Int,
    val releaseDate: Date,
) : DataMapper<PopularMovie> {

    override fun toDomain(): PopularMovie =
        PopularMovie(
            id = id,
            name = name,
            description = description,
            posterImageUrl = posterImageUrl,
            rating = rating,
            rateCount = rateCount,
            releasedAt = releaseDate
        )
}
