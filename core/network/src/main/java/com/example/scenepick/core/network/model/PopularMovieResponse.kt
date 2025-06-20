package com.example.scenepick.core.network.model

import com.example.scenepick.core.data.model.PopularMovieEntity
import com.example.scenepick.core.network.Constant
import com.example.scenepick.core.network.RemoteMapper
import kotlinx.serialization.SerialName
import java.util.Date

data class PopularMovieResponse(
    @SerialName("adult")
    var adult: Boolean,
    @SerialName("backdrop_path")
    var backdropPath: String,
    @SerialName("genre_ids")
    var genreIds: List<Int>,
    @SerialName("id")
    var id: Int,
    @SerialName("original_language")
    var originalLanguage: String,
    @SerialName("original_title")
    var originalTitle: String,
    @SerialName("overview")
    var description: String,
    @SerialName("popularity")
    var popularity: Double,
    @SerialName("poster_path")
    var posterImagePath: String,
    @SerialName("release_date")
    var releaseDate: Date,
    @SerialName("title")
    var name: String,
    @SerialName("video")
    var video: Boolean,
    @SerialName("vote_average")
    var rating: Float,
    @SerialName("vote_count")
    var rateCount: Int
) : RemoteMapper<PopularMovieEntity> {
    private val posterImageUrl: String
        get() = Constant.POSTER_IMAGE_PREFIX_URL + posterImagePath

    override fun toData(): PopularMovieEntity =
        PopularMovieEntity(id, name, description, posterImageUrl, rating, rateCount, releaseDate)
}
