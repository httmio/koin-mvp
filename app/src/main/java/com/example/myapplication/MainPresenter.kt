package com.example.myapplication

class MainPresenter(val mView : MainContract.View): MainContract.Presenter{
    override fun getHello(): String {
        mView.printWorld()
     return "Hello"
    }


}