package com.example.mvpprattern.view.mainLoadData

import android.arch.lifecycle.Observer
import com.example.mvpprattern.model.database.entity.DataEntity

interface MainLoadContracter {
    fun showdata()
    fun initView()
}