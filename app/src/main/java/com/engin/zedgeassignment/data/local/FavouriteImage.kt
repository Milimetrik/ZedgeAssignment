package com.engin.zedgeassignment.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favourite_images")
data class FavouriteImage (
    @PrimaryKey(autoGenerate = false)
    val id: Int?,
    var previewURL: String,
    var largeImageURL: String,
    var user: String
)