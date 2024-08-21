package com.example.annotations.remoteSetup.modals

data class Location(
    val lat: Double,
    val long: Double
)

data class ListRequest(
    val location: Location,
)