package com.saydullin.locationapp.data.repository

import com.saydullin.locationapp.domain.model.LocationSection
import com.saydullin.locationapp.domain.repository.LocationSectionRepository
import com.saydullin.locationapp.domain.util.Resource

class LocationSectionRepositoryImpl : LocationSectionRepository {

    override suspend fun getLocationSection(): Resource<LocationSection> {
        TODO("Not yet implemented")
    }

    override suspend fun renameLocationSection(locationSectionId: Int, newTitle: String): Resource<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun addLocationSection(locationSection: LocationSection): Resource<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun removeLocationSection(locationSection: LocationSection): Resource<Unit> {
        TODO("Not yet implemented")
    }

}