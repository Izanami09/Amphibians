package com.example.amphibians.ui.screens

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.amphibians.data.NetworkAmphibiansInformationRepository
import com.example.amphibians.model.Amphibian
import com.example.amphibians.ui.AmphibianAppUiState

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AmphibianViewModel @Inject constructor(private val amphibiansInformation: NetworkAmphibiansInformationRepository) : ViewModel() {
    private val _uiState = MutableStateFlow(AmphibianAppUiState())
    val uiState : StateFlow<AmphibianAppUiState> = _uiState.asStateFlow()
    init {
        getAmphibiansInformation()
    }

    private fun getAmphibiansInformation(){
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isContentLoading = true,
                    listOfAmphibiansInformation = amphibiansInformation.amphibiansInformationFromRepository()
                )
            }
        }
    }

}