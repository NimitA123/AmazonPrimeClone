package com.example.tastyappclone.data.model.Romantic


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class DataDTO(

	@field:SerializedName("MovieName")
	val movieName: String? = null,

	@field:SerializedName("MovieTrailerLink")
	val movieTrailerLink: String? = null,

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("Rating")
	val rating: String? = null,

	@field:SerializedName("Year")
	val year: String? = null,

	@field:SerializedName("Timing")
	val timing: String? = null,

	@field:SerializedName("Language")
	val language: String? = null,

	@field:SerializedName("Director")
	val director: String? = null,

	@field:SerializedName("DirectorImage")
	val directorImage: String? = null
)