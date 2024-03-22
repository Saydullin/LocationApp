package com.saydullin.locationapp.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.saydullin.locationapp.data.db.entities.LocationSectionEntity

@Dao
interface LocationSectionDao {

    @Query("SELECT * FROM LocationSectionEntity")
    fun getLocationSection(): LocationSectionEntity?

    @Query("UPDATE LocationSectionEntity SET title = :newTitle WHERE id = :locationSectionId")
    fun renameLocationSection(locationSectionId: Int, newTitle: String)

    @Insert
    fun addLocationSection(locationSection: LocationSectionEntity)

    @Delete
    fun removeLocationSection(locationSection: LocationSectionEntity)

}


