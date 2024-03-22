package com.saydullin.locationapp.domain.model

data class Location(
    val id: Int,
    val title: String,
    val sectionId: Int,
    var collection: List<LocationImage>
)


