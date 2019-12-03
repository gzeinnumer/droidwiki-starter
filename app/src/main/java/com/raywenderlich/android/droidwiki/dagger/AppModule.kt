package com.raywenderlich.android.droidwiki.dagger

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


//todo 3
@Module
class AppModule(private val app: Application){
    //todo 4
    //jika kamu mencari context, maka secara cepat dagger akan mencarikan
    // return yang pass untuk mu, Context cukup hanya 1
    //jadi kita butuh @Singleton,
    //@Provides akan menjadi list jika Context di cari,
    // jika kamu mencari kontext maka dagger akan mencari fungsi yang menggunakan
    // anotation @Provides yang mereturn COntext
    @Provides
    @Singleton
    fun provideContext(): Context = app
}