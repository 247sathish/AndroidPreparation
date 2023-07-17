package com.androidpreparation.designpatterns.builderpattern

data class User(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val email: String?,
    val phoneNumber: String?
) {
    data class Builder(
        var firstName: String = "",
        var lastName: String = "",
        var age: Int = 0,
        var email: String? = null,
        var phoneNumber: String? = null
    ) {
        fun firstName(firstName: String) = apply { this.firstName = firstName }
        fun lastName(lastName: String) = apply { this.lastName = lastName }
        fun age(age: Int) = apply { this.age = age }
        fun email(email: String?) = apply { this.email = email }
        fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

        fun build() = User(firstName, lastName, age, email, phoneNumber)
    }
}

