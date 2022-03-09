package com.example.tastyappclone.data.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class ResponseDTO(

	@field:SerializedName("data")
	val data: List<DataDTO?>? = null
)