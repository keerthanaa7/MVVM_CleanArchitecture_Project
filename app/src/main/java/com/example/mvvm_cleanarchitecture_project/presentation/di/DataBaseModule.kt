package com.example.mvvm_cleanarchitecture_project.presentation.di

import android.content.Context
import androidx.room.Room
import com.example.mvvm_cleanarchitecture_project.data.db.MovieDao
import com.example.mvvm_cleanarchitecture_project.data.db.TMDBDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Provides
    @Singleton
    fun provideMovieDatabase(context: Context):TMDBDatabase{
        return Room.databaseBuilder(context, TMDBDatabase::class.java, "TMDBcLIENT").build()
    }

    @Provides
    @Singleton
    fun provideMovieDao(tmdbDatabase: TMDBDatabase):MovieDao{
        return tmdbDatabase.movieDao()
    }

}