package com.saydullin.locationapp.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.saydullin.locationapp.data.db.entities.LocationEntity
import com.saydullin.locationapp.data.db.entities.LocationImageEntity

@Dao
interface LocationDao {

    @Query("SELECT * FROM LocationEntity AS location" +
            " JOIN LocationImageEntity AS image ON location.id = image.locationId")
    fun getAllLocations(): Map<LocationEntity, List<LocationImageEntity>>

    @Query("SELECT * FROM LocationEntity AS location" +
            " JOIN LocationImageEntity AS image ON location.id = image.locationId " +
            "WHERE location.sectionId = :sectionId")
    fun getLocationsBySectionId(sectionId: Int): Map<LocationEntity, List<LocationImageEntity>>

    @Query("UPDATE LocationEntity SET title = :newTitle WHERE id = :locationId")
    fun renameLocationTitle(locationId: Int, newTitle: String)

    @Insert
    fun addLocation(location: LocationEntity)

    @Delete
    fun removeLocation(location: LocationEntity)

}