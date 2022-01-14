package com.example.kochetkov.di

import com.example.kochetkov.data.Services.ImageApiService
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {

    single { provideRetrofit() }
    factory { provideApiService(get()) }
}



fun provideRetrofit(): Retrofit {
    return Retrofit.Builder().baseUrl("https://dev-tasks.alef.im/")
        .addConverterFactory(GsonConverterFactory.create()).build()
}

fun provideApiService(retrofit: Retrofit): ImageApiService{
    return retrofit.create(ImageApiService::class.java)
}




