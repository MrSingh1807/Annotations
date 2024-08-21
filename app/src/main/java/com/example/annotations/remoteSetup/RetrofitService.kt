package com.example.annotations.remoteSetup

import com.example.annotations.remoteSetup.modals.ListRequest
import com.ashwani.mockgeocamera.dsalearning.daggerLearning.modals.RestaurentListResponse
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST


interface RetrofitService {


    @POST("api/fetch_restaurant_list")
    @Authenticated
    suspend fun fetchRestaurantList(
        @Body request: ListRequest
    ): RestaurentListResponse

}