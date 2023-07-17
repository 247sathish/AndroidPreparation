package com.androidpreparation.designpatterns.builderpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivityBuilderpatternBinding
import com.androidpreparation.databinding.ActivitySingletonBinding

class BuilderPatternActivity : AppCompatActivity() {
    lateinit var binding:ActivityBuilderpatternBinding

    private lateinit var adapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_builderpattern)
        binding= ActivityBuilderpatternBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val users = listOf(
            User.Builder().firstName("John").lastName("Doe").age(30).build(),
            User.Builder().firstName("Jane").lastName("Smith").age(25).email("jane.smith@example.com").build(),
            // Add more user objects using the Builder pattern
        )

        adapter = UserAdapter(users)
        binding.recyclerView.adapter = adapter


    }
}