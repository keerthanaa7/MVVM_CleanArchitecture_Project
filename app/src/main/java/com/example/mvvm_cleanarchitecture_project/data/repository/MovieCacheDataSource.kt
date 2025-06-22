package com.example.mvvm_cleanarchitecture_project.data.repository

import com.example.mvvm_cleanarchitecture_project.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)
}