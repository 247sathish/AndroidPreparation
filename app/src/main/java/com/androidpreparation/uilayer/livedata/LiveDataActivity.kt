package com.androidpreparation.uilayer.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivityLivedataBinding


class LiveDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLivedataBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_livedata)
        viewModelFactory = MainActivityViewModelFactory("Counter Result", 0)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
        viewModel.readTitle.observe(this, Observer {
            binding.textTitle.text = it.toString()
        })
        viewModel.readResult.observe(this, Observer {
            binding.textResult.text = it.toString()
        })

        binding.apply {
            buttonPlus.setOnClickListener {
                val input = editInput.text.toString()
                if (input.isNotEmpty() && input.isDigitsOnly()) {
                    viewModel.setPlus(input.toInt())
                } else {
                    Toast.makeText(this@LiveDataActivity, "Invalid input", Toast.LENGTH_SHORT).show()
                }
            }

            buttonMinus.setOnClickListener {
                val input = editInput.text.toString()
                if (input.isNotEmpty() && input.isDigitsOnly()) {
                    viewModel.setMinus(input.toInt())
                } else {
                    Toast.makeText(this@LiveDataActivity, "Invalid input", Toast.LENGTH_SHORT).show()
                }
            }

            buttonTimes.setOnClickListener {
                val input = editInput.text.toString()
                if (input.isNotEmpty() && input.isDigitsOnly()) {
                    viewModel.setTimes(input.toInt())
                } else {
                    Toast.makeText(this@LiveDataActivity, "Invalid input", Toast.LENGTH_SHORT).show()
                }
            }

            buttonDivide.setOnClickListener {
                val input = editInput.text.toString()
                if (input.isNotEmpty() && input.isDigitsOnly()) {
                    viewModel.setDivide(input.toInt())
                } else {
                    Toast.makeText(this@LiveDataActivity, "Invalid input", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

}