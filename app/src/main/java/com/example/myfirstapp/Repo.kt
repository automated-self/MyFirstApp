package com.example.myfirstapp

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class OSActivity(val name: String)
class OSActivityResponse(val results: List<OSActivity>)

interface OSActivityDataService {
    @GET("api/activity")
    fun getActivityList(): Call<OSActivityResponse>
}

class Repo {
    private val activityDataService: OSActivityDataService

    init {
        val retrofit = Retrofit
                .Builder()
                .baseUrl("ec2-54-202-187-99.us-west-2.compute.amazonaws.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        activityDataService = retrofit.create(OSActivityDataService::class.java)
    }

    fun getActivityList() : Call<OSActivityResponse> {
        return activityDataService.getActivityList()
    }
}