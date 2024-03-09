package com.wigroup.dependencyinjection.example2.data.database

import javax.inject.Inject

class ExampleDatabase @Inject constructor() {

    fun method() {
        println("ExampleDatabase")
    }
}
