package com.example.kochetkov.di

import com.example.kochetkov.data.Services.ImageApiService
import com.example.kochetkov.data.repository.ImageRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    single { provideRepository(get()) }

}

    fun provideRepository(api: ImageApiService): ImageRepositoryImpl {
        return ImageRepositoryImpl(api)
    }