package com.example.tastyappclone.data.model.Popular


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class CastDTO(

	@field:SerializedName("Person1")
	val person1: String? = null,

	@field:SerializedName("Person1Image")
	val person1Image: String? = null,

	@field:SerializedName("Person2")
	val person2: String? = null,

	@field:SerializedName("Person2Image")
	val person2Image: String? = null,

	@field:SerializedName("Person3")
	val person3: String? = null,

	@field:SerializedName("Person3Image")
	val person3Image: String? = null
)