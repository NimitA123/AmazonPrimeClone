package com.example.tastyappclone.data.model.Popular


import com.google.gson.annotations.SerializedName


data class PopularDTO(

	@field:SerializedName("data")
	val data: List<PopularDataDTO?>? = null
)