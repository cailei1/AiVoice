package com.example.Interceptor

class LogInterceptor : Interceptor {
    override fun intercept(targetInvocation: TargetInvocation): Response {
        println("Logger begin")
        val response = targetInvocation.invoke()
        println("Logger end")
        return response
    }
}