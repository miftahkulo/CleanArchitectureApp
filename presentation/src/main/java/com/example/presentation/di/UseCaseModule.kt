package com.example.presentation.di

import com.example.domain.repository.IMoviesRepository
import com.example.domain.usecase.movie.GetMoviesUseCase
import org.koin.dsl.module

val useCaseModule = module {

    single { provideGetMoviesUseCase(get()) }
}

fun provideGetMoviesUseCase(moviesRepository: IMoviesRepository) : GetMoviesUseCase = GetMoviesUseCase(moviesRepository)