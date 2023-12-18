package com.example.amphibians.di

import com.example.amphibians.data.NetworkAmphibiansInformationRepository
import com.example.amphibians.network.AmphibianApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAmphibianApiService() : AmphibianApiService {
        val baseURL = "https://android-kotlin-fun-mars-server.appspot.com"
        val retrofit : Retrofit = Retrofit.Builder()
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .baseUrl(baseURL)
            .build()

        val retrofitService by lazy { retrofit.create(AmphibianApiService::class.java) }
        return retrofitService
    }

    @Provides
    @Singleton
    fun provideAmphibiansInformationRepository(amphibiansApi : AmphibianApiService) : NetworkAmphibiansInformationRepository {
        return NetworkAmphibiansInformationRepository(amphibiansApi)
    }
}