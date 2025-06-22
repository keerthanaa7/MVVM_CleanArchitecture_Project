package com.example.mvvm_cleanarchitecture_project.presentation.di

import android.content.Context
import dagger.Module


@Module
class AppModule(private val context: Context) {


    fun provideApplicationContext():Context{
        return context.applicationContext
    }
}