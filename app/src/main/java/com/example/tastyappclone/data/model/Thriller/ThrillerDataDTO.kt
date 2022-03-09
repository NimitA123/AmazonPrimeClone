package com.example.tastyappclone.data.model.Thriller


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class ThrillerDataDTO(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("MovieTrailerLink")
	val movieTrailerLink: String? = null,

	@field:SerializedName("Name")
	val name: String? = null,

	@field:SerializedName("Audio Language")
	val audioLanguage: String? = null,

	@field:SerializedName("Description")
	val description: String? = null,

	@field:SerializedName("Rating")
	val rating: String? = null,

	@field:SerializedName("Year")
	val year: String? = null,

	@field:SerializedName("Timing")
	val timing: String? = null,

	@field:SerializedName("Directors")
	val directors: String? = null,

	@field:SerializedName("DirectorImage")
	val directorImage: String? = null
)