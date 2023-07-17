package com.androidpreparation.designpatterns.factorypattern

interface Notification {

    fun  show():String?
}

class EmailNotification : Notification {
    override fun  show():String {
       return "Displaying Email notification"
    }
}

class SMSNotification : Notification {
    override fun  show():String {
        return "Displaying SMS notification"
    }
}
