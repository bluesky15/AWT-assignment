package com.test.movieapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.movieapp.model.Movie
import com.test.movieapp.model.response.Albums
import com.test.movieapp.repository.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(val movieRepository: MovieRepository) : ViewModel() {
    val data:MutableLiveData<List<Albums>> = MutableLiveData()
     fun getMovieDetails() {
        viewModelScope.launch {
            val movies = movieRepository.getMoviesDetails()
            Log.d(">>>", "${movies}")
             data.value = movies
        }

    }
}