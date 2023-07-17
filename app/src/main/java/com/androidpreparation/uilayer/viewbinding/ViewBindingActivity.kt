package com.androidpreparation.uilayer.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivityViewbindingBinding


class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewbindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewbinding)
        binding= ActivityViewbindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textView.text = "Hello, ViewBinding!"
    }
}