package com.example.igorrotondobagliot.kotlinbasetrends.di.component

import com.example.igorrotondobagliot.kotlinbasetrends.BaseApp
import com.example.igorrotondobagliot.kotlinbasetrends.di.module.ApplicationModule
import dagger.Component

/**
 * Created by Igor Rotondo Bagliot on 17/09/2018.
 */
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: BaseApp)

}