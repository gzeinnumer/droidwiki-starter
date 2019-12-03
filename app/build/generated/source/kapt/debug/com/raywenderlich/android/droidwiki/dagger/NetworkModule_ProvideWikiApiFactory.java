package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.network.WikiApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideWikiApiFactory implements Factory<WikiApi> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> clientProvider;

  private final Provider<HttpUrl.Builder> requestBuilderProvider;

  public NetworkModule_ProvideWikiApiFactory(
      NetworkModule module,
      Provider<OkHttpClient> clientProvider,
      Provider<HttpUrl.Builder> requestBuilderProvider) {
    assert module != null;
    this.module = module;
    assert clientProvider != null;
    this.clientProvider = clientProvider;
    assert requestBuilderProvider != null;
    this.requestBuilderProvider = requestBuilderProvider;
  }

  @Override
  public WikiApi get() {
    return Preconditions.checkNotNull(
        module.provideWikiApi(clientProvider.get(), requestBuilderProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<WikiApi> create(
      NetworkModule module,
      Provider<OkHttpClient> clientProvider,
      Provider<HttpUrl.Builder> requestBuilderProvider) {
    return new NetworkModule_ProvideWikiApiFactory(module, clientProvider, requestBuilderProvider);
  }
}
