package com.example.scenepick.core.network.impl

import com.example.scenepick.core.data.datasource.remote.MovieRemoteDataSource
import com.example.scenepick.core.data.model.SummaryMovieEntity
import com.example.scenepick.core.network.model.SummaryMovieResponse
import kotlinx.serialization.json.Json
import okhttp3.Call
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.Locale
import javax.inject.Inject
import javax.inject.Singleton

private interface RetrofitMovieNetworkApi {
    @GET("discover/movie?&sort_by=popularity.desc")
    suspend fun getSummaryMovies(
        @Query("language") language: String,
        @Query("region") country: String,
    ): SummaryMovieResponse
}

private const val BASE_URL = "https://api.themoviedb.org/3/"

@Singleton
internal class MovieRemoteDataSourceImpl @Inject constructor(
    networkJson: Json,
    okhttpCallFactory: dagger.Lazy<Call.Factory>,
) : MovieRemoteDataSource {

    private val networkApi =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .callFactory { okhttpCallFactory.get().newCall(it) }
            .addConverterFactory(
                networkJson.asConverterFactory("application/json".toMediaType()),
            )
            .build()
            .create(RetrofitMovieNetworkApi::class.java)

    override suspend fun getSummaryMovies(): SummaryMovieEntity =
        networkApi.getSummaryMovies(Locale.getDefault().language, Locale.getDefault().country)
            .toData()
}