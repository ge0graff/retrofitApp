package com.example.kochetkov.data.repository

import com.example.kochetkov.data.Services.ImageApiService
import com.example.kochetkov.data.models.Images
import com.example.kochetkov.domein.Repository
import retrofit2.Response
import retrofit2.Retrofit

class Repository(private val imageApiService: ImageApiService): Repository {

    val service = imageApiService

    override suspend fun getImages() {
        return Retrofit.
    }
}