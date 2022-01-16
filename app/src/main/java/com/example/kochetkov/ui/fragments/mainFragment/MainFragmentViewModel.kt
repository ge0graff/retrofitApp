package com.example.kochetkov.ui.fragments.mainFragment


import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.kochetkov.data.models.Images
import com.example.kochetkov.domain.ImageRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainFragmentViewModel constructor(private val imageRepository: ImageRepository) :
    ViewModel() {

    fun getImage() = liveData {
        val images = imageRepository.getImages()
        emit(images)
    }


}