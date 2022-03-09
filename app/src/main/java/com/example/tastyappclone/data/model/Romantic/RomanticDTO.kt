package com.example.tastyappclone.data.model.Romantic


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class RomanticDTO(

	@field:SerializedName("data")
	val data: List<DataDTO?>? = null
)