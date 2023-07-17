package com.androidpreparation.designpatterns.dependencyinjectionpattern.withdagger

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

// Dagger module class
@Module
@InstallIn(SingletonComponent::class)//dagger and hilt using same project so i added this
class DiAppModule {
    @Provides
    fun provideUserRepository(): DiUserRepository {
        return DiUserRepositoryImpl()
    }
}