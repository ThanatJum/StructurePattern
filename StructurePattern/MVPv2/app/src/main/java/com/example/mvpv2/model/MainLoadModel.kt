package com.example.mvpv2.model

import com.example.mvpv2.BaseInterface

class MainLoadModel : BaseInterface.MainLoadModelContracter {

    private val textDataTest = "Test Get Data"
    override fun getDataFromDB() = textDataTest


}