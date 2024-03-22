package com.saydullin.locationapp.domain.repository

import com.saydullin.locationapp.data.db.dao.LocationDao
import com.saydullin.locationapp.data.db.dao.LocationImageDao
import com.saydullin.locationapp.domain.mapper.LocationEntityMapper
import com.saydullin.locationapp.domain.mapper.LocationImageEntityMapper
import com.saydullin.locationapp.domain.mapper.LocationMapper
import com.saydullin.locationapp.domain.model.Location
import com.saydullin.locationapp.domain.util.Resource

interface LocationRepository {

    val locationDao: LocationDao
    val locationImageDao: LocationImageDao
    val locationMapper: LocationMapper
    val locationEntityMapper: LocationEntityMapper
    val locationImageEntityMapper: LocationImageEntityMapper

    suspend fun getAllLocations(): Resource<List<Location>>

    suspend fun getLocationsBySectionId(locationId: Int): Resource<List<Location>>

    suspend fun renameLocationTitle(location: Int, newLocationTitle: String): Resource<Unit>

    suspend fun addLocation(location: Location): Resource<Unit>

    suspend fun removeLocation(location: Location): Resource<Unit>

}