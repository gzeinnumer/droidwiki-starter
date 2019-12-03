package com.raywenderlich.android.droidwiki.dagger;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.Nullable;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideRequestBuilderFactory implements Factory<HttpUrl.Builder> {
  private final NetworkModule module;

  private final Provider<String> baseUrlProvider;

  public NetworkModule_ProvideRequestBuilderFactory(
      NetworkModule module, Provider<String> baseUrlProvider) {
    assert module != null;
    this.module = module;
    assert baseUrlProvider != null;
    this.baseUrlProvider = baseUrlProvider;
  }

  @Override
  @Nullable
  public HttpUrl.Builder get() {
    return module.provideRequestBuilder(baseUrlProvider.get());
  }

  public static Factory<HttpUrl.Builder> create(
      NetworkModule module, Provider<String> baseUrlProvider) {
    return new NetworkModule_ProvideRequestBuilderFactory(module, baseUrlProvider);
  }
}
