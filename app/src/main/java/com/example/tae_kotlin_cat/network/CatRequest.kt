package com.example.tae_kotlin_cat.network

import com.example.tae_kotlin_cat.model.CatModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CatRequest {

    @GET("facts/random")

    fun getIdURL(@Query("animal_type") animalType: String,
                 @Query("amount")amount: String): Call<List<CatModel>>

}

//GET /facts/random