package com.example.igorrotondobagliot.kotlinbasetrends.di.module

import android.app.Application
import com.example.igorrotondobagliot.kotlinbasetrends.BaseApp
import com.example.igorrotondobagliot.kotlinbasetrends.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Igor Rotondo Bagliot on 17/09/2018.
 */
@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }
}