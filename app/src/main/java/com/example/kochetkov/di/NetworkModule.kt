package com.example.kochetkov.di

import com.example.kochetkov.data.Services.ImageApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single { provideRetrofit(get()) }
    factory { provideOkHttpClient() }
    factory { provideApiService(get()) }
}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl("http://dev-tasks.alef.im/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create()).build()
}

fun provideApiService(retrofit: Retrofit): ImageApiService {
    return retrofit.create(ImageApiService::class.java)
}

private fun provideOkHttpClient(): OkHttpClient =
    OkHttpClient().newBuilder().build()




