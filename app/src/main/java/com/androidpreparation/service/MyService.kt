package com.androidpreparation.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service() {
    private val TAG = "MyService"
    private var isServiceRunning = false
    private lateinit var backgroundThread: Thread
    private var counter = 0

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Service onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "Service onStartCommand")

        if (!isServiceRunning) {
            isServiceRunning = true
            startBackgroundThread()
        }

        // Return START_STICKY to ensure the service is restarted if killed by the system
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Service onDestroy")

        if (isServiceRunning) {
            stopBackgroundThread()
            isServiceRunning = false
        }
    }

    override fun onBind(intent: Intent?): IBinder? {
        Log.d(TAG, "Service onBind")
        return null // Not required for a started service
    }

    private fun startBackgroundThread() {
        backgroundThread = Thread {
            while (isServiceRunning) {
                try {
                    Thread.sleep(1000)
                    counter++
                    Log.d(TAG, "Counter: $counter")
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }

        backgroundThread.start()
    }

    private fun stopBackgroundThread() {
        if (::backgroundThread.isInitialized) {
            backgroundThread.interrupt()
        }
    }
}
