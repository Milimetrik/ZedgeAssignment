package com.engin.zedgeassignment.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.engin.zedgeassignment.adapters.ImageAdapter;
import com.engin.zedgeassignment.databinding.FragmentImageListBinding;
import com.engin.zedgeassignment.util.Constants;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\""}, d2 = {"Lcom/engin/zedgeassignment/ui/ImageListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/engin/zedgeassignment/databinding/FragmentImageListBinding;", "binding", "getBinding", "()Lcom/engin/zedgeassignment/databinding/FragmentImageListBinding;", "imageAdapter", "Lcom/engin/zedgeassignment/adapters/ImageAdapter;", "getImageAdapter", "()Lcom/engin/zedgeassignment/adapters/ImageAdapter;", "setImageAdapter", "(Lcom/engin/zedgeassignment/adapters/ImageAdapter;)V", "viewModel", "Lcom/engin/zedgeassignment/ui/ImagesViewModel;", "getViewModel", "()Lcom/engin/zedgeassignment/ui/ImagesViewModel;", "setViewModel", "(Lcom/engin/zedgeassignment/ui/ImagesViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "setupList", "setupRecyclerView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ImageListFragment extends androidx.fragment.app.Fragment {
    private com.engin.zedgeassignment.databinding.FragmentImageListBinding _binding;
    public com.engin.zedgeassignment.ui.ImagesViewModel viewModel;
    @javax.inject.Inject()
    public com.engin.zedgeassignment.adapters.ImageAdapter imageAdapter;
    
    public ImageListFragment() {
        super();
    }
    
    private final com.engin.zedgeassignment.databinding.FragmentImageListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.engin.zedgeassignment.ui.ImagesViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.ui.ImagesViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.engin.zedgeassignment.adapters.ImageAdapter getImageAdapter() {
        return null;
    }
    
    public final void setImageAdapter(@org.jetbrains.annotations.NotNull()
    com.engin.zedgeassignment.adapters.ImageAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupList() {
    }
}