package com.example.amphibians.domain.repository

import com.example.amphibians.model.Amphibian
import com.example.amphibians.network.AmphibianApiService

interface AmphibiansInformationRepository {
    //writing function to be implemented inheriting class
    suspend fun amphibiansInformationFromRepository() : List<Amphibian>
}