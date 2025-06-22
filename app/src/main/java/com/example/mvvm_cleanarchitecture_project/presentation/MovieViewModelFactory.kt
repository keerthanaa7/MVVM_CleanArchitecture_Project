package com.example.mvvm_cleanarchitecture_project.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_cleanarchitecture_project.domain.GetMoviesUseCase
import com.example.mvvm_cleanarchitecture_project.domain.UpdateMovieUseCase

class MovieViewModelFactory(private val getMoviesUseCase: GetMoviesUseCase,
                            private val updateMovieUseCase: UpdateMovieUseCase
    ):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase, updateMovieUseCase) as T
    }
}