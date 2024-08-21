package com.example.annotations

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.annotations.remoteSetup.RemoteRepo
import com.example.annotations.remoteSetup.modals.Location
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainVM @Inject constructor(private val repo: RemoteRepo) : ViewModel() {


    fun fetchRestaurantList() {
        viewModelScope.launch(Dispatchers.IO) {
            val location = Location(28.64513, 77.21270)
            val response = repo.fetchList(location)

            Log.i("MrSingh", "fetchRestaurantList: $response")
        }
    }

}
