package com.xingyu.mvvmsample.app

import android.app.Application
import android.arch.persistence.room.Room
import com.xingyu.mvvmsample.service.room.UserDatabase

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        MyApp.database= Room.databaseBuilder(this, UserDatabase::class.java, "users.db").allowMainThreadQueries().build()
    }
    companion object {
        lateinit var database:  UserDatabase
    }
}