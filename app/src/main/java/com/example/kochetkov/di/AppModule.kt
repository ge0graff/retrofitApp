package com.example.kochetkov.di

import com.example.kochetkov.ui.fragments.mainFragment.MainFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel<MainFragmentViewModel> {
        MainFragmentViewModel(provideRetrofit())
    }
}



