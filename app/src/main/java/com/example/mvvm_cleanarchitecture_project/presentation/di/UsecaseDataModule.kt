package com.example.mvvm_cleanarchitecture_project.presentation.di

import com.example.mvvm_cleanarchitecture_project.domain.GetMoviesUseCase
import com.example.mvvm_cleanarchitecture_project.domain.MovieRepository
import dagger.Module
import dagger.Provides

@Module
class UsecaseDataModule {

    @Provides
    fun provideGetMoviesUseCase(movieRepository: MovieRepository):GetMoviesUseCase{
        return GetMoviesUseCase(movieRepository)
    }


    @Provides
    fun provideUpdateMoviesUseCase(movieRepository: MovieRepository):GetMoviesUseCase{
        return GetMoviesUseCase(movieRepository)
    }
}