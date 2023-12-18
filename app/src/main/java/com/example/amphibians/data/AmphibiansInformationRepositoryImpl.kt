package com.example.amphibians.data

import com.example.amphibians.domain.repository.AmphibiansInformationRepository
import com.example.amphibians.model.Amphibian
import com.example.amphibians.network.AmphibianApiService
import javax.inject.Inject


class NetworkAmphibiansInformationRepository @Inject constructor(
    private val amphibianApiService: AmphibianApiService
) : AmphibiansInformationRepository {
    override suspend fun amphibiansInformationFromRepository(): List<Amphibian> {
        return amphibianApiService.getAmphibiansListFromServerSide()
    }
}
