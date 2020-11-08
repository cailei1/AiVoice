package com.example.lib_base.helper

import android.app.Application
import android.os.Bundle
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

//路由帮助类
object ARouterHelper {

    fun initHelper(application: Application) {
        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog()   // 打印日志
            ARouter.openDebug()  // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(application)
    }

    fun startActivity(path: String) {
        ARouter.getInstance().build(path).navigation();
    }

    fun startActivity(path: String, key: String, value: String) {
        ARouter.getInstance().build(path)
            .withString(key, value)
            .navigation()
    }

    fun startActivity(path: String, key: String, value: Int) {
        ARouter.getInstance().build(path)
            .withInt(key, value)
            .navigation()
    }

    fun startActivity(path: String, key: String, value: Boolean) {
        ARouter.getInstance().build(path)
            .withBoolean(key, value)
            .navigation()
    }

    fun startActivity(path: String, key: String, value: Bundle) {
        ARouter.getInstance().build(path)
            .withBundle(key, value)
            .navigation()
    }

    fun startActivity(path: String, key: String, value: Any) {
        ARouter.getInstance().build(path)
            .withObject(key, value)
            .navigation()
    }

}