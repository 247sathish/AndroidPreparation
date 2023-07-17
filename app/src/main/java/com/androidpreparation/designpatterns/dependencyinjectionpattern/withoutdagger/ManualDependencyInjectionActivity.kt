package com.androidpreparation.designpatterns.dependencyinjectionpattern.withoutdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidpreparation.R

import com.androidpreparation.databinding.ActivityManualDependencyInjectionBinding

class ManualDependencyInjectionActivity : AppCompatActivity() {
    private lateinit var userRepository: UserRepository
    lateinit var binding:ActivityManualDependencyInjectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual_dependency_injection)
        binding= ActivityManualDependencyInjectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Create UserRepository instance
        userRepository = UserRepositoryImpl()

        // Set up RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val userAdapter = UserAdapter(userRepository)
        binding.recyclerView.adapter = userAdapter


    }
}