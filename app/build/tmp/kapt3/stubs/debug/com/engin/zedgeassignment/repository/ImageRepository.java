package com.engin.zedgeassignment.repository;

import androidx.lifecycle.LiveData;
import com.engin.zedgeassignment.data.local.FavouriteImage;
import com.engin.zedgeassignment.data.remote.responses.ImageResponse;
import com.engin.zedgeassignment.util.Resource;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00130\u000fH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/engin/zedgeassignment/repository/ImageRepository;", "", "deleteFavouriteImage", "", "favouriteImage", "Lcom/engin/zedgeassignment/data/local/FavouriteImage;", "(Lcom/engin/zedgeassignment/data/local/FavouriteImage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImageList", "Lcom/engin/zedgeassignment/util/Resource;", "Lcom/engin/zedgeassignment/data/remote/responses/ImageResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFavouriteImage", "isImageInFavourites", "Landroidx/lifecycle/LiveData;", "", "imageId", "observeAllFavouriteImages", "", "app_debug"})
public abstract interface ImageRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertFavouriteImage(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.local.FavouriteImage favouriteImage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteFavouriteImage(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.local.FavouriteImage favouriteImage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.engin.zedgeassignment.data.local.FavouriteImage>> observeAllFavouriteImages();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getImageList(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.engin.zedgeassignment.util.Resource<com.engin.zedgeassignment.data.remote.responses.ImageResponse>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> isImageInFavourites(int imageId);
}