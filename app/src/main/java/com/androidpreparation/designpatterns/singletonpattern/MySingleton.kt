package com.androidpreparation.designpatterns.singletonpattern

class MySingleton private constructor() {
    private var data: String? = null

    fun setData(data: String) {
        this.data = data
    }

    fun getData(): String? {
        return data
    }

    companion object {
        @Volatile
        private var instance: MySingleton? = null

        fun getInstance(): MySingleton {
            return instance ?: synchronized(this) {
                instance ?: MySingleton().also { instance = it }
            }
        }
    }
}


