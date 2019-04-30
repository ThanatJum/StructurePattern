package com.example.mvpv2.presenter

import com.example.mvpv2.BaseInterface
import com.example.mvpv2.model.MainLoadModel
import android.content.Context
import com.example.mvpv2.R




class MainLoadPresenter(V : BaseInterface.MainLoadViewContracter,context: Context): BaseInterface.MainLoadContracter {
    private var view: BaseInterface.MainLoadViewContracter = V
    private var model : BaseInterface.MainLoadModelContracter = MainLoadModel()
    private var mConText = context


    override fun getData() = model.getDataFromDB()
    override fun getDataFromString(): String = mConText.getString(R.string.testString).toString()



}


