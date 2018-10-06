package com.example.igorrotondobagliot.kotlinbasetrends

import android.app.Application
import com.example.igorrotondobagliot.kotlinbasetrends.di.component.ApplicationComponent
import com.example.igorrotondobagliot.kotlinbasetrends.di.component.DaggerApplicationComponent
import com.example.igorrotondobagliot.kotlinbasetrends.di.module.ApplicationModule

/**
 * Created by Igor Rotondo Bagliot on 17/09/2018.
 */
class BaseApp : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()

        if (BuildConfig.DEBUG) {
            // Maybe TimberPlant etc.
        }
    }

    fun setup() {
        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this)).build()
        component.inject(this)
    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: BaseApp private set
    }
}