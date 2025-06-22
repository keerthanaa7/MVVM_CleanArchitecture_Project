package com.example.mvvm_cleanarchitecture_project.data.repository

import android.util.Log
import com.example.mvvm_cleanarchitecture_project.data.model.movie.Movie
import com.example.mvvm_cleanarchitecture_project.data.model.movie.MovieList
import com.example.mvvm_cleanarchitecture_project.domain.MovieRepository
import retrofit2.Response

class MovieRepositoryImpl(
    private val movieCacheDataSource: MovieCacheDataSource,
    private val movieRemoteDatasource: MovieRemoteDatasource,
    private val movieLocalDataSource: MovieLocalDataSource
) : MovieRepository {
    companion object {
        private var TAG = "MovieRepositoryImpl"
    }

    override suspend fun getMovies(): List<Movie>? {
        return getMoviesFromCache()
    }

    override suspend fun updateMovies(): List<Movie>? {
        val latestMovieList :List<Movie> = getMoviesFromApi()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMoviesToDB(latestMovieList)
        movieCacheDataSource.saveMoviesToCache(latestMovieList)
        return latestMovieList
    }

    suspend fun getMoviesFromApi(): List<Movie> {
        var movieList: List<Movie> = ArrayList<Movie>()
        try {
            val response: Response<MovieList> = movieRemoteDatasource.getMovies()
            val body: MovieList? = response.body()
            if (body != null) {
                movieList = body.movies.toList()
            }
        } catch (e: Exception) {
            Log.d(TAG, "exception")
        }
        return movieList
    }

    suspend fun getMoviesFromDB(): List<Movie> {
        var movieList: List<Movie> = ArrayList<Movie>()
        try {
            movieList = movieLocalDataSource.getMoviesFromDB()

        } catch (e: Exception) {
            Log.d(TAG, "exception")
        }
        if(movieList.size > 0){
            movieList = getMoviesFromApi()
            movieLocalDataSource.saveMoviesToDB(movieList)
        }
        return movieList
    }

    suspend fun getMoviesFromCache(): List<Movie> {
        var movieList: List<Movie> = ArrayList<Movie>()
        try {
            movieList = movieCacheDataSource.getMoviesFromCache()

        } catch (e: Exception) {
            Log.d(TAG, "exception")
        }
        if(movieList.size > 0){
            movieList = getMoviesFromDB()
            movieCacheDataSource.saveMoviesToCache(movieList)
        }
        return movieList
    }
}