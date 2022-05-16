package com.engin.zedgeassignment.repository

import androidx.lifecycle.LiveData
import com.engin.zedgeassignment.data.local.FavouriteImage
import com.engin.zedgeassignment.data.remote.responses.ImageResponse
import com.engin.zedgeassignment.util.Resource

interface ImageRepository {

    suspend fun insertFavouriteImage(favouriteImage: FavouriteImage)

    suspend fun deleteFavouriteImage(favouriteImage: FavouriteImage)

    fun observeAllFavouriteImages(): LiveData<List<FavouriteImage>>

    suspend fun getImageList(page: Int): Resource<ImageResponse>

    fun isImageInFavourites(imageId: Int): LiveData<Boolean>
}