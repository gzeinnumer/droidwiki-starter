package com.raywenderlich.android.droidwiki.network;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WikiApi_Factory implements Factory<WikiApi> {
  private final Provider<OkHttpClient> clientProvider;

  private final Provider<HttpUrl.Builder> requestBuilderProvider;

  public WikiApi_Factory(
      Provider<OkHttpClient> clientProvider, Provider<HttpUrl.Builder> requestBuilderProvider) {
    assert clientProvider != null;
    this.clientProvider = clientProvider;
    assert requestBuilderProvider != null;
    this.requestBuilderProvider = requestBuilderProvider;
  }

  @Override
  public WikiApi get() {
    return new WikiApi(clientProvider.get(), requestBuilderProvider.get());
  }

  public static Factory<WikiApi> create(
      Provider<OkHttpClient> clientProvider, Provider<HttpUrl.Builder> requestBuilderProvider) {
    return new WikiApi_Factory(clientProvider, requestBuilderProvider);
  }
}
