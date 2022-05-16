package com.engin.zedgeassignment.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.RequestManager;
import com.engin.zedgeassignment.data.local.FavouriteImage;
import com.engin.zedgeassignment.databinding.ItemFavouriteImageBinding;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u001a\u0010\u001f\u001a\u00020\u00152\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0012\u0010!\u001a\u00020\u0015*\u00020\"2\u0006\u0010#\u001a\u00020$R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\b0\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/engin/zedgeassignment/adapters/FavouriteImagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/engin/zedgeassignment/adapters/FavouriteImagesAdapter$ViewHolder;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/engin/zedgeassignment/data/local/FavouriteImage;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "value", "", "images", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "onItemClickListener", "Lkotlin/Function1;", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "loadImage", "Landroid/widget/ImageView;", "url", "", "ViewHolder", "app_debug"})
public final class FavouriteImagesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.engin.zedgeassignment.adapters.FavouriteImagesAdapter.ViewHolder> {
    private final com.bumptech.glide.RequestManager glide = null;
    private kotlin.jvm.functions.Function1<? super com.engin.zedgeassignment.data.local.FavouriteImage, kotlin.Unit> onItemClickListener;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.engin.zedgeassignment.data.local.FavouriteImage> diffCallback = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.engin.zedgeassignment.data.local.FavouriteImage> differ = null;
    
    @javax.inject.Inject()
    public FavouriteImagesAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.engin.zedgeassignment.data.local.FavouriteImage> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.engin.zedgeassignment.data.local.FavouriteImage> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.engin.zedgeassignment.adapters.FavouriteImagesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.adapters.FavouriteImagesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImage, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.engin.zedgeassignment.data.local.FavouriteImage, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/engin/zedgeassignment/adapters/FavouriteImagesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/engin/zedgeassignment/databinding/ItemFavouriteImageBinding;", "(Lcom/engin/zedgeassignment/adapters/FavouriteImagesAdapter;Lcom/engin/zedgeassignment/databinding/ItemFavouriteImageBinding;)V", "bindImages", "", "item", "Lcom/engin/zedgeassignment/data/local/FavouriteImage;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.engin.zedgeassignment.databinding.ItemFavouriteImageBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.engin.zedgeassignment.databinding.ItemFavouriteImageBinding binding) {
            super(null);
        }
        
        public final void bindImages(@org.jetbrains.annotations.NotNull()
        com.engin.zedgeassignment.data.local.FavouriteImage item) {
        }
    }
}