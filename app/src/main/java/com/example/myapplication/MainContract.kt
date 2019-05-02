package com.example.myapplication

interface MainContract{
    interface View {
        fun printWorld()
    }
    interface Presenter{
        fun getHello():String
    }
}