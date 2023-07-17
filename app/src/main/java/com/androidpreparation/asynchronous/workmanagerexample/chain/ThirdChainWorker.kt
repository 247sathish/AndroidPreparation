package com.androidpreparation.asynchronous.workmanagerexample.chain

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class ThirdChainWorker(context: Context, parameters: WorkerParameters) :
    Worker(context, parameters) {

    private val TAG = "ChainWorker"

    override fun doWork(): Result {
        val success = inputData.getBoolean("isSuccess", false)

        Log.i(TAG, "doWork: OnThirdChainWorker")

        return if (success) Result.success()
        else Result.failure()
    }
}