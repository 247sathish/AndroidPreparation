package com.androidpreparation.designpatterns.dependencyinjectionpattern.dagger

import dagger.Component
import javax.inject.Inject


@Component(modules = [LoggerModule::class])
interface AppComponenSat {

    fun inject(daggerActivity:DaggerActivity)
}
