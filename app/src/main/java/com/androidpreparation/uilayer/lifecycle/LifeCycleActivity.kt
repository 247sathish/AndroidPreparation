package com.androidpreparation.uilayer.lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import com.androidpreparation.R

class LifeCycleActivity : AppCompatActivity(), LifecycleObserver {

    private lateinit var textView: TextView
    private val TAG = "LifeCycleActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        textView = findViewById(R.id.textView)
        Log.i(TAG, "Activity onCreate")
        // Obtain the Lifecycle object of this activity
        val lifecycle: Lifecycle = lifecycle

        // Add this activity as a LifecycleObserver
        lifecycle.addObserver(LifeCycleBaseActivity())


        //getLifecycle().addObserver(LifeCycleBaseActivity())
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Activity onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Activity onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Activity onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "Activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "Activity onDestroy")
    }
}
