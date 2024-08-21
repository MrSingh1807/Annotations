package com.example.annotations.annotationLearning

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class User(
    val name: String,
    @SerialName("date_of_birth") val dob: String
)