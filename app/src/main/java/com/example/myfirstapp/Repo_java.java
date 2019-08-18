//package com.example.myfirstapp;
//
////import optimizedSelfService;
//
//
//import android.util.Log;
//
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//
//public class Repo {
//    Retrofit retrofit;
//    OptimizedSelfService optimized_self_service;
//
//    public Repo() {
//        retrofit = new Retrofit.Builder()
//                .baseUrl("ec2-54-202-187-99.us-west-2.compute.amazonaws.com")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        optimized_self_service = retrofit.create(OptimizedSelfService.class);
//    }
//
//    public void get() {
//        Call call = optimized_self_service.listActivities();
//
//        call.enqueue(new Callback<List<OSActivity>>() {
//            @Override
//            public void onResponse(Call<List<OSActivity>> call, Response<List<OSActivity>> response) {
//                int statusCode = response.code();
//
//                Log.d("Repo", String.valueOf(response.body()));
//
//                // User user = response.body();
//            }
//
//            @Override
//            public void onFailure(Call<List<OSActivity>> call, Throwable t) {
//                // Log error here since request failed
//                Log.d("Repo", "Oh NOES!");
//            }
//        });
//    }
//}
//
//
//
