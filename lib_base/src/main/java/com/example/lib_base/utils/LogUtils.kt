package com.example.lib_base.utils

import android.util.Log
import com.alibaba.android.arouter.BuildConfig

object LogUtils {

    fun v(tag: String, msg: String) {
        log(LogLevel.LOG_V, tag, msg)
    }

    fun i(tag: String, msg: String) {
        log(LogLevel.LOG_I, tag, msg)
    }

    fun e(tag: String, msg: String) {
        log(LogLevel.LOG_E, tag, msg)
    }

    fun d(tag: String, msg: String) {
        log(LogLevel.LOG_D, tag, msg)
    }

    private fun log(level: LogLevel, tag: String, msg: String) {
        if (BuildConfig.DEBUG) {
            when (level) {
                LogLevel.LOG_V -> Log.v(tag, msg)
                LogLevel.LOG_D -> Log.d(tag, msg)
                LogLevel.LOG_E -> Log.e(tag, msg)
                LogLevel.LOG_I -> Log.i(tag, msg)
            }
        }
    }
}

enum class LogLevel {
    LOG_V,
    LOG_I,
    LOG_E,
    LOG_D
}