package com.example.kochetkov.data.repository

import com.example.kochetkov.data.Services.ImageApiService
import com.example.kochetkov.data.models.Images
import com.example.kochetkov.domein.Repository
import retrofit2.Response

class Repository(private val api: ImageApiService): Repository {

    override suspend fun getImages(): Response<Images> {
        return api.getAllImage()
    }
}