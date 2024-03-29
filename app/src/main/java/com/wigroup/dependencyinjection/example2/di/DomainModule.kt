package com.wigroup.dependencyinjection.example2.di

import com.wigroup.dependencyinjection.example2.data.repository.ExampleRepositoryImpl
import com.wigroup.dependencyinjection.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}