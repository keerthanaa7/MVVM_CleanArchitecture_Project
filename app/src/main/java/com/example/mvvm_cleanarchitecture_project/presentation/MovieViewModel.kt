package com.example.mvvm_cleanarchitecture_project.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.mvvm_cleanarchitecture_project.data.model.movie.Movie
import com.example.mvvm_cleanarchitecture_project.domain.GetMoviesUseCase
import com.example.mvvm_cleanarchitecture_project.domain.UpdateMovieUseCase

class MovieViewModel(private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMovieUseCase: UpdateMovieUseCase): ViewModel() {

        fun getMovies():LiveData<List<Movie>> = liveData {
            val movielist = getMoviesUseCase.execute()
            if (movielist != null) {
                emit(movielist)
            }
        }

    fun updateMovies():LiveData<List<Movie>> = liveData {
        val movieList = getMoviesUseCase.execute()
        if(movieList != null){
            emit(movieList)
        }

    }
}