package com.androidpreparation.designpatterns.dependencyinjectionpattern.dagger

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)//dagger and hilt using same project so i added this
class LoggerModule {
    @Provides
    fun provideLogger(): Logger {
        return ConsoleLogger()
    }
}
