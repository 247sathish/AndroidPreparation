package com.androidpreparation.asynchronous.workmanagerexample.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.androidpreparation.asynchronous.workmanagerexample.WorkStatusSingleton


class SimpleWorker(context: Context, parameters: WorkerParameters) : Worker(context, parameters) {

    override fun doWork(): Result {
        Thread.sleep(500)
        WorkStatusSingleton.workStatus = true
        WorkStatusSingleton.workStatusMessage = inputData.getString("WORK_DATA").toString()
        return Result.success()
    }
}