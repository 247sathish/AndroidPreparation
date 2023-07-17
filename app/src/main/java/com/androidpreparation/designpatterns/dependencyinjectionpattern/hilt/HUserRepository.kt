package com.androidpreparation.designpatterns.dependencyinjectionpattern.hilt

interface HUserRepository {
    fun getUsers(): List<HUser>
}
