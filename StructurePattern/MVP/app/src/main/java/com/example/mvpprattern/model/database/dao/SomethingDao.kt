package com.example.mvpprattern.model.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import android.arch.persistence.room.Dao
import com.example.mvpprattern.model.database.entity.DataEntity

@Dao
interface SomethingDao {

    @Query("SELECT * FROM xxxx")
    fun getAlldata() : LiveData<DataEntity>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(dataEdit: DataEntity)
    @Query("DELETE FROM xxxx")
    fun deleteAlldata()
}