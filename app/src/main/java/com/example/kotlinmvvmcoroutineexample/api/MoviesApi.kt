package com.example.kotlinmvvmcoroutineexample.api

import com.example.kotlinmvvmcoroutineexample.model.Movies

/**
 * @author Lior Hazael
 */
interface MoviesApi {

    suspend fun getMovies(): Movies

}