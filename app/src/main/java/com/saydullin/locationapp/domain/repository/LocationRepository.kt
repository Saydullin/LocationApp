package com.saydullin.locationapp.domain.repository

import com.saydullin.locationapp.domain.model.Location
import com.saydullin.locationapp.domain.util.Resource

interface LocationRepository {

    suspend fun getAllLocations(): Resource<List<Location>>

    suspend fun getLocationsById(locationId: Int): Resource<List<Location>>

    suspend fun renameLocationTitle(location: Int, newLocationTitle: String): Resource<Unit>

    suspend fun addLocation(location: Location): Resource<Location>

    suspend fun removeLocation(location: Location): Resource<Location>

}