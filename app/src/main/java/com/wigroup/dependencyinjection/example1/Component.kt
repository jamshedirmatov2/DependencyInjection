package com.wigroup.dependencyinjection.example1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface Component {

    fun inject(activity: Activity)
}