package com.example.mvvm_cleanarchitecture_project.presentation.di

import com.example.mvvm_cleanarchitecture_project.data.api.TMDBService
import com.example.mvvm_cleanarchitecture_project.data.repository.MovieRemoteDataSourceImpl
import com.example.mvvm_cleanarchitecture_project.data.repository.MovieRemoteDatasource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apikey:String) {

    @Provides
    @Singleton
    fun provideMovieRemoteDatSource(tmdbService: TMDBService):MovieRemoteDatasource{
        return MovieRemoteDataSourceImpl(tmdbService, apikey)
    }

}