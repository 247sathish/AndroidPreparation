package com.androidpreparation.asynchronous.coroutines

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.androidpreparation.designpatterns.dependencyinjectionpattern.withoutdagger.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {



    fun performTask() {
        viewModelScope.launch(Dispatchers.IO) {
            // Simulate a long-running task
            Log.d("MainViewModel", "Before Delay")
            delay(3000) // Delay for 3 seconds
            Log.d("MainViewModel", "After Delay")
            // Perform some asynchronous operation here
            // ...
            Log.d("MainViewModel", Thread.currentThread().name.toString())
            // Update the UI or perform other actions
            // ...
        }
    }


    override fun onCleared() {
        super.onCleared()
        // Perform cleanup tasks, if any
    }
}