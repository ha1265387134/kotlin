package com.example.core

import android.app.Application
import android.content.Context

/**
 * Created by huan on 2020/4/6.
 */
class BaseApplication: Application() {

    companion object {
        private lateinit var currentApplication: Context

        fun currentApplication(): Context {
            return currentApplication
        }
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        currentApplication = this
    }
}