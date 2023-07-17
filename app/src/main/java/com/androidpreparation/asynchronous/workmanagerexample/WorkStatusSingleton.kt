package com.androidpreparation.asynchronous.workmanagerexample

object WorkStatusSingleton {
    var workStatus: Boolean = false
    var workStatusMessage: String = ""
    var workRetryCount: Int = 0
}