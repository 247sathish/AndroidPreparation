package com.androidpreparation.service

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivityServiceBinding

class ServiceActivity : AppCompatActivity() {

    private lateinit var binding:ActivityServiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        binding= ActivityServiceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button3.setOnClickListener {
//            val serviceIntent = Intent(this, MyService::class.java)
//            startService(serviceIntent)

            val intent = Intent(this, MyService::class.java) // Build the intent for the service
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                applicationContext.startForegroundService(intent)
            }
        }
        binding.button4.setOnClickListener {
            val serviceIntent = Intent(this, MyService::class.java)
            stopService(serviceIntent)

        }


    }
}