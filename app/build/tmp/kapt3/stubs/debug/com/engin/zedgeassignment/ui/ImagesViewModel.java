package com.engin.zedgeassignment.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.engin.zedgeassignment.data.remote.ImagesAPI;
import com.engin.zedgeassignment.data.remote.responses.ImageResult;
import com.engin.zedgeassignment.repository.ImageRepository;
import com.engin.zedgeassignment.paging.ImagesDataSource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/engin/zedgeassignment/ui/ImagesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/engin/zedgeassignment/repository/ImageRepository;", "imageApi", "Lcom/engin/zedgeassignment/data/remote/ImagesAPI;", "(Lcom/engin/zedgeassignment/repository/ImageRepository;Lcom/engin/zedgeassignment/data/remote/ImagesAPI;)V", "allImages", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/engin/zedgeassignment/data/remote/responses/ImageResult;", "getAllImages", "()Lkotlinx/coroutines/flow/Flow;", "favouriteImages", "Landroidx/lifecycle/LiveData;", "", "Lcom/engin/zedgeassignment/data/local/FavouriteImage;", "getFavouriteImages", "()Landroidx/lifecycle/LiveData;", "selectedImage", "Landroidx/lifecycle/MutableLiveData;", "setSelectedImage", "", "imageDetail", "app_debug"})
public final class ImagesViewModel extends androidx.lifecycle.ViewModel {
    private final com.engin.zedgeassignment.repository.ImageRepository repository = null;
    private final com.engin.zedgeassignment.data.remote.ImagesAPI imageApi = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.engin.zedgeassignment.data.local.FavouriteImage>> favouriteImages = null;
    private final androidx.lifecycle.MutableLiveData<com.engin.zedgeassignment.data.remote.responses.ImageResult> selectedImage = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.engin.zedgeassignment.data.remote.responses.ImageResult>> allImages = null;
    
    @javax.inject.Inject()
    public ImagesViewModel(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.repository.ImageRepository repository, @org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.remote.ImagesAPI imageApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.engin.zedgeassignment.data.local.FavouriteImage>> getFavouriteImages() {
        return null;
    }
    
    public final void setSelectedImage(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.remote.responses.ImageResult imageDetail) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.engin.zedgeassignment.data.remote.responses.ImageResult>> getAllImages() {
        return null;
    }
}