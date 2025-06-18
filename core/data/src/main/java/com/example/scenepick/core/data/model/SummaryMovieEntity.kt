package com.example.scenepick.core.data.model

import com.example.scenepick.core.data.DataMapper
import com.example.scenepick.core.domain.model.SummaryMovie
import java.util.Date

data class SummaryMovieEntity(
    val id: Int,
    val name: String,
    val description: String,
    val posterImageUrl: String,
    val rating: Float,
    val rateCount: Int,
    val releasedAt: Date,
) : DataMapper<SummaryMovie> {
    override fun toDomain(): SummaryMovie =
        SummaryMovie(id, name, description, posterImageUrl, rating, rateCount, releasedAt)
}

