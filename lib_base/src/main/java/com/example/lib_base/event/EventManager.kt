package com.example.lib_base.event

import org.greenrobot.eventbus.EventBus

object EventManager {
    fun register(subscriber: Any) {
        EventBus.getDefault().register(subscriber)
    }


    fun unRegister(subscriber: Any) {
        EventBus.getDefault().unregister(subscriber)
    }

    private fun post(event: MessageEvent) {
        EventBus.getDefault().post(event)
    }

    fun post(type: Int) {
        post(MessageEvent(type))
    }

    fun post(type: Int, value: String) {
        val event = MessageEvent(type)
        event.stringValue = value
        post(event)
    }

    fun post(type: Int, value: Int) {
        val event = MessageEvent(type)
        event.intValue = value
        post(event)
    }

    fun post(type: Int, value: Boolean) {
        val event = MessageEvent(type)
        event.booleanValue = value
        post(event)
    }
}