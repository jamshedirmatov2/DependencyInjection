package com.wigroup.dependencyinjection.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var monitor: Monitor

    @Inject
    lateinit var mouse: Mouse

    init {
        DaggerComponent.create().inject(this)
    }
}