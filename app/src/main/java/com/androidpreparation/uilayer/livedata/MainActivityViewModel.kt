package com.androidpreparation.uilayer.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTitle: String, startingResult: Int=0):ViewModel() {
    private var title = MutableLiveData<String>()
    private var result = MutableLiveData<Int>()
    //for encapsulation we need to use LiveData
    val readTitle : LiveData<String> get() = title
    val readResult : LiveData<Int> get() = result

    init {
        title.value = startingTitle
        result.value = startingResult
    }

    fun setPlus(input:Int){
        result.value = (result.value)?.plus(input)
    }

    fun setMinus(input: Int){
        result.value = (result.value)?.minus(input)
    }

    fun setTimes(input: Int){
        result.value = (result.value)?.times(input)
    }

    fun setDivide(input: Int){
        result.value = (result.value)?.div(input)
    }
}