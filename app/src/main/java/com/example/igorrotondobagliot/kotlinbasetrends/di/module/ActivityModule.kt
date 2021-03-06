package com.example.igorrotondobagliot.kotlinbasetrends.di.module

/**
 * Created by Igor Rotondo Bagliot on 17/09/2018.
 */
import android.app.Activity
import com.example.igorrotondobagliot.kotlinbasetrends.ui.main.MainContract
import com.example.igorrotondobagliot.kotlinbasetrends.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

}