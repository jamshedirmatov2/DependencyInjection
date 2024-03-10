package com.wigroup.dependencyinjection.example2.di

import android.content.Context
import com.wigroup.dependencyinjection.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface ApplicationComponentBuilder {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long,
        ): ApplicationComponent
    }
}