package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.network.Homepage;
import com.raywenderlich.android.droidwiki.network.WikiApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WikiModule_ProvideHomePageFactory implements Factory<Homepage> {
  private final WikiModule module;

  private final Provider<WikiApi> apiProvider;

  public WikiModule_ProvideHomePageFactory(WikiModule module, Provider<WikiApi> apiProvider) {
    assert module != null;
    this.module = module;
    assert apiProvider != null;
    this.apiProvider = apiProvider;
  }

  @Override
  public Homepage get() {
    return Preconditions.checkNotNull(
        module.provideHomePage(apiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Homepage> create(WikiModule module, Provider<WikiApi> apiProvider) {
    return new WikiModule_ProvideHomePageFactory(module, apiProvider);
  }
}
