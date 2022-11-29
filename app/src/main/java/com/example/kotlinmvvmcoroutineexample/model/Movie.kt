package com.example.kotlinmvvmcoroutineexample.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * @author Lior Hazael
 */
@Parcelize
data class Movies(
	val movies: List<Movie>
) : Parcelable

@Parcelize
data class Movie(
	val movie: String,
	val year: Int,
	val image: String
) : Parcelable