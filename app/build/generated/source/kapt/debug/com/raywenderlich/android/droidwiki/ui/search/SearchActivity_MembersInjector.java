package com.raywenderlich.android.droidwiki.ui.search;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchActivity_MembersInjector implements MembersInjector<SearchActivity> {
  private final Provider<EntryPresenter> presenterProvider;

  public SearchActivity_MembersInjector(Provider<EntryPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<SearchActivity> create(Provider<EntryPresenter> presenterProvider) {
    return new SearchActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(SearchActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }
}
