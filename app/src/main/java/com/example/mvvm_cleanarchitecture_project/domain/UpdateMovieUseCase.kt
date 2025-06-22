package com.example.mvvm_cleanarchitecture_project.domain

import com.example.mvvm_cleanarchitecture_project.data.model.movie.Movie

class UpdateMovieUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()

}