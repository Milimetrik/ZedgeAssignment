package com.engin.zedgeassignment.data.local

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ImagesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavouriteImage(favouriteImage: FavouriteImage)

    @Delete
    suspend fun deleteFavouriteImage(favouriteImage: FavouriteImage)

    @Query("SELECT * from favourite_images")
    fun observeAllFavouriteImages(): LiveData<List<FavouriteImage>>

    @Query("SELECT EXISTS (SELECT * from favourite_images where id = :imageId)")
    fun isImageInFavourites(imageId: Int): LiveData<Boolean>
}