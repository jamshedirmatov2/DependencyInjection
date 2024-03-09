package com.wigroup.dependencyinjection.example2.data.database

import android.content.Context
import com.wigroup.dependencyinjection.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(private val context: Context) {

    fun method() {
        println("ExampleDatabase: ${context.getString(R.string.app_name)}")
    }
}
