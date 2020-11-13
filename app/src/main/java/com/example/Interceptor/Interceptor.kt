package com.example.Interceptor

interface Interceptor {
    fun intercept(targetInvocation: TargetInvocation): Response
}