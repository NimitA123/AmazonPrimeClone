package com.example.tastyappclone.reposirity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

import com.example.tastyappclone.data.model.Kids.KidsDTO
import com.example.tastyappclone.data.model.Popular.PopularDTO
import com.example.tastyappclone.data.model.ResponseDTO
import com.example.tastyappclone.data.model.Thriller.ThrillerDTO
import com.example.tastyappclone.data.remoteDatabase.TastyService

class TastyReposirity(private val apiService: TastyService) {
    var apiData = MutableLiveData<ResponseDTO>()
    val liveData:LiveData<ResponseDTO>
    get() = apiData
    var kidsData = MutableLiveData<KidsDTO>()
    val liveData1:LiveData<KidsDTO>
    get() = kidsData
    var ActionData = MutableLiveData<PopularDTO>()
    val liveData2:LiveData<PopularDTO>
    get() = ActionData
    var thrillerData = MutableLiveData<ThrillerDTO>()
    val liveData3:LiveData<ThrillerDTO>
    get() = thrillerData

    suspend fun getRetrofit(){
        //this  fetching popular movies data here from Api
        val response = apiService.getDetails()
        if(response.body()!= null){
            apiData.postValue(response.body())
        }
        //fetching the kids movies data here from Api
        val response1 = apiService.getKids()
        if(response1.body()!= null){
            kidsData.postValue(response1.body())

            }
        //fetching the Popular movies data here from Api
        val response2 = apiService.getAction()
        if(response2.body()!= null){
            ActionData.postValue(response2.body())

        }
        //fetching the Thriller movies data here from Api
        val response3 = apiService.getThriller()
        if(response3.body()!= null){
            thrillerData.postValue(response3.body())

        }

    }
    }

