package com.wigroup.dependencyinjection.example2.data.network

import javax.inject.Inject

class ExampleApiService @Inject constructor() {

    fun method() {
        println("ExampleApiService")
    }
}
