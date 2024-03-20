package com.saydullin.locationapp.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.saydullin.locationapp.data.db.entities.LocationEntity
import com.saydullin.locationapp.data.db.entities.LocationImageEntity

@Dao
interface LocationImageDao {

    @Query("SELECT * FROM LocationImageEntity")
    fun getAllLocationImages(): List<LocationImageEntity>

    @Query("SELECT * FROM LocationImageEntity WHERE locationId = :locationId")
    fun getLocationImagesById(locationId: Int): List<LocationImageEntity>

    @Insert
    fun addLocationImage(locationImage: LocationImageEntity)

    @Delete
    fun removeLocationImage(locationImage: LocationImageEntity)

}