package com.example.mvpprattern.model.database.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.mvpprattern.model.database.dao.SomethingDao
import com.example.mvpprattern.model.database.entity.DataEntity

@Database(entities = [DataEntity::class],version = 1)
abstract class SomethingDatabase : RoomDatabase(){

    abstract fun dataDetail() : SomethingDao
    companion object {
        var INSTANCE: SomethingDatabase? = null
        fun getAppDataBase(context: Context) : SomethingDatabase?{
            if(INSTANCE == null){
                synchronized(SomethingDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                    SomethingDatabase::class.java, "xxxx").build()
                }
            }
            return INSTANCE
        }
        fun destroyDataBase(){
            INSTANCE = null
        }
    }

}