package com.example.mvvm_cleanarchitecture_project.presentation.di

import com.example.mvvm_cleanarchitecture_project.data.repository.MovieCacheDataSource
import com.example.mvvm_cleanarchitecture_project.data.repository.MovieLocalDataSource
import com.example.mvvm_cleanarchitecture_project.data.repository.MovieRemoteDatasource
import com.example.mvvm_cleanarchitecture_project.data.repository.MovieRepositoryImpl
import com.example.mvvm_cleanarchitecture_project.domain.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule() {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository
    {
        return MovieRepositoryImpl(movieCacheDataSource, movieRemoteDatasource, movieLocalDataSource)
    }

}