package com.raywenderlich.android.droidwiki.ui.homepage;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomepageActivity_MembersInjector implements MembersInjector<HomepageActivity> {
  private final Provider<HomepagePresenter> presenterProvider;

  public HomepageActivity_MembersInjector(Provider<HomepagePresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<HomepageActivity> create(
      Provider<HomepagePresenter> presenterProvider) {
    return new HomepageActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(HomepageActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }
}
