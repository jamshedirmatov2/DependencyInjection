package com.wigroup.dependencyinjection.example2.di

import com.wigroup.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import com.wigroup.dependencyinjection.example2.data.datasource.ExampleLocalDataSourceImpl
import com.wigroup.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import com.wigroup.dependencyinjection.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}