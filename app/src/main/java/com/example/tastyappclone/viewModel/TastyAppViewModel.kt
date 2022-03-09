package com.example.tastyappclone.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.tastyappclone.data.model.Kids.KidsDTO
import com.example.tastyappclone.data.model.Popular.PopularDTO
import com.example.tastyappclone.data.model.ResponseDTO
import com.example.tastyappclone.data.model.Thriller.ThrillerDTO
import com.example.tastyappclone.data.model.Thriller.ThrillerDataDTO
import com.example.tastyappclone.reposirity.TastyReposirity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TastyAppViewModel(private val tastyResposirity: TastyReposirity) : ViewModel(){

     init{
          viewModelScope.launch(Dispatchers.IO) {
            tastyResposirity.getRetrofit()
          }
      }


    val tastyData:LiveData<ResponseDTO>
    get() = tastyResposirity.liveData
    val kidsData:LiveData<KidsDTO>
    get() = tastyResposirity.liveData1
    val actionData:LiveData<PopularDTO>
    get() = tastyResposirity.liveData2
    val thrillerData:LiveData<ThrillerDTO>
    get() = tastyResposirity.liveData3

}