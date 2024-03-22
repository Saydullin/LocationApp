package com.saydullin.locationapp.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import com.saydullin.locationapp.domain.model.LocationImage

@Entity
data class LocationEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val sectionId: Int,
    val title: String,
)


