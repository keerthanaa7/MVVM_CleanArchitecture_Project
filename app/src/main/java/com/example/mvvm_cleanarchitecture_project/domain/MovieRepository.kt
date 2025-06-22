package com.example.mvvm_cleanarchitecture_project.domain

import com.example.mvvm_cleanarchitecture_project.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}