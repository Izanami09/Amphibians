package com.example.amphibians.ui

import com.example.amphibians.model.Amphibian

data class AmphibianAppUiState (
    val isContentLoading : Boolean = true,
    val listOfAmphibiansInformation : List<Amphibian> = listOf()
)