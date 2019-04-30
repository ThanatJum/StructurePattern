package com.example.mvpprattern.presenter.mainLoadData

import android.arch.lifecycle.Observer
import com.example.mvpprattern.model.repository.DataRepository
import com.example.mvpprattern.view.mainLoadData.MainLoadContracter

class MainLoadDataPresenter(fromView: MainLoadContracter) : MainLoadDataContracter {

    lateinit var getRepo: DataRepository
    override fun getDataFromApi() {

    }

}