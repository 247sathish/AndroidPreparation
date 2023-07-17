package com.androidpreparation.designpatterns.dependencyinjectionpattern.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object HAppModule {

    @Provides
    fun provideUserRepository(userRepositoryImpl: HUserRepositoryImpl): HUserRepository {
        return userRepositoryImpl
    }
}