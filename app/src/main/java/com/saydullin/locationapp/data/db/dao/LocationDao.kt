package com.saydullin.locationapp.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.saydullin.locationapp.data.db.entities.LocationEntity

@Dao
interface LocationDao {

    @Query("SELECT * FROM LocationEntity")
    fun getAllLocations(): List<LocationEntity>

    @Query("SELECT * FROM locationentity WHERE sectionId = :sectionId")
    fun getSectionLocations(sectionId: Int): List<LocationEntity>

    @Query("UPDATE LocationEntity SET title = :newTitle WHERE id = :locationId")
    fun renameLocationTitle(locationId: Int, newTitle: String)

    @Insert
    fun addLocation(location: LocationEntity)

    @Delete
    fun removeLocation(location: LocationEntity)

}