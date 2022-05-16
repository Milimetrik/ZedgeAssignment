package com.engin.zedgeassignment.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.engin.zedgeassignment.data.local.FavouriteImage
import com.engin.zedgeassignment.repository.ImageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ImageDetailViewModel @Inject constructor(
    private val repository: ImageRepository
): ViewModel() {

    fun insertFavouriteImage(favouriteImage: FavouriteImage) = viewModelScope.launch {
        repository.insertFavouriteImage(favouriteImage)
    }

    fun deleteFavouriteImage(favouriteImage: FavouriteImage) = viewModelScope.launch {
        repository.deleteFavouriteImage(favouriteImage)
    }

    fun isImageInFavourites(imageId: Int): LiveData<Boolean> {
        return repository.isImageInFavourites(imageId)
     }
}