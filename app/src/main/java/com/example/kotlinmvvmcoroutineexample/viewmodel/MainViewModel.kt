package com.example.kotlinmvvmcoroutineexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinmvvmcoroutineexample.api.RetrofitApiImpl
import com.example.kotlinmvvmcoroutineexample.model.Movie
import com.example.kotlinmvvmcoroutineexample.source.DataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
/**
 * @author Lior Hazael
 */
class MainViewModel : ViewModel() {

	private val dataRepository = DataRepository(RetrofitApiImpl.instance)

	val movieLiveData = MutableLiveData<Movie>()

	fun fetchMovie() {
		viewModelScope.launch {
			val movie = withContext(Dispatchers.IO) {
				dataRepository.getMovies().movies[0]
			}

			movieLiveData.value = movie
		}
	}
}