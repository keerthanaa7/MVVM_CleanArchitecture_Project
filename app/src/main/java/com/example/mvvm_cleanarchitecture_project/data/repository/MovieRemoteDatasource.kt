package com.example.mvvm_cleanarchitecture_project.data.repository

import com.example.mvvm_cleanarchitecture_project.data.model.movie.Movie
import com.example.mvvm_cleanarchitecture_project.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies(): Response<MovieList>
}
