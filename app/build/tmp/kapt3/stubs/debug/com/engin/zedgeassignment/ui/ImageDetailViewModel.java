package com.engin.zedgeassignment.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.engin.zedgeassignment.data.local.FavouriteImage;
import com.engin.zedgeassignment.repository.ImageRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/engin/zedgeassignment/ui/ImageDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/engin/zedgeassignment/repository/ImageRepository;", "(Lcom/engin/zedgeassignment/repository/ImageRepository;)V", "deleteFavouriteImage", "Lkotlinx/coroutines/Job;", "favouriteImage", "Lcom/engin/zedgeassignment/data/local/FavouriteImage;", "insertFavouriteImage", "isImageInFavourites", "Landroidx/lifecycle/LiveData;", "", "imageId", "", "app_debug"})
public final class ImageDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.engin.zedgeassignment.repository.ImageRepository repository = null;
    
    @javax.inject.Inject()
    public ImageDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.repository.ImageRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertFavouriteImage(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.local.FavouriteImage favouriteImage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteFavouriteImage(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.local.FavouriteImage favouriteImage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isImageInFavourites(int imageId) {
        return null;
    }
}