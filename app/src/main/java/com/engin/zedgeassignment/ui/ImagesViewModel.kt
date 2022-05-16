package com.engin.zedgeassignment.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.engin.zedgeassignment.data.remote.ImagesAPI
import com.engin.zedgeassignment.data.remote.responses.ImageResult
import com.engin.zedgeassignment.repository.ImageRepository
import com.engin.zedgeassignment.paging.ImagesDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ImagesViewModel @Inject constructor(
    private val repository: ImageRepository,
    private val imageApi: ImagesAPI
) : ViewModel() {

    val favouriteImages = repository.observeAllFavouriteImages()
    private val selectedImage = MutableLiveData<ImageResult>()

    fun setSelectedImage(imageDetail: ImageResult) {
        selectedImage.postValue(imageDetail)
    }

    val allImages =
        Pager(config = PagingConfig(pageSize = 10), pagingSourceFactory = {
            ImagesDataSource(imageApi)
        }).flow.cachedIn(viewModelScope)
}