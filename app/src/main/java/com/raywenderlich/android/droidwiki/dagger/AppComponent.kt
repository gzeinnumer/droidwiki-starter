package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity
import dagger.Component
import javax.inject.Singleton

//todo 5
@Singleton
@Component(modules = [AppModule::class, PresenterModule::class, NetworkModule::class, WikiModule::class])
interface AppComponent{

    //todo 9
    //daftarkan class yang dibutuhkan untuk inject, jika ada anotation dagger, maka daftar kan disini
    fun inject(target: HomepageActivity)
}