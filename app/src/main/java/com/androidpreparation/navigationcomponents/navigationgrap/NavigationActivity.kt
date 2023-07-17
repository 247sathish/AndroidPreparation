package com.androidpreparation.navigationcomponents.navigationgrap




import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.androidpreparation.R


class NavigationActivity : AppCompatActivity() {

    var navController : NavController? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment?
         navController = navHostFragment!!.navController
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        navController?.handleDeepLink(intent)
    }

}