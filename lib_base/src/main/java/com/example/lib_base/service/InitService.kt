package com.example.lib_base.service

import android.app.IntentService
import android.app.Service
import android.content.Intent
import android.graphics.Bitmap
import android.os.Build
import android.os.IBinder
import com.example.lib_base.utils.SpUtils

/**
 * 初始化完成自杀
 */
class InitService(private val module: String) : IntentService(module) {

    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onHandleIntent(intent: Intent?) {
        SpUtils.initSp(this)
    }


}