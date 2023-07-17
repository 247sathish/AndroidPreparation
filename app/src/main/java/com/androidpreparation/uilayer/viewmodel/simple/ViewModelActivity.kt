package com.androidpreparation.uilayer.viewmodel.simple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivityViewmodelBinding


class ViewModelActivity : AppCompatActivity() {

    private lateinit var binding:ActivityViewmodelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)
        binding=ActivityViewmodelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // view model instance
        var viewModel: MainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        // setting text view
        binding.textView.text = viewModel.number.toString()

        //handling button click event
        binding.button.setOnClickListener {
            viewModel.addOne()
            binding.textView.text = viewModel.number.toString()
        }
    }
}
