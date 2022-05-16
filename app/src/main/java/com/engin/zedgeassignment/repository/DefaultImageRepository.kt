package com.engin.zedgeassignment.repository

import androidx.lifecycle.LiveData
import com.engin.zedgeassignment.data.local.FavouriteImage
import com.engin.zedgeassignment.data.local.ImagesDao
import com.engin.zedgeassignment.data.remote.ImagesAPI
import com.engin.zedgeassignment.data.remote.responses.ImageResponse
import com.engin.zedgeassignment.util.Resource
import java.lang.Exception
import javax.inject.Inject

class DefaultImageRepository @Inject constructor(
    private val imagesDao: ImagesDao,
    private val imagesAPI: ImagesAPI
) : ImageRepository {

    override suspend fun insertFavouriteImage(favouriteImage: FavouriteImage) {
        imagesDao.insertFavouriteImage(favouriteImage)
    }

    override suspend fun deleteFavouriteImage(favouriteImage: FavouriteImage) {
        imagesDao.deleteFavouriteImage(favouriteImage)
    }

    override fun observeAllFavouriteImages(): LiveData<List<FavouriteImage>> {
        return imagesDao.observeAllFavouriteImages()
    }

    override suspend fun getImageList(page: Int): Resource<ImageResponse> {
        return try {
            val response = imagesAPI.getImageList(page) 

            if (response.isSuccessful) {
                response.body()?.let {
                    return@let Resource.success(it)
                } ?: Resource.error("An unknown error occured", null)
            } else {
                Resource.error("An unknown error occured", null)
            }
        } catch (ex: Exception) {
            Resource.error("Connection error!", null)
        }
    }

    override fun isImageInFavourites(imageId: Int): LiveData<Boolean> {
        return imagesDao.isImageInFavourites(imageId)
    }
}