package com.androidpreparation.designpatterns.dependencyinjectionpattern.withdagger

// Define UserRepository interface
interface DiUserRepository {
    fun getUsers(): List<DiUser>
}