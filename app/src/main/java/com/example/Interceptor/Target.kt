package com.example.Interceptor

interface Target {
    fun execute(request: Request): Response
}