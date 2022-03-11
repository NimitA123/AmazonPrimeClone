package com.example.tastyappclone.data.remoteDatabase

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Netw {
    companion object {
        private var httpLoggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

        fun getResponse(): Retrofit {
            var retrofit =
                Retrofit.Builder().baseUrl("https://run.mocky.io/v3/").addConverterFactory(
                    GsonConverterFactory.create()
                ).client(OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build())
                    .build()
            return retrofit
        }
    }
}