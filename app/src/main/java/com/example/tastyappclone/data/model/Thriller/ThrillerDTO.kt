package com.example.tastyappclone.data.model.Thriller


import com.google.gson.annotations.SerializedName


data class ThrillerDTO(

	@field:SerializedName("data")
	val data: List<ThrillerDataDTO?>? = null
)