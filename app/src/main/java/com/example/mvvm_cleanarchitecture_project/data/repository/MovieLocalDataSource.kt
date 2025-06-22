package com.example.mvvm_cleanarchitecture_project.data.repository

import com.example.mvvm_cleanarchitecture_project.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB():List<Movie>
    suspend fun saveMoviesToDB(movies:List<Movie>)
    suspend fun clearAll()
}