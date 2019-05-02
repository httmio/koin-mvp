package com.example.myapplication

import org.koin.core.module.Module
import org.koin.dsl.module

val mainModule: Module = module {
    factory<MainContract.Presenter> { (view: MainContract.View) ->
        MainPresenter(view)
    }
}

object KoinModule {
    fun loadModule() = listOf(mainModule)
}