package com.androidpreparation.designpatterns.factorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivityFactoryBinding
import com.androidpreparation.databinding.ActivitySingletonBinding

class FactoryActivity : AppCompatActivity() {
    lateinit var binding:ActivityFactoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory)
        binding= ActivityFactoryBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val notificationFactory = NotificationFactory()

        val emailNotification = notificationFactory.createNotification(NotificationType.EMAIL)
        //emailNotification.show() // Output: Displaying Email notification
        binding.txtId.text=emailNotification.show()

        val smsNotification = notificationFactory.createNotification(NotificationType.SMS)
        //smsNotification.show() // Output: Displaying SMS notification
        binding.txtId2.text= smsNotification.show()


    }
}