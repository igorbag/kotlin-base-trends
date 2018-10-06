package com.example.igorrotondobagliot.kotlinbasetrends.di.component

import com.example.igorrotondobagliot.kotlinbasetrends.di.module.ActivityModule
import com.example.igorrotondobagliot.kotlinbasetrends.ui.main.MainActivity
import dagger.Component

/**
 * Created by Igor Rotondo Bagliot on 17/09/2018.
 */
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity
    )

}