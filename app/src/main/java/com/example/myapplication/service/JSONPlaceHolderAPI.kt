package com.example.myapplication.service

import com.example.myapplication.models.RetrofitItem
import retrofit2.Call
import retrofit2.http.GET

interface JSONPlaceHolderAPI {

    @GET("posts")
    fun getPosts() : Call<List<RetrofitItem>>
}