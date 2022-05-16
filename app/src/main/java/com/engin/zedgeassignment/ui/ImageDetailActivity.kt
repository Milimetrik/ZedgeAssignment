package com.engin.zedgeassignment.ui

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.engin.zedgeassignment.R
import com.engin.zedgeassignment.data.local.FavouriteImage
import com.engin.zedgeassignment.databinding.ActivityImageDetailBinding
import com.engin.zedgeassignment.util.Constants.IMAGE_ID
import com.engin.zedgeassignment.util.Constants.LARGE_IMAGE_URL
import com.engin.zedgeassignment.util.Constants.PREVIEW_URL
import com.engin.zedgeassignment.util.Constants.USER_NAME
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ImageDetailActivity: AppCompatActivity() {

    private lateinit var viewModel: ImageDetailViewModel
    private lateinit var binding: ActivityImageDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[ImageDetailViewModel::class.java]
        binding = ActivityImageDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intent.getIntExtra(IMAGE_ID, 0)
        val previewImageUrl = intent.getStringExtra(PREVIEW_URL) as String
        val largeImageUrl = intent.getStringExtra(LARGE_IMAGE_URL) as String
        val userName = intent.getStringExtra(USER_NAME) as String

        val favouriteImage = FavouriteImage(
            imageId,
            previewImageUrl,
            largeImageUrl,
            userName
        )

        viewModel.isImageInFavourites(imageId).observe (this, Observer {
            binding.chkLike.isChecked = it
        })

        Glide.with(this)
            .setDefaultRequestOptions(
                RequestOptions()
                    .placeholder(R.drawable.progress_animation)
                    .error(R.mipmap.ic_launcher)
            )
            .load(largeImageUrl)
            .into(binding.ivImage)

        binding.tvUser.text = userName

        binding.chkLike.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked) {
                viewModel.insertFavouriteImage(favouriteImage)
            } else {
                viewModel.deleteFavouriteImage(favouriteImage)
            }
        }

        binding.ivShare.setOnClickListener {
            Glide.with(this)
                .asBitmap()
                .load(largeImageUrl)
                .into(object : CustomTarget<Bitmap?>() {
                    override fun onResourceReady(
                        resource: Bitmap,
                        @Nullable transition: Transition<in Bitmap?>?
                    ) {
                        val sendIntent: Intent = Intent().apply {
                            action = Intent.ACTION_SEND
                            putExtra(Intent.EXTRA_STREAM, getBitmapFromView(resource))
                            type = "image/*"
                        }

                        val shareIntent = Intent.createChooser(sendIntent, null)
                        startActivity(shareIntent)
                    }

                    override fun onLoadCleared(@Nullable placeholder: Drawable?) {}
                })
        }
    }

    fun getBitmapFromView(bitmap:Bitmap): Uri {
        val bitmapPath = MediaStore.Images.Media.insertImage(
            contentResolver,
            bitmap,"title", null);
        return Uri.parse(bitmapPath);
    }
}