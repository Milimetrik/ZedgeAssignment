// Generated by Dagger (https://dagger.dev).
package com.engin.zedgeassignment.adapters;

import com.bumptech.glide.RequestManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FavouriteImagesAdapter_Factory implements Factory<FavouriteImagesAdapter> {
  private final Provider<RequestManager> glideProvider;

  public FavouriteImagesAdapter_Factory(Provider<RequestManager> glideProvider) {
    this.glideProvider = glideProvider;
  }

  @Override
  public FavouriteImagesAdapter get() {
    return newInstance(glideProvider.get());
  }

  public static FavouriteImagesAdapter_Factory create(Provider<RequestManager> glideProvider) {
    return new FavouriteImagesAdapter_Factory(glideProvider);
  }

  public static FavouriteImagesAdapter newInstance(RequestManager glide) {
    return new FavouriteImagesAdapter(glide);
  }
}