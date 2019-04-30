package com.example.mvpv2

interface BaseInterface {

    interface MainLoadModelContracter {
        fun getDataFromDB() : String
    }

    interface MainLoadContracter {
        fun getData() : String
        fun getDataFromString() : String
    }

    interface MainLoadViewContracter {


    }
}