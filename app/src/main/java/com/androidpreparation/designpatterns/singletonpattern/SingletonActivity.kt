package com.androidpreparation.designpatterns.singletonpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivitySingletonBinding

class SingletonActivity : AppCompatActivity() {
    lateinit var binding:ActivitySingletonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singleton)
        binding= ActivitySingletonBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val singleton = MySingleton.getInstance()
        singleton.setData("Hello, Singleton!")

        val data = singleton.getData()
        Log.d("Singleton", data.toString()) // Output: Hello, Singleton!
        binding.txtId.text=data.toString()

    }
}