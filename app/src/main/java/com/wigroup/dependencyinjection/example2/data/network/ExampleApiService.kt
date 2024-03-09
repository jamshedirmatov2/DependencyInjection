package com.wigroup.dependencyinjection.example2.data.network

import android.content.Context
import com.wigroup.dependencyinjection.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(private val context: Context) {

    fun method() {
        println("ExampleApiService: ${context.getString(R.string.app_name)}")
    }
}
