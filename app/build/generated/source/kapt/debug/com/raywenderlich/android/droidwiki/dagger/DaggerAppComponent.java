package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.network.Homepage;
import com.raywenderlich.android.droidwiki.network.WikiApi;
import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity;
import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity_MembersInjector;
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<OkHttpClient> provideHttpClientProvider;

  private Provider<String> provideBaseUrlStringProvider;

  private Provider<HttpUrl.Builder> provideRequestBuilderProvider;

  private Provider<WikiApi> provideWikiApiProvider;

  private Provider<Homepage> provideHomePageProvider;

  private Provider<HomepagePresenter> provideHomepagePresenterProvider;

  private MembersInjector<HomepageActivity> homepageActivityMembersInjector;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideHttpClientProvider =
        DoubleCheck.provider(NetworkModule_ProvideHttpClientFactory.create(builder.networkModule));

    this.provideBaseUrlStringProvider =
        NetworkModule_ProvideBaseUrlStringFactory.create(builder.networkModule);

    this.provideRequestBuilderProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideRequestBuilderFactory.create(
                builder.networkModule, provideBaseUrlStringProvider));

    this.provideWikiApiProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideWikiApiFactory.create(
                builder.networkModule, provideHttpClientProvider, provideRequestBuilderProvider));

    this.provideHomePageProvider =
        DoubleCheck.provider(
            WikiModule_ProvideHomePageFactory.create(builder.wikiModule, provideWikiApiProvider));

    this.provideHomepagePresenterProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideHomepagePresenterFactory.create(
                builder.presenterModule, provideHomePageProvider));

    this.homepageActivityMembersInjector =
        HomepageActivity_MembersInjector.create(provideHomepagePresenterProvider);
  }

  @Override
  public void inject(HomepageActivity target) {
    homepageActivityMembersInjector.injectMembers(target);
  }

  public static final class Builder {
    private NetworkModule networkModule;

    private WikiModule wikiModule;

    private PresenterModule presenterModule;

    private Builder() {}

    public AppComponent build() {
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (wikiModule == null) {
        this.wikiModule = new WikiModule();
      }
      if (presenterModule == null) {
        this.presenterModule = new PresenterModule();
      }
      return new DaggerAppComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder presenterModule(PresenterModule presenterModule) {
      this.presenterModule = Preconditions.checkNotNull(presenterModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder wikiModule(WikiModule wikiModule) {
      this.wikiModule = Preconditions.checkNotNull(wikiModule);
      return this;
    }
  }
}
