package com.wigroup.dependencyinjection.example2.presentation

import androidx.lifecycle.ViewModel
import com.wigroup.dependencyinjection.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    private val id: String,
) : ViewModel() {

    fun method() {
        useCase()
        println("$this $id")
    }
}