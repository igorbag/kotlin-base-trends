package com.example.igorrotondobagliot.kotlinbasetrends.ui.main

import com.example.igorrotondobagliot.kotlinbasetrends.models.Album
import com.example.igorrotondobagliot.kotlinbasetrends.ui.base.BaseContract

/**
 * Created by Igor Rotondo Bagliot on 17/09/2018.
 */
class MainContract {

    //Aqui fica todos os metodos relacionados a eventos de tela e manipulacao de eventos
    interface View : BaseContract.View {
        fun showAboutApp()
        fun loadDataAllSuccess(album: List<Album>)
    }

    // Aqui fica todos os metodos relacionados a chamadas de servicos e regras de
    // negocio que tem a sua implementacao no Presenter
    interface Presenter : BaseContract.Presenter<MainContract.View> {
        fun loadData()
    }
}