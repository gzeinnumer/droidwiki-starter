package com.raywenderlich.android.droidwiki.ui.homepage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001d"}, d2 = {"Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepageActivity;", "Landroid/app/Activity;", "Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepageView;", "()V", "presenter", "Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepagePresenter;", "getPresenter", "()Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepagePresenter;", "setPresenter", "(Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepagePresenter;)V", "dismissLoading", "", "displayError", "error", "", "displayHomepage", "result", "Lcom/raywenderlich/android/droidwiki/model/WikiHomepage;", "displayLoading", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class HomepageActivity extends android.app.Activity implements com.raywenderlich.android.droidwiki.ui.homepage.HomepageView {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void displayLoading() {
    }
    
    @java.lang.Override()
    public void dismissLoading() {
    }
    
    @java.lang.Override()
    public void displayHomepage(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.model.WikiHomepage result) {
    }
    
    @java.lang.Override()
    public void displayError(@org.jetbrains.annotations.Nullable()
    java.lang.String error) {
    }
    
    public HomepageActivity() {
        super();
    }
}