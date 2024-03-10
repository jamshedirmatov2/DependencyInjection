package com.wigroup.dependencyinjection.example2.data.datasource

import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor() : ExampleRemoteDataSource {

    override fun method() {
        println("Test")
    }
}