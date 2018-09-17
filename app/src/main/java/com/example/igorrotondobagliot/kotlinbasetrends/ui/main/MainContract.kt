package com.example.igorrotondobagliot.kotlinbasetrends.ui.main

import com.example.igorrotondobagliot.kotlinbasetrends.ui.base.BaseContract

/**
 * Created by Igor Rotondo Bagliot on 17/09/2018.
 */
class MainContract {

    interface View : BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter : BaseContract.Presenter<MainContract.View> {
        fun onDrawerOptionAboutClick()
    }
}