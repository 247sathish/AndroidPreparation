package com.androidpreparation.asynchronous.coroutines

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.androidpreparation.databinding.ActivityCoroutineBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext


class CoroutineActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCoroutineBinding
    var TAG="CoroutineActivity"

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoroutineBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.suspendingFunctions.setOnClickListener {
            Log.d("CoroutineActivity","Start - Main")

            GlobalScope.launch {
                printAllNames()
                Log.d("CoroutineActivity","End - Scope")
            }

            Log.d("CoroutineActivity","End - Main")
        }

        binding.globalScope.setOnClickListener {

            GlobalScope.launch {
                Log.d("Inside Global Scope", Thread.currentThread().name.toString())
            }
            Log.d("Outside Global Scope", Thread.currentThread().name.toString())


        }

        binding.lifecycleScope.setOnClickListener {

            lifecycleScope.launch {
                Log.d("Inside Global Scope", Thread.currentThread().name.toString())
            }
            Log.d("Outside Global Scope", Thread.currentThread().name.toString())
        }

        binding.viewmodelScope.setOnClickListener {

            viewModel.performTask()
        }

        binding.mainDispatcher.setOnClickListener {

            GlobalScope.launch(Dispatchers.Main) {
                Log.d("Inside GlobalScope", Thread.currentThread().name.toString())
                // perform UI related Operations
            }
            Log.d("Outside GlobalScope", Thread.currentThread().name.toString())

        }

        binding.ioDispatcher.setOnClickListener {
            GlobalScope.launch(Dispatchers.IO) {
                Log.d("Inside GlobalScope", Thread.currentThread().name.toString())
                // perform IO related Operations
            }
            Log.d("Outside GlobalScope", Thread.currentThread().name.toString())
        }

        binding.defaultDispatcher.setOnClickListener {

            GlobalScope.launch(Dispatchers.Default) {
                Log.d("Inside GlobalScope", Thread.currentThread().name.toString())
                // perform IO related Operations
            }
            Log.d("Outside GlobalScope", Thread.currentThread().name.toString())
        }

        binding.withcontext.setOnClickListener {

            GlobalScope.launch {
                Log.d("Inside GlobalScope", Thread.currentThread().name.toString())
                withContext(Dispatchers.Main) {
                    Log.d("Inside GlobalScope  withContext", Thread.currentThread().name.toString())
                }
            }
            Log.d("Outside GlobalScope", Thread.currentThread().name.toString())


        }

        binding.coroutineBuilderLaunch.setOnClickListener {

            GlobalScope.launch(Dispatchers.IO) {
                Log.d("Inside GlobalScope", Thread.currentThread().name.toString())
                // perform IO related Operations
            }
            Log.d("Outside GlobalScope", Thread.currentThread().name.toString())

        }

        binding.coroutineBuilderAsync.setOnClickListener {


            lifecycleScope.launch(Dispatchers.IO) {
                Log.d(TAG, " lifecycleScope Thread " + Thread.currentThread().name)
                val firstNameDeferred = async {
                    delay(2000)
                    Log.d(TAG, " getFirstName Thread " + Thread.currentThread().name)
                    getFirstName()
                }
                val lastNameDeferred = async {
                    Log.d(TAG, " getLastName Thread " + Thread.currentThread().name)
                    getLastName()
                }
                val fullName = firstNameDeferred.await() + lastNameDeferred.await()
                Log.d(TAG, " End lifecycleScope Thread " + Thread.currentThread().name)
                Log.d(TAG, " End $fullName")
            }
        }

        binding.coroutineBuilderRunBlocking.setOnClickListener {


            Log.d(TAG,"Before runblocking")
            runBlocking {
                delay(2000)
                Log.d(TAG,"Inside runblocking")
                Log.d(TAG, " Inside runblocking thread " + Thread.currentThread().name)
            }
            Log.d(TAG,"Outside runblocking")
            Log.d(TAG, " Outside runblocking thread" + Thread.currentThread().name)
        }

    }




    private suspend fun printAllNames() {
        for (i in 1..5) {
            println("Name $i")
        }
    }


    suspend fun getFirstName() : String {
        delay(3000)
        return "Hello"
    }

    suspend fun getLastName() : String {
        delay(2000)
        return "World !"
    }
}
