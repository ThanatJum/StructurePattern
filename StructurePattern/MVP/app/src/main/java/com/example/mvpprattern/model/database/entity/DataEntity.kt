package com.example.mvpprattern.model.database.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.example.mvpprattern.model.database.item.GetsomethingItem

@Entity(tableName = "xxxx")
data class DataEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "autoId")
    val autoId: Int? = null,
    @ColumnInfo(name = "idApi")
    val idApi: Int? = null,
    @ColumnInfo(name = "name")
    val name: String? = null,
    @ColumnInfo(name = "price")
    val price: Int? = null
)