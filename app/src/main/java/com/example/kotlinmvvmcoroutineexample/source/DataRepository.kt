package com.example.kotlinmvvmcoroutineexample.source

import com.example.kotlinmvvmcoroutineexample.api.MoviesApi
import com.example.kotlinmvvmcoroutineexample.model.Movies

/**
 * @author Lior Hazael
 */
class DataRepository(private val moviesApi: MoviesApi) {

   suspend fun getMovies() : Movies  = moviesApi.getMovies()

}