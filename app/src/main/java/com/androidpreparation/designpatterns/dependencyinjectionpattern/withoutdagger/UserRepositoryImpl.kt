package com.androidpreparation.designpatterns.dependencyinjectionpattern.withoutdagger

// UserRepository implementation
class UserRepositoryImpl : UserRepository {
    private val userList: List<User> = listOf(
        User("1", "John Doe", "john.doe@example.com"),
        User("2", "Jane Smith", "jane.smith@example.com"),
        User("3", "Alice Johnson", "alice.johnson@example.com"),
        User("4", "Bob Anderson", "bob.anderson@example.com")
    )

   override fun getUsers(): List<User> {
        return userList
    }
}
