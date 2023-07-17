package com.androidpreparation.designpatterns.dependencyinjectionpattern.withdagger

// UserRepository implementation
class DiUserRepositoryImpl : DiUserRepository {
    private val userList: List<DiUser> = listOf(
        DiUser("1", "John Doe", "john.doe@example.com"),
        DiUser("2", "Jane Smith", "jane.smith@example.com"),
        DiUser("3", "Alice Johnson", "alice.johnson@example.com"),
        DiUser("4", "Bob Anderson", "bob.anderson@example.com")
    )

   override fun getUsers(): List<DiUser> {
        return userList
    }
}
