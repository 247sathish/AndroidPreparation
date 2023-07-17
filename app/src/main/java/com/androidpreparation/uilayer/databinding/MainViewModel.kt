package com.androidpreparation.uilayer.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.androidpreparation.BR


class MainViewModel : BaseObservable() {

    private var _text1: String = ""
    private var _text2: String = ""
    private var _text3: String = ""

    @Bindable
    fun getText1(): String {
        return _text1
    }

    fun setText1(text: String) {
        _text1 = text
        notifyPropertyChanged(BR.text1)
    }
    @Bindable
    fun getText2(): String {
        return _text2
    }

    fun setText2(text: String) {
        _text2 = text
        notifyPropertyChanged(BR.text2)
    }
}
