package com.androidpreparation.uilayer.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class LifeCycleBaseActivity : LifecycleObserver {

    private val TAG = "LifeCycleBaseActivity"

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateEvent() {

        Log.i(TAG, "Owner Created");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartEvent() {

        Log.i(TAG, "Owner Started");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeEvent() {

        Log.i(TAG, "Owner Resumed");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPauseEvent() {

        Log.i(TAG, "Owner Paused");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopEvent() {

        Log.i(TAG, "Owner Stopped");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyEvent() {

        Log.i(TAG, "Owner Destroyed");
    }
}
