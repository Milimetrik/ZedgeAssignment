package com.engin.zedgeassignment.data.local;

import androidx.lifecycle.LiveData;
import androidx.room.*;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\tH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/engin/zedgeassignment/data/local/ImagesDao;", "", "deleteFavouriteImage", "", "favouriteImage", "Lcom/engin/zedgeassignment/data/local/FavouriteImage;", "(Lcom/engin/zedgeassignment/data/local/FavouriteImage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFavouriteImage", "isImageInFavourites", "Landroidx/lifecycle/LiveData;", "", "imageId", "", "observeAllFavouriteImages", "", "app_debug"})
public abstract interface ImagesDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertFavouriteImage(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.local.FavouriteImage favouriteImage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteFavouriteImage(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.local.FavouriteImage favouriteImage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from favourite_images")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.engin.zedgeassignment.data.local.FavouriteImage>> observeAllFavouriteImages();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT EXISTS (SELECT * from favourite_images where id = :imageId)")
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> isImageInFavourites(int imageId);
}