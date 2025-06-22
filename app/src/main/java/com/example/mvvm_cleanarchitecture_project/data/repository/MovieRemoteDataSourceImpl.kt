package com.example.mvvm_cleanarchitecture_project.data.repository

import com.example.mvvm_cleanarchitecture_project.data.api.TMDBService
import com.example.mvvm_cleanarchitecture_project.data.model.movie.Movie
import com.example.mvvm_cleanarchitecture_project.data.model.movie.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apikey: String
) : MovieRemoteDatasource {
    override suspend fun getMovies():Response<MovieList> {
        return tmdbService.getPopularMovies(apikey)
    }
}