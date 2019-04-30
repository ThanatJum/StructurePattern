package com.example.mvcparrten.model.database.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.example.mvcparrten.model.database.item.GetsomethingItem

@Entity(tableName = "xxxx")
data class DataEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "data")
    var dataList: ArrayList<GetsomethingItem>


)