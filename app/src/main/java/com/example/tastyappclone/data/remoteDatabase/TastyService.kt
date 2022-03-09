package com.example.tastyappclone.data.remoteDatabase


import com.example.tastyappclone.data.model.Kids.KidsDTO
import com.example.tastyappclone.data.model.Popular.PopularDTO
import com.example.tastyappclone.data.model.ResponseDTO
import com.example.tastyappclone.data.model.Thriller.ThrillerDTO
import retrofit2.Response
import retrofit2.http.GET


interface TastyService{
    @GET("5b7ee441-85e8-4cc8-95dc-da056caccdcd")
    suspend fun getDetails(

    ) : Response<ResponseDTO>
    @GET("0b4b8e78-ff2f-4b8b-8bd3-a5f7c9bdd300")
    suspend fun getKids():Response<KidsDTO>
    @GET("3331e1e3-cd07-4aad-a476-29954de2eec6")
    suspend fun getAction():Response<PopularDTO>
    @GET("709a1e5e-9ca2-4c72-b21d-cb0873119d5d")
    suspend fun getThriller():Response<ThrillerDTO>

}
