package com.example.wallpaper.Client

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {


    companion object{

        val BASE_URL = "https://api.pexels.com/v1/"
        val KEY = "RjH1mwBB8aNdvWUx8D8B8S529ARU0hNtTA1FgJQHYlijdB5cx0EJS4lN"
        lateinit var retrofit: Retrofit

        fun getapiClient(): Retrofit {

            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }

    }

}