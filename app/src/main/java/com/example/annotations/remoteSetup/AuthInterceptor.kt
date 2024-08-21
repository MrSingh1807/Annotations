package com.example.annotations.remoteSetup

import okhttp3.Interceptor
import okhttp3.Response
import retrofit2.Invocation


class AuthInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val invocation = chain.request().tag(Invocation::class.java)
            ?: return chain.proceed(chain.request())

        val willAttachAuthHeader = invocation
            .method()
            .annotations
            .any { it.annotationClass == Authenticated::class }

        return if (willAttachAuthHeader) {
            chain.proceed(
                chain.request().newBuilder()
                    .addHeader("api_key", "Zp9Qe69wrPs3Nk81")
                    .build()
            )
        } else chain.proceed(chain.request())
    }

}
