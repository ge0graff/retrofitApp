package com.example.kochetkov.data.repository

import com.example.kochetkov.data.Services.ImageApiService
import com.example.kochetkov.data.models.Images
import com.example.kochetkov.domain.ImageRepository
import retrofit2.Response

class ImageRepositoryImpl(private val api: ImageApiService): ImageRepository {

    override suspend fun getImages(): Response<Images>
        = api.getAllImage()

}