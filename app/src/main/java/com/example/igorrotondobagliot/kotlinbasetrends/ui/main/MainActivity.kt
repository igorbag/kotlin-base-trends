package com.example.igorrotondobagliot.kotlinbasetrends.ui.main

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.example.igorrotondobagliot.kotlinbasetrends.R
import com.example.igorrotondobagliot.kotlinbasetrends.di.component.DaggerActivityComponent
import com.example.igorrotondobagliot.kotlinbasetrends.di.component.DaggerFragmentComponent
import com.example.igorrotondobagliot.kotlinbasetrends.di.module.ActivityModule
import com.example.igorrotondobagliot.kotlinbasetrends.di.module.FragmentModule
import com.example.igorrotondobagliot.kotlinbasetrends.models.Album
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : AppCompatActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainContract.Presenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectDependency()
        setSupportActionBar(toolbar)
        presenter.attach(this)
        loadDataFromPresenter();

    }

    override fun loadDataAllSuccess(list: List<Album>) {
        fab.setOnClickListener { view ->
            Snackbar.make(view, list[0].title, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun showAboutApp() {
        //abrir outro fragment
    }

    private fun loadDataFromPresenter() {
        presenter.loadData()
    }

    private fun injectDependency() {
        val activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()

        activityComponent.inject(this)
    }


}
