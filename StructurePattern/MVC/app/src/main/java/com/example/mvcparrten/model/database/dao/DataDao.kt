package com.example.mvcparrten.model.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.example.mvcparrten.model.database.entity.DataEntity

@Dao
interface DataDao {
    @Query("SELECT * FROM xxxx")
    fun getAlldata() : LiveData<DataEntity>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(dataEdit: DataEntity)
    @Query("DELETE FROM xxxx")
    fun deleteAlldata()
}