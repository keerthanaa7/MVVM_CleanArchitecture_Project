package com.example.mvvm_cleanarchitecture_project.data.repository

import com.example.mvvm_cleanarchitecture_project.data.model.movie.Movie

class MovieCacheDataSourceImpl:MovieCacheDataSource {
    private var movieList:MutableList<Movie> = ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
       return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
       movieList.clear()
        movieList = ArrayList(movies)
    }
}