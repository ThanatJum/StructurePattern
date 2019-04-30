package com.example.mvpprattern.view.mainLoadData

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mvpprattern.R
import com.example.mvpprattern.model.database.entity.DataEntity
import com.example.mvpprattern.presenter.mainLoadData.MainLoadDataContracter
import com.example.mvpprattern.presenter.mainLoadData.MainLoadDataPresenter
import com.example.mvpprattern.view.mainLoadData.MainLoadContracter
import kotlinx.android.synthetic.main.activity_main_load.*
import javax.inject.Inject

class MainActivity :AppCompatActivity() ,MainLoadContracter{

    private var presenter : MainLoadDataPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_load)
        initView()
    }

    override fun initView() {
        presenter = MainLoadDataPresenter(this)
    }


    override fun showdata() {

    }



}
