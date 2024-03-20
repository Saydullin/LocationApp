package com.saydullin.locationapp.data.repository

import com.saydullin.locationapp.domain.model.Location
import com.saydullin.locationapp.domain.model.LocationSection
import com.saydullin.locationapp.domain.repository.LocationRepository
import com.saydullin.locationapp.domain.util.Resource

class LocationRepositoryImpl : LocationRepository {

    override suspend fun getLocationSection(): Resource<LocationSection> {
        TODO("Not yet implemented")
    }

    override suspend fun renameLocationSection(newTitle: String): Resource<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun addLocation(location: Location): Resource<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun removeLocation(location: Location): Resource<Unit> {
        TODO("Not yet implemented")
    }

}