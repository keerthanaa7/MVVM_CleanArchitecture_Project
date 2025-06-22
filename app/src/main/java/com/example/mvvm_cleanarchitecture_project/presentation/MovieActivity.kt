package com.example.mvvm_cleanarchitecture_project.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.mvvm_cleanarchitecture_project.R
import com.example.mvvm_cleanarchitecture_project.databinding.ActivityMovieBinding

class MovieActivity: ComponentActivity() {
    private lateinit var binding: ActivityMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie)

    }
}