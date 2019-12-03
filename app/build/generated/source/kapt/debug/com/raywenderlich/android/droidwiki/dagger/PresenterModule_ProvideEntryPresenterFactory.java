package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.network.Wiki;
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideEntryPresenterFactory implements Factory<EntryPresenter> {
  private final PresenterModule module;

  private final Provider<Wiki> wikiProvider;

  public PresenterModule_ProvideEntryPresenterFactory(
      PresenterModule module, Provider<Wiki> wikiProvider) {
    assert module != null;
    this.module = module;
    assert wikiProvider != null;
    this.wikiProvider = wikiProvider;
  }

  @Override
  public EntryPresenter get() {
    return Preconditions.checkNotNull(
        module.provideEntryPresenter(wikiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EntryPresenter> create(
      PresenterModule module, Provider<Wiki> wikiProvider) {
    return new PresenterModule_ProvideEntryPresenterFactory(module, wikiProvider);
  }
}
