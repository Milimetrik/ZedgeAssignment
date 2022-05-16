package com.engin.zedgeassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.engin.zedgeassignment.data.local.FavouriteImage
import com.engin.zedgeassignment.databinding.ItemFavouriteImageBinding
import javax.inject.Inject

class FavouriteImagesAdapter @Inject constructor(
    private val glide: RequestManager
): RecyclerView.Adapter<FavouriteImagesAdapter.ViewHolder>() {

    private var onItemClickListener: ((FavouriteImage) -> Unit)? = null

    inner class ViewHolder(private val binding: ItemFavouriteImageBinding): RecyclerView.ViewHolder(binding.root) {
        fun bindImages(item: FavouriteImage, ) = with(binding) {
            ivImage.loadImage(item.previewURL)

            ivImage.setOnClickListener {
                onItemClickListener?.invoke(item)
            }
        }
    }

    private val diffCallback = object : DiffUtil.ItemCallback<FavouriteImage>() {
        override fun areItemsTheSame(oldItem: FavouriteImage, newItem: FavouriteImage): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: FavouriteImage, newItem: FavouriteImage): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)

    var images: List<FavouriteImage>
        get() = differ.currentList
        set(value) = differ.submitList(value)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemFavouriteImageBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = images[position]
        item.let { holder.bindImages(it) }
    }

    override fun getItemCount(): Int {
        return images.size
    }

    fun ImageView.loadImage(url: String) {
        glide.load(url).into(this)
    }

    fun setOnItemClickListener(listener: (FavouriteImage) -> Unit) {
        onItemClickListener = listener
    }
}