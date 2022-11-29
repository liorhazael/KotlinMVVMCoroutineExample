package com.example.kotlinmvvmcoroutineexample.api

import com.example.kotlinmvvmcoroutineexample.model.Movies
import retrofit2.http.GET

/**
 * @author Yaniv Zolicha
 */
interface RetrofitApi : MoviesApi {

	@GET("/json/moviesDemoItem.json")
	override suspend fun getMovies(): Movies

}