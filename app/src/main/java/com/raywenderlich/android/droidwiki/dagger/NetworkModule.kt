package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.WikiApi
import com.raywenderlich.android.droidwiki.utils.Const
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import javax.inject.Named
import javax.inject.Singleton

//todo 16
//daftarkan di AppModule
@Module
class NetworkModule {

    //todo 17
    companion object {
        private const val NAME_BASE_URL = "NAME_BASE_URL"
    }

    @Provides
    @Named(NAME_BASE_URL)
    fun provideBaseUrlString() = "${Const.PROTOCOL}://${Const.LANGUAGE}.${Const.BASE_URL}"


    //todo 18
    //ini akan dibutuhkan untuk membuat koneksi, hasil akan di return
    @Provides
    @Singleton
    fun provideHttpClient() = OkHttpClient()

    @Provides
    @Singleton
    fun provideRequestBuilder(@Named(NAME_BASE_URL) baseUrl: String) =
            HttpUrl.parse(baseUrl)?.newBuilder()

    @Provides
    @Singleton
    fun provideWikiApi(client: OkHttpClient, requestBuilder: HttpUrl.Builder?) = WikiApi(client, requestBuilder)
}