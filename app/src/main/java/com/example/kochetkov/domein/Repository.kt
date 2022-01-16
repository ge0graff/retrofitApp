package com.example.kochetkov.domein

import com.example.kochetkov.data.models.Images
import retrofit2.Response

interface Repository {
    suspend fun getImages(): Response<Images>
}