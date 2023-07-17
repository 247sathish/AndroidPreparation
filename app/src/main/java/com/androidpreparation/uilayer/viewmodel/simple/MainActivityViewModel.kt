package com.androidpreparation.uilayer.viewmodel.simple

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var number = 0

    fun addOne() {
        number++
    }
}
