package com.androidpreparation.designpatterns.dependencyinjectionpattern.hilt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//class ExampleClass @Inject constructor() {
//    fun doSomething() {
//        println("Doing something!")
//    }
//}

@HiltViewModel
class ExampleClass @Inject constructor():ViewModel() {
    fun doSomething() {
        println("Doing something!")
    }
}