package com.androidpreparation.asynchronous.workmanager

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.androidpreparation.R

import java.util.concurrent.TimeUnit

class WorkerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker)

        val myWorkRequest = PeriodicWorkRequestBuilder<MyWorker>(1, TimeUnit.MINUTES)
            .build()

        WorkManager.getInstance(applicationContext).enqueue(myWorkRequest)
    }
}

/*In summary, for periodic work requests using WorkManager,
the minimum allowed interval is 15 minutes. If you need more frequent execution,
consider using an alternative approach that suits your specific requirements.
 */