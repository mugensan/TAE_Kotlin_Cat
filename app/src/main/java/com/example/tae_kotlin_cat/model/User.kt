package com.example.tae_kotlin_cat.model
import com.google.gson.annotations.SerializedName

data class User (

	@SerializedName("_id") val _id : String,
	@SerializedName("name") val name : Name
)