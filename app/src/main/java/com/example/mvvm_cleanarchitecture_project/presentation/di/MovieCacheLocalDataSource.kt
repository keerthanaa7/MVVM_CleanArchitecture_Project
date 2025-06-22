package com.example.mvvm_cleanarchitecture_project.presentation.di

import com.example.mvvm_cleanarchitecture_project.data.repository.MovieCacheDataSource
import com.example.mvvm_cleanarchitecture_project.data.repository.MovieCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MovieCacheLocalDataSource {

    @Provides
    @Singleton
    fun provideMovieCacheLocalDataSource():MovieCacheDataSource{
        return MovieCacheDataSourceImpl()
    }
}