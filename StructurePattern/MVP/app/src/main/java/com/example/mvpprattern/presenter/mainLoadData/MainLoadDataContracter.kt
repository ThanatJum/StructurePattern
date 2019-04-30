package com.example.mvpprattern.presenter.mainLoadData

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.database.Observable
import com.example.mvpprattern.model.database.entity.DataEntity
import com.example.mvpprattern.utility.Resource
import com.example.mvpprattern.view.mainLoadData.MainLoadContracter

interface MainLoadDataContracter {
    fun getDataFromApi()
}