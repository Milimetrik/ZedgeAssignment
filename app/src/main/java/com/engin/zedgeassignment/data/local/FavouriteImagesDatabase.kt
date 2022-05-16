package com.engin.zedgeassignment.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [FavouriteImage::class],
    version = 1
)
abstract class FavouriteImagesDatabase : RoomDatabase() {
    abstract fun imageDao(): ImagesDao
}