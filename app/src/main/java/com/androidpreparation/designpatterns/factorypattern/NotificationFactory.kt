package com.androidpreparation.designpatterns.factorypattern

class NotificationFactory {
    fun createNotification(type: NotificationType): Notification {
        return when (type) {
            NotificationType.EMAIL -> EmailNotification()
            NotificationType.SMS -> SMSNotification()
        }
    }
}

enum class NotificationType {
    EMAIL,
    SMS
}
