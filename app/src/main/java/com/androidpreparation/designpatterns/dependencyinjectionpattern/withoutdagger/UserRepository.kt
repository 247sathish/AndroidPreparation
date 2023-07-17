package com.androidpreparation.designpatterns.dependencyinjectionpattern.withoutdagger

// Define UserRepository interface
interface UserRepository {
    fun getUsers(): List<User>
}