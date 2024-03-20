package com.saydullin.locationapp.domain.model

data class Location(
    val id: Int,
    val title: String,
    val collection: List<LocationImage>
)
