package com.androidpreparation.uilayer.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivityDatabindingBinding



class DataBindingActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityDatabindingBinding
    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding)
        binding.lifecycleOwner = this
        binding.userViewModel=viewModel

        // Access views using binding
        viewModel.setText1("Hello, Data Binding! One")
        viewModel.setText2("Hello, Data Binding! Two")

        //binding.textView.visibility=View.GONE
    }
}