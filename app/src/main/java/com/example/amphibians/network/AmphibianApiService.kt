package com.example.amphibians.network

import com.example.amphibians.model.Amphibian
import retrofit2.http.GET

interface AmphibianApiService{
    //set of functions to communicate with server
    @GET("/amphibians")
    suspend fun getAmphibiansListFromServerSide() : List<Amphibian>
}
