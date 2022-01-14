package com.example.kochetkov.data.Services

import com.example.kochetkov.data.models.Images
import retrofit2.Response
import retrofit2.http.GET

interface ImageApiService {

    @GET("task-m-001/list.php")
    suspend fun getAllImage(): Response<Images>
}