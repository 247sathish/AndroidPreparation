package com.androidpreparation.uilayer.databinding.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivityDatabindingBinding
import com.androidpreparation.databinding.ActivityDatabindingRecycleviewBinding


class DataBindingRecycleActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityDatabindingRecycleviewBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding_recycleview)
        binding.lifecycleOwner = this
        // Create a list of items
        val itemList = listOf(
            Item("Item 1","hiiiiiiiiii1"),
            Item("Item 2","hiiiiiiiiii2"),
            Item("Item 3","hiiiiiiiiii3"),
            Item("Item 4","hiiiiiiiiii4"),
            Item("Item 5","hiiiiiiiiii5"),
            Item("Item 6","hiiiiiiiiii6"),
            Item("Item 7","hiiiiiiiiii7"),
            Item("Item 8","hiiiiiiiiii8")
        )

// Create and set the adapter
        val adapter = ExampleAdapter(itemList)
        binding.recyclerView.adapter = adapter

// Set the layout manager (e.g., LinearLayoutManager)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}