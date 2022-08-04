package com.test.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.test.movieapp.databinding.ActivityHomeBinding
import com.test.movieapp.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class ListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    val viewModel: HomeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            viewModel.getMovieDetails()
        }

        binding.apply {

            setupRecyclerView()
        }
    }

    private fun setupRecyclerView() {


    }

}