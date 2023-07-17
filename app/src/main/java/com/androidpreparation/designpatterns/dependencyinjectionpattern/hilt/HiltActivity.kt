package com.androidpreparation.designpatterns.dependencyinjectionpattern.hilt

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidpreparation.databinding.ActivityHiltDependencyInjectionBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltActivity : AppCompatActivity() {

//    @Inject
//    lateinit var exampleClass: ExampleClass

    private val viewModel by viewModels<ExampleClass>()
    lateinit var binding: ActivityHiltDependencyInjectionBinding
    @Inject
    lateinit var userAdapter: HUserAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        exampleClass.doSomething()

        viewModel.doSomething()
        binding= ActivityHiltDependencyInjectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = userAdapter

    }
}
