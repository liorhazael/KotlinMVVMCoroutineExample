package com.example.kotlinmvvmcoroutineexample.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author Yaniv Zolicha
 */
object RetrofitApiImpl {

	val instance = Retrofit.Builder()
		.baseUrl("https://jsonparsingdemo-cec5b.firebase.com")
		.addConverterFactory(GsonConverterFactory.create())
		.build()
		.create(RetrofitApi::class.java)

}