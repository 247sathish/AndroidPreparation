package com.androidpreparation.asynchronous.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(appContext: Context, params: WorkerParameters) : Worker(appContext, params) {

    override fun doWork(): Result {
        Log.d("MyWorker", "Hello from MyWorker!")
        return Result.success()
    }
}