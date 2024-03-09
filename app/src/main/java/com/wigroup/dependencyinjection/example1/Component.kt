package com.wigroup.dependencyinjection.example1

import dagger.Component

@Component
interface Component {

    fun inject(activity: Activity)
}