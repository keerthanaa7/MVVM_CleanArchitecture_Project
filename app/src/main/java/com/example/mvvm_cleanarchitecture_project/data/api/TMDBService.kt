package com.example.mvvm_cleanarchitecture_project.data.api

import com.example.mvvm_cleanarchitecture_project.data.model.movie.MovieList
import com.example.mvvm_cleanarchitecture_project.data.model.people.PeopleList
import com.example.mvvm_cleanarchitecture_project.data.model.tvshow.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {
    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key")apikey:String):Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShow(@Query("api_key")apikey:String):Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularPeople(@Query("api_key")apikey:String):Response<PeopleList>
}