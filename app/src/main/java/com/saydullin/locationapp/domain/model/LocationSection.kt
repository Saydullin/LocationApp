package com.saydullin.locationapp.domain.model

data class LocationSection(
    val id: Int,
    val title: String,
    val location: List<Location>
)