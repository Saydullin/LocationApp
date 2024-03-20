package com.saydullin.locationapp.domain.repository

import com.saydullin.locationapp.domain.model.Location
import com.saydullin.locationapp.domain.model.LocationSection
import com.saydullin.locationapp.domain.util.Resource

interface LocationRepository {

    suspend fun getLocationSection(): Resource<LocationSection>

    suspend fun renameLocationSection(newTitle: String): Resource<Unit>

    suspend fun addLocation(location: Location): Resource<Unit>

    suspend fun removeLocation(location: Location): Resource<Unit>

}