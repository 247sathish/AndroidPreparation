package com.androidpreparation.architecture.mvc.view

interface ILoginView {
    fun OnLoginSuccess(message: String?)
    fun OnLoginError(message: String?)
}