package com.example.mvvm_cleanarchitecture_project.presentation.di

import com.example.mvvm_cleanarchitecture_project.data.db.MovieDao
import com.example.mvvm_cleanarchitecture_project.data.repository.MovieLocalDataSource
import com.example.mvvm_cleanarchitecture_project.data.repository.MovieLocalDataSourceimpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Provides
    @Singleton
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceimpl(movieDao)
    }
}