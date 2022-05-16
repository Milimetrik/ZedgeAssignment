package com.engin.zedgeassignment.repository;

import androidx.lifecycle.LiveData;
import com.engin.zedgeassignment.data.local.FavouriteImage;
import com.engin.zedgeassignment.data.local.ImagesDao;
import com.engin.zedgeassignment.data.remote.ImagesAPI;
import com.engin.zedgeassignment.data.remote.responses.ImageResponse;
import com.engin.zedgeassignment.util.Resource;
import java.lang.Exception;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00180\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/engin/zedgeassignment/repository/DefaultImageRepository;", "Lcom/engin/zedgeassignment/repository/ImageRepository;", "imagesDao", "Lcom/engin/zedgeassignment/data/local/ImagesDao;", "imagesAPI", "Lcom/engin/zedgeassignment/data/remote/ImagesAPI;", "(Lcom/engin/zedgeassignment/data/local/ImagesDao;Lcom/engin/zedgeassignment/data/remote/ImagesAPI;)V", "deleteFavouriteImage", "", "favouriteImage", "Lcom/engin/zedgeassignment/data/local/FavouriteImage;", "(Lcom/engin/zedgeassignment/data/local/FavouriteImage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImageList", "Lcom/engin/zedgeassignment/util/Resource;", "Lcom/engin/zedgeassignment/data/remote/responses/ImageResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFavouriteImage", "isImageInFavourites", "Landroidx/lifecycle/LiveData;", "", "imageId", "observeAllFavouriteImages", "", "app_debug"})
public final class DefaultImageRepository implements com.engin.zedgeassignment.repository.ImageRepository {
    private final com.engin.zedgeassignment.data.local.ImagesDao imagesDao = null;
    private final com.engin.zedgeassignment.data.remote.ImagesAPI imagesAPI = null;
    
    @javax.inject.Inject()
    public DefaultImageRepository(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.local.ImagesDao imagesDao, @org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.remote.ImagesAPI imagesAPI) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertFavouriteImage(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.local.FavouriteImage favouriteImage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteFavouriteImage(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.local.FavouriteImage favouriteImage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.engin.zedgeassignment.data.local.FavouriteImage>> observeAllFavouriteImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getImageList(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.engin.zedgeassignment.util.Resource<com.engin.zedgeassignment.data.remote.responses.ImageResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> isImageInFavourites(int imageId) {
        return null;
    }
}