package com.saydullin.locationapp.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LocationSectionEntity(
    @PrimaryKey val id: Int,
    val title: String,
)
