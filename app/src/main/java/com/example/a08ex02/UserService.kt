package com.example.a08ex02

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UserService {
    @GET("/search/users")
    fun searchUsers(@Query("q") query: String): Call<SearchResponse>
}
