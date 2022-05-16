package com.engin.zedgeassignment.di;

import android.content.Context;
import androidx.room.Room;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.engin.zedgeassignment.R;
import com.engin.zedgeassignment.data.local.FavouriteImagesDatabase;
import com.engin.zedgeassignment.data.local.ImagesDao;
import com.engin.zedgeassignment.data.remote.ImagesAPI;
import com.engin.zedgeassignment.repository.DefaultImageRepository;
import com.engin.zedgeassignment.repository.ImageRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/engin/zedgeassignment/di/AppModule;", "", "()V", "provideFavouriteImagesDatabase", "Lcom/engin/zedgeassignment/data/local/FavouriteImagesDatabase;", "context", "Landroid/content/Context;", "provideGlideInstance", "Lcom/bumptech/glide/RequestManager;", "provideImagesApi", "Lcom/engin/zedgeassignment/data/remote/ImagesAPI;", "provideImagesDao", "Lcom/engin/zedgeassignment/data/local/ImagesDao;", "database", "providesDefaultImageRepository", "Lcom/engin/zedgeassignment/repository/ImageRepository;", "dao", "api", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.engin.zedgeassignment.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.engin.zedgeassignment.data.local.FavouriteImagesDatabase provideFavouriteImagesDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.engin.zedgeassignment.repository.ImageRepository providesDefaultImageRepository(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.local.ImagesDao dao, @org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.remote.ImagesAPI api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.engin.zedgeassignment.data.local.ImagesDao provideImagesDao(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.data.local.FavouriteImagesDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.engin.zedgeassignment.data.remote.ImagesAPI provideImagesApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bumptech.glide.RequestManager provideGlideInstance(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
}