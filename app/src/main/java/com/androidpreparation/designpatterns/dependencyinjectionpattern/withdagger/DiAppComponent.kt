package com.androidpreparation.designpatterns.dependencyinjectionpattern.withdagger

import com.androidpreparation.designpatterns.dependencyinjectionpattern.dagger.LoggerModule
import dagger.Component

// Dagger component interface
@Component(modules = [DiAppModule::class])
interface DiAppComponent {
    fun provideUserRepository(): DiUserRepository
}

//@Component(modules = [DiAppModule::class])
//interface DiAppComponent {
//    fun provideUserRepository(dac:DaggerDependencyInjectionActivity)
//
//
//}