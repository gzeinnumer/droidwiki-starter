package com.raywenderlich.android.droidwiki.ui.homepage;

import com.raywenderlich.android.droidwiki.network.Homepage;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomepagePresenterImpl_Factory implements Factory<HomepagePresenterImpl> {
  private final Provider<Homepage> homepageProvider;

  public HomepagePresenterImpl_Factory(Provider<Homepage> homepageProvider) {
    assert homepageProvider != null;
    this.homepageProvider = homepageProvider;
  }

  @Override
  public HomepagePresenterImpl get() {
    return new HomepagePresenterImpl(homepageProvider.get());
  }

  public static Factory<HomepagePresenterImpl> create(Provider<Homepage> homepageProvider) {
    return new HomepagePresenterImpl_Factory(homepageProvider);
  }
}
