package com.example.lib_base.utils

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.alibaba.android.arouter.BuildConfig

object SpUtils {
    private lateinit var spEdit: SharedPreferences.Editor
    fun initSp(context: Context) {
        val sp = context.getSharedPreferences("aiVoice", MODE_PRIVATE)
        spEdit = sp.edit()
    }


    fun put(key: String, value: Any) {
        when (value) {
            is String -> spEdit.putString(key, value)
            is Boolean -> spEdit.putBoolean(key, value)
            is Int -> spEdit.putInt(key, value)
            is Float -> spEdit.putFloat(key, value)
            is Long -> spEdit.putLong(key, value)
        }
        spEdit.commit()
    }
}