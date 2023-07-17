package com.androidpreparation.designpatterns.dependencyinjectionpattern.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidpreparation.R
import javax.inject.Inject


class DaggerActivity : AppCompatActivity() {
    @Inject
    lateinit var logger: Logger


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)




        // Perform injection
        DaggerAppComponenSat.create().inject(this)





        // Now you can use the injected logger
        logger.log("Hello Dagger!")
    }
}
