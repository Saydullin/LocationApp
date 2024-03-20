package com.saydullin.locationapp.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LocationImageEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val locationId: Int,
    val src: String,
    val alt: String
)


