package com.example.kotlinmvvmcoroutineexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinmvvmcoroutineexample.databinding.ActivityMainBinding
import com.example.kotlinmvvmcoroutineexample.viewmodel.MainViewModel
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    /**
     * View binding
     */
    private lateinit var binding: ActivityMainBinding

    /**
     * View model
     */
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.movieLiveData.observe(this) {
            binding.movieName.text = it.movie
            binding.movieYear.text = it.year.toString()
            Picasso.get().load(it.image).into(binding.movieImage)
        }

        viewModel.fetchMovie()
    }
}