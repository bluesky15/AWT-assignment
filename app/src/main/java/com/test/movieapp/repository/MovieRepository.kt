package com.test.movieapp.repository

import com.test.movieapp.model.response.Albums
import com.test.movieapp.network.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getMoviesDetails(): List<Albums> {


        return apiService.getTitleDetails()


    }

}