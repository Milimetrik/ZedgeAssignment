package com.engin.zedgeassignment.data.remote

import com.engin.zedgeassignment.BuildConfig
import com.engin.zedgeassignment.data.remote.responses.ImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ImagesAPI {

    @GET("/api/")
    suspend fun getImageList(
        @Query("page") page: Int,
        @Query("key") apiKey: String = BuildConfig.API_KEY
    ): Response<ImageResponse>
}