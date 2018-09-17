package com.example.igorrotondobagliot.kotlinbasetrends.di.component

import com.example.igorrotondobagliot.kotlinbasetrends.di.module.ActivityModule
import com.example.igorrotondobagliot.kotlinbasetrends.ui.main.MainActivity
import dagger.Component

/**
 * Created by ogulcan on 07/02/2018.
 */
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity
    )

}