package com.example.kochetkov.ui.fragments.mainFragment


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kochetkov.data.models.Images
import com.example.kochetkov.domein.Repository
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit

class MainFragmentViewModel constructor(private val repository: Repository): ViewModel() {


    val imageList: MutableLiveData<Response<Images>> = MutableLiveData()

    fun getImage(){
        viewModelScope.launch {
           imageList.value = repository.getImages()
        }
    }


}