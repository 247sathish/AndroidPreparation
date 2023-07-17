package com.androidpreparation.designpatterns.dependencyinjectionpattern.withdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivityDaggerBinding
import com.androidpreparation.databinding.ActivityDaggerDependencyInjectionBinding

import com.androidpreparation.databinding.ActivityManualDependencyInjectionBinding
import com.androidpreparation.designpatterns.dependencyinjectionpattern.dagger.DaggerAppComponenSat
import javax.inject.Inject

class DaggerDependencyInjectionActivity : AppCompatActivity() {
    lateinit var binding: ActivityDaggerDependencyInjectionBinding

    @Inject
    lateinit var diuserRepository: DiUserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual_dependency_injection)
        binding= ActivityDaggerDependencyInjectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val appComponent:DiAppComponent= DaggerDiAppComponent.create()
        diuserRepository= appComponent.provideUserRepository()

//        DaggerDiAppComponent.create().provideUserRepository(this)

        // Set up RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val userAdapter = DiUserAdapter(diuserRepository)
        binding.recyclerView.adapter = userAdapter


    }
}