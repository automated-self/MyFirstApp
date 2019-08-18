package com.example.myfirstapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OptimizedSelfService {
    @GET("api/activity")
    Call<List<OSActivity>> listActivities();
}
