package com.example.kochetkov.di

import com.example.kochetkov.data.Services.ImageApiService
import com.example.kochetkov.ui.fragments.mainFragment.MainFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainFragmentViewModel(provideRepository(get()))
    }

}