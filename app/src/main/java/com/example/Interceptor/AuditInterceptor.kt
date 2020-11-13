package com.example.Interceptor

class AuditInterceptor : Interceptor {
    override fun intercept(targetInvocation: TargetInvocation): Response {
        if (targetInvocation.getTarget() == null) {
            throw IllegalAccessException("Target is null")
        }
        println("Audit success")
        return targetInvocation.invoke()
    }
}