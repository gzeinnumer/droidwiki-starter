package com.raywenderlich.android.droidwiki.ui.search;

import com.raywenderlich.android.droidwiki.network.Wiki;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EntryPresenterImpl_Factory implements Factory<EntryPresenterImpl> {
  private final Provider<Wiki> wikiProvider;

  public EntryPresenterImpl_Factory(Provider<Wiki> wikiProvider) {
    assert wikiProvider != null;
    this.wikiProvider = wikiProvider;
  }

  @Override
  public EntryPresenterImpl get() {
    return new EntryPresenterImpl(wikiProvider.get());
  }

  public static Factory<EntryPresenterImpl> create(Provider<Wiki> wikiProvider) {
    return new EntryPresenterImpl_Factory(wikiProvider);
  }
}
