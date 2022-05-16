package com.engin.zedgeassignment.di

import android.content.Context
import androidx.room.Room
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.engin.zedgeassignment.R
import com.engin.zedgeassignment.data.local.FavouriteImagesDatabase
import com.engin.zedgeassignment.data.local.ImagesDao
import com.engin.zedgeassignment.data.remote.ImagesAPI
import com.engin.zedgeassignment.repository.DefaultImageRepository
import com.engin.zedgeassignment.repository.ImageRepository
import com.engin.zedgeassignment.util.Constants.BASE_URL
import com.engin.zedgeassignment.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideFavouriteImagesDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, FavouriteImagesDatabase::class.java, DATABASE_NAME).build()

    @Singleton
    @Provides
    fun providesDefaultImageRepository(
        dao: ImagesDao,
        api: ImagesAPI
    ) = DefaultImageRepository(dao, api) as ImageRepository

    @Provides
    fun provideImagesDao(
        database: FavouriteImagesDatabase
    ) = database.imageDao()

    @Singleton
    @Provides
    fun provideImagesApi(): ImagesAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ImagesAPI::class.java)
    }

    @Singleton
    @Provides
    fun provideGlideInstance(
        @ApplicationContext context: Context
    ) = Glide.with(context).setDefaultRequestOptions(
        RequestOptions()
            .placeholder(R.drawable.progress_animation)
            .error(R.mipmap.ic_launcher)
            .diskCacheStrategy(DiskCacheStrategy.DATA)
    )
}