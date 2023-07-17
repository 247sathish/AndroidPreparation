package com.androidpreparation.broadcastreciver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d("Action Recived",intent.action+"")
        if (intent.action == Intent.ACTION_AIRPLANE_MODE_CHANGED) {
            val isAirplaneModeOn = intent.getBooleanExtra("state", false)

            if (isAirplaneModeOn) {
                // Airplane mode is enabled
                Toast.makeText(context, "Airplane mode turned on", Toast.LENGTH_SHORT).show()
            } else {
                // Airplane mode is disabled
                Toast.makeText(context, "Airplane mode turned off", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
