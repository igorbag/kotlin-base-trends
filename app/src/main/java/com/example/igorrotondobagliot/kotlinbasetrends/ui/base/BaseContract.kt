package com.example.igorrotondobagliot.kotlinbasetrends.ui.base

/**
 * Created by Igor Rotondo Bagliot on 17/09/2018.
 */
class BaseContract {

    //Aqui pode ser colocado todas funcoes comuns entre todos os presenters para ser impleementados
    interface Presenter<in T> {
        fun attach(view: T)
    }

    interface View {

    }
}