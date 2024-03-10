package com.wigroup.dependencyinjection.example2.data.database

import android.content.Context
import com.wigroup.dependencyinjection.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        println("ExampleDatabase: ${context.getString(R.string.app_name)} $timeMillis $this")
    }
}
