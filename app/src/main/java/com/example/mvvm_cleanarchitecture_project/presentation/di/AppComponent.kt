package com.example.mvvm_cleanarchitecture_project.presentation.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,
DataBaseModule::class,
LocalDataModule::class,
MovieCacheLocalDataSource::class,
NetworkModule::class,
RemoteDataModule::class,
RepositoryModule::class,
UsecaseDataModule::class])
interface AppComponent {
}