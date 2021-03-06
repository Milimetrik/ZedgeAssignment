// Generated by Dagger (https://dagger.dev).
package com.engin.zedgeassignment.ui;

import com.engin.zedgeassignment.adapters.FavouriteImagesAdapter;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FavouriteImagesFragment_MembersInjector implements MembersInjector<FavouriteImagesFragment> {
  private final Provider<FavouriteImagesAdapter> favouriteImagesAdapterProvider;

  public FavouriteImagesFragment_MembersInjector(
      Provider<FavouriteImagesAdapter> favouriteImagesAdapterProvider) {
    this.favouriteImagesAdapterProvider = favouriteImagesAdapterProvider;
  }

  public static MembersInjector<FavouriteImagesFragment> create(
      Provider<FavouriteImagesAdapter> favouriteImagesAdapterProvider) {
    return new FavouriteImagesFragment_MembersInjector(favouriteImagesAdapterProvider);
  }

  @Override
  public void injectMembers(FavouriteImagesFragment instance) {
    injectFavouriteImagesAdapter(instance, favouriteImagesAdapterProvider.get());
  }

  @InjectedFieldSignature("com.engin.zedgeassignment.ui.FavouriteImagesFragment.favouriteImagesAdapter")
  public static void injectFavouriteImagesAdapter(FavouriteImagesFragment instance,
      FavouriteImagesAdapter favouriteImagesAdapter) {
    instance.favouriteImagesAdapter = favouriteImagesAdapter;
  }
}
