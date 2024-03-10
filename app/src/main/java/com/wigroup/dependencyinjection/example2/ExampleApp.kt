package com.wigroup.dependencyinjection.example2

import android.app.Application
import com.wigroup.dependencyinjection.example2.di.DaggerApplicationComponent

class ExampleApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}