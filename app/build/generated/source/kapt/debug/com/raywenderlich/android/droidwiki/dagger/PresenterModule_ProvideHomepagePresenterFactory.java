package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.network.Homepage;
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideHomepagePresenterFactory
    implements Factory<HomepagePresenter> {
  private final PresenterModule module;

  private final Provider<Homepage> homepageProvider;

  public PresenterModule_ProvideHomepagePresenterFactory(
      PresenterModule module, Provider<Homepage> homepageProvider) {
    assert module != null;
    this.module = module;
    assert homepageProvider != null;
    this.homepageProvider = homepageProvider;
  }

  @Override
  public HomepagePresenter get() {
    return Preconditions.checkNotNull(
        module.provideHomepagePresenter(homepageProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HomepagePresenter> create(
      PresenterModule module, Provider<Homepage> homepageProvider) {
    return new PresenterModule_ProvideHomepagePresenterFactory(module, homepageProvider);
  }
}
