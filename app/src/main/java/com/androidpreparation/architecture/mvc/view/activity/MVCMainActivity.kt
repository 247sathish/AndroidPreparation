package com.androidpreparation.architecture.mvc.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.androidpreparation.R
import com.androidpreparation.architecture.mvc.controller.ILoginController
import com.androidpreparation.architecture.mvc.controller.LoginController
import com.androidpreparation.architecture.mvc.view.ILoginView


import com.androidpreparation.databinding.ActivityMvcBinding

class MVCMainActivity : AppCompatActivity(), ILoginView {

    var loginPresenter: ILoginController? = null

    private lateinit var binding: ActivityMvcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc)
        binding= ActivityMvcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loginPresenter = LoginController(this)


        binding.mButtonLogin?.setOnClickListener {
            (loginPresenter as LoginController).OnLogin(binding.edtUserName?.text.toString(), binding.edtPassword.text.toString().trim())
        }

    }


    
    override fun OnLoginSuccess(message: String?) {
        Toast.makeText(this,message, Toast.LENGTH_LONG).show()
    }

    override fun OnLoginError(message: String?) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}