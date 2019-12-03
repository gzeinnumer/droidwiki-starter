package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.Wiki
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

//todo 10
//daftarkan di AppModule
@Module
class PresenterModule {
    //todo 11
    //karna disini kita menggunakan MVP, maka kita butuh men inject Presenter dengan cara
    //return Presenter(this)
    //tapi dengan dagger, ita cukup men @Inject dan membuatkan provide nya, seperti context sebelumnya
    @Singleton
    @Provides
    fun provideHomepagePresenter(homepage: Homepage): HomepagePresenter = HomepagePresenterImpl(homepage)

    //todo 12
    //daftarkan semua class dengan anotation @Module ke AppComponent ke dalam anotation @Component

    @Singleton
    @Provides
    fun provideEntryPresenter(wiki: Wiki): EntryPresenter = EntryPresenterImpl(wiki)
}