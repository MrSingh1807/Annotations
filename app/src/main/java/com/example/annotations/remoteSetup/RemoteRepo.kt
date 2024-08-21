package com.example.annotations.remoteSetup

import com.example.annotations.remoteSetup.modals.ListRequest
import com.example.annotations.remoteSetup.modals.Location
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject


@ViewModelScoped
class RemoteRepo @Inject constructor(private val apiService: RetrofitService) {

    suspend fun fetchList(location: Location) =
        apiService.fetchRestaurantList(ListRequest(location)).body.restaraunts


}

