package com.example.Interceptor

class TargetInvocation {
    //拦截器
    var interceptorList = mutableListOf<Interceptor>()
    private lateinit var interceptors: Iterator<Interceptor>
    private lateinit var target: Target
    lateinit var request: Request

    fun invoke(): Response {
        if (interceptors.hasNext()) {
            val interceptor = interceptors.next()
            interceptor.intercept(this)
        }
        return target.execute(request)
    }

    fun addInterceptor(interceptor: Interceptor) {
        interceptorList.add(interceptor)
        interceptors = interceptorList.iterator()
    }

    fun setTarget(target: Target) {
        this.target = target
    }

    fun getTarget(): Target {
        return this.target
    }


}