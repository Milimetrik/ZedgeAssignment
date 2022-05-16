package com.engin.zedgeassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.engin.zedgeassignment.data.remote.responses.ImageResult
import com.engin.zedgeassignment.databinding.ItemImageBinding
import javax.inject.Inject

class ImageAdapter @Inject constructor(
    private val glide: RequestManager
): PagingDataAdapter<ImageResult, ImageAdapter.ViewHolder>(ImagesComparator) {

    private var onItemClickListener: ((ImageResult) -> Unit)? = null

    inner class ViewHolder(private val binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindImages(item: ImageResult, ) = with(binding) {
            ivImage.loadImage(item.previewURL)

            ivImage.setOnClickListener {
                onItemClickListener?.invoke(item)
            }
        }
    }

    object ImagesComparator : DiffUtil.ItemCallback<ImageResult>() {
        override fun areItemsTheSame(oldItem: ImageResult, newItem: ImageResult): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ImageResult, newItem: ImageResult): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemImageBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        item?.let { holder.bindImages(it) }
    }

    fun ImageView.loadImage(url: String) {
        glide.load(url).into(this)
    }

    fun setOnItemClickListener(listener: (ImageResult) -> Unit) {
        onItemClickListener = listener
    }
}