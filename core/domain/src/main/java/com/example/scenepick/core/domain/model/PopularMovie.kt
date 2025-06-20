package com.example.scenepick.core.domain.model

import java.util.Date

data class PopularMovie(
    val id: Int,
    val name: String,
    val description: String,
    val posterImageUrl: String,
    val rating: Float,
    val rateCount: Int,
    val releasedAt: Date,
)

