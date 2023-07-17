package com.androidpreparation.broadcastreciver

import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivityBroadcastBinding
import com.androidpreparation.databinding.ActivityMainBinding

class DynamicBroadCastReciver : AppCompatActivity() {

    private lateinit var receiver: MyBroadcastReceiver
    private lateinit var binding: ActivityBroadcastBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)
        binding= ActivityBroadcastBinding.inflate(layoutInflater)
        setContentView(binding.root)
        receiver = MyBroadcastReceiver()

//        val intentFilter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        val intentFilter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(receiver, intentFilter)

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(receiver)
    }
}