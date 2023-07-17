package com.androidpreparation.designpatterns.dependencyinjectionpattern.hilt

import javax.inject.Inject

class HUserRepositoryImpl @Inject constructor() : HUserRepository {
    override fun getUsers(): List<HUser> {
        return listOf(
            HUser(1, "John Doe", "john.doe@example.com"),
            HUser(2, "Jane Smith", "jane.smith@example.com"),
            HUser(3, "Alice Johnson", "alice.johnson@example.com"),
            HUser(4, "Bob Anderson", "bob.anderson@example.com")
        )
    }



}
