package com.engin.zedgeassignment.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.RequestManager;
import com.engin.zedgeassignment.data.remote.responses.ImageResult;
import com.engin.zedgeassignment.databinding.ItemImageBinding;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0018\u0019B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001a\u0010\u0012\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ\u0012\u0010\u0014\u001a\u00020\t*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/engin/zedgeassignment/adapters/ImageAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/engin/zedgeassignment/data/remote/responses/ImageResult;", "Lcom/engin/zedgeassignment/adapters/ImageAdapter$ViewHolder;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "onItemClickListener", "Lkotlin/Function1;", "", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "loadImage", "Landroid/widget/ImageView;", "url", "", "ImagesComparator", "ViewHolder", "app_debug"})
public final class ImageAdapter extends androidx.paging.PagingDataAdapter<com.engin.zedgeassignment.data.remote.responses.ImageResult, com.engin.zedgeassignment.adapters.ImageAdapter.ViewHolder> {
    private final com.bumptech.glide.RequestManager glide = null;
    private kotlin.jvm.functions.Function1<? super com.engin.zedgeassignment.data.remote.responses.ImageResult, kotlin.Unit> onItemClickListener;
    
    @javax.inject.Inject()
    public ImageAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.engin.zedgeassignment.adapters.ImageAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.adapters.ImageAdapter.ViewHolder holder, int position) {
    }
    
    public final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImage, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.engin.zedgeassignment.data.remote.responses.ImageResult, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/engin/zedgeassignment/adapters/ImageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/engin/zedgeassignment/databinding/ItemImageBinding;", "(Lcom/engin/zedgeassignment/adapters/ImageAdapter;Lcom/engin/zedgeassignment/databinding/ItemImageBinding;)V", "bindImages", "", "item", "Lcom/engin/zedgeassignment/data/remote/responses/ImageResult;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.engin.zedgeassignment.databinding.ItemImageBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.engin.zedgeassignment.databinding.ItemImageBinding binding) {
            super(null);
        }
        
        public final void bindImages(@org.jetbrains.annotations.NotNull()
        com.engin.zedgeassignment.data.remote.responses.ImageResult item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/engin/zedgeassignment/adapters/ImageAdapter$ImagesComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/engin/zedgeassignment/data/remote/responses/ImageResult;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class ImagesComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.engin.zedgeassignment.data.remote.responses.ImageResult> {
        @org.jetbrains.annotations.NotNull()
        public static final com.engin.zedgeassignment.adapters.ImageAdapter.ImagesComparator INSTANCE = null;
        
        private ImagesComparator() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.engin.zedgeassignment.data.remote.responses.ImageResult oldItem, @org.jetbrains.annotations.NotNull()
        com.engin.zedgeassignment.data.remote.responses.ImageResult newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.engin.zedgeassignment.data.remote.responses.ImageResult oldItem, @org.jetbrains.annotations.NotNull()
        com.engin.zedgeassignment.data.remote.responses.ImageResult newItem) {
            return false;
        }
    }
}