package com.wigroup.dependencyinjection.example2.presentation

import androidx.lifecycle.ViewModel
import com.wigroup.dependencyinjection.example2.di.IdQualifier
import com.wigroup.dependencyinjection.example2.di.NameQualifier
import com.wigroup.dependencyinjection.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String,
) : ViewModel() {

    fun method() {
        useCase()
        println("$this $id $name")
    }
}