package com.androidpreparation.designpatterns.dependencyinjectionpattern.dagger

class ConsoleLogger : Logger {
    override fun log(message: String) {
        println("Logging message: $message")
    }
}
