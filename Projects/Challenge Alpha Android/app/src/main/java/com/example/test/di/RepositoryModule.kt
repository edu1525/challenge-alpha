package com.example.test.di

import com.example.test.data.datasources.network.StarWarsApi
import com.example.test.data.repositories.home.PeopleRepositoryImpl
import com.example.test.domain.repositories.home.PeopleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun providesPeopleRepository(StarWarsApi: StarWarsApi): PeopleRepository = PeopleRepositoryImpl(StarWarsApi)

}