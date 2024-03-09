package com.wigroup.dependencyinjection.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer

    init {
        DaggerComponent.create().inject(this)
    }
}