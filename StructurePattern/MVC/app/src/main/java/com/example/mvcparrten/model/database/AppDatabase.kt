package com.example.mvcparrten.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.mvcparrten.model.database.dao.DataDao
import com.example.mvcparrten.model.database.entity.DataEntity

@Database(entities = [DataEntity::class],version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun dataDetail() : DataDao
    companion object {
        var INSTANCE: AppDatabase? = null
        fun getAppDataBase(context: Context) : AppDatabase?{
            if(INSTANCE == null){
                synchronized(AppDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        AppDatabase::class.java, "xxxx").build()
                }
            }
            return INSTANCE
        }
        fun destroyDataBase(){
            INSTANCE = null
        }
    }
}