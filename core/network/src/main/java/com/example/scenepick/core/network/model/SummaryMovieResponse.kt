package com.example.scenepick.core.network.model

import com.example.scenepick.core.data.model.SummaryMovieEntity
import com.example.scenepick.core.network.Constant
import com.example.scenepick.core.network.RemoteMapper
import kotlinx.serialization.SerialName
import java.util.Date

data class SummaryMovieResponse(
    @SerialName("id")
    val id: Int,
    @SerialName("title")
    val name: String,
    @SerialName("overview")
    val description: String,
    @SerialName("poster_path")
    val posterImagePath: String,
    @SerialName("vote_average")
    val rating: Float,
    @SerialName("vote_count")
    val rateCount: Int,
    @SerialName("release_date")
    val releasedAt: Date,
) : RemoteMapper<SummaryMovieEntity> {

    private val posterImageUrl: String
        get() = Constant.POSTER_IMAGE_PREFIX_URL + posterImagePath

    override fun toData(): SummaryMovieEntity =
        SummaryMovieEntity(id, name, description, posterImageUrl, rating, rateCount, releasedAt)

}
