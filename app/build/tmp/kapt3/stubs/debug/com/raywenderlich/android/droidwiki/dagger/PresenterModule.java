package com.raywenderlich.android.droidwiki.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/droidwiki/dagger/PresenterModule;", "", "()V", "provideEntryPresenter", "Lcom/raywenderlich/android/droidwiki/ui/search/EntryPresenter;", "wiki", "Lcom/raywenderlich/android/droidwiki/network/Wiki;", "provideHomepagePresenter", "Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepagePresenter;", "homepage", "Lcom/raywenderlich/android/droidwiki/network/Homepage;", "app_debug"})
@dagger.Module()
public final class PresenterModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter provideHomepagePresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.network.Homepage homepage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.raywenderlich.android.droidwiki.ui.search.EntryPresenter provideEntryPresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.network.Wiki wiki) {
        return null;
    }
    
    public PresenterModule() {
        super();
    }
}