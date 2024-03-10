package com.wigroup.dependencyinjection.example2.data.network

import android.content.Context
import com.wigroup.dependencyinjection.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        println("ExampleApiService: ${context.getString(R.string.app_name)} $timeMillis $this")
    }
}
