package com.androidpreparation.network.parsejsonretrofit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidpreparation.databinding.ActivityParsejsonretrofitBinding
import com.androidpreparation.network.parsejsonretrofit.arrayJSON.ArrayJSONActivity
import com.androidpreparation.network.parsejsonretrofit.nestedJSON.NestedJSONActivity
import com.androidpreparation.network.parsejsonretrofit.simpleJSON.SimpleJSONActivity


class ParseJsonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityParsejsonretrofitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParsejsonretrofitBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)// emulator working fine


        binding.simpleJsonButton.setOnClickListener {
            val intent = Intent(this@ParseJsonActivity, SimpleJSONActivity::class.java)
            this@ParseJsonActivity.startActivity(intent)
        }

        binding.arrayJsonButton.setOnClickListener {
            val intent = Intent(this@ParseJsonActivity, ArrayJSONActivity::class.java)
            this@ParseJsonActivity.startActivity(intent)
        }

        binding.nestedJsonButton.setOnClickListener {
            val intent = Intent(this@ParseJsonActivity, NestedJSONActivity::class.java)
            this@ParseJsonActivity.startActivity(intent)
        }
    }
}