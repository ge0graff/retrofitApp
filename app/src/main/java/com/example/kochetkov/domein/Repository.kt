package com.example.kochetkov.domein

import com.example.kochetkov.data.Services.ImageApiService

interface Repository {
    suspend fun getImages(imageApiService: ImageApiService)
}