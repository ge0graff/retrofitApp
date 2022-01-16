package com.example.kochetkov.domain

import com.example.kochetkov.data.models.Images
import retrofit2.Response

interface ImageRepository {
    suspend fun getImages(): Response<Images>
}