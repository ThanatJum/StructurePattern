package com.example.mvpv2.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpv2.BaseInterface
import com.example.mvpv2.R
import com.example.mvpv2.presenter.MainLoadPresenter
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Context


class MainActivity : AppCompatActivity(), BaseInterface.MainLoadViewContracter {
    private var presenter : MainLoadPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainLoadPresenter(this,this)
        dataText.text = presenter?.getData()
        getDataFromString.text = presenter?.getDataFromString()
        getString(R.string.testString)

    }






}
