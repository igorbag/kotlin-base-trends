package com.example.igorrotondobagliot.kotlinbasetrends.ui.main

import com.example.igorrotondobagliot.kotlinbasetrends.api.ApiRest
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.android.Main
import kotlinx.coroutines.launch

/**
 * Created by Igor Rotondo Bagliot on 17/09/2018.
 */
class MainPresenter : MainContract.Presenter {


    private val viewModelJob = Job()
    private val uiScope = CoroutineScope(kotlinx.coroutines.Dispatchers.Main + viewModelJob)
    private lateinit var view: MainContract.View

    private val api: ApiRest = ApiRest.create()


    override fun attach(view: MainContract.View) {
        this.view = view
    }


    override fun loadData() {
        uiScope.launch {
            val result = api.getAlbumList().await();
            result.size
        }
    }
}