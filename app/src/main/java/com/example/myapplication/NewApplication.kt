package com.example.myapplication

import android.app.Application
import com.example.myapplication.KoinModule.loadModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class NewApplication : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@NewApplication)
            androidLogger()
            modules(loadModule() )
        }
    }
}