package com.example.Interceptor

fun main() {
    val targetInvocation = TargetInvocation()
    targetInvocation.addInterceptor(AuditInterceptor())
    targetInvocation.addInterceptor(LogInterceptor())
    targetInvocation.request = Request()
    targetInvocation.target = object : Target {
        override fun execute(request: Request): Response {
            return Response()
        }
    }
    targetInvocation.invoke()
}