package com.saydullin.locationapp.domain.repository

import com.saydullin.locationapp.domain.model.LocationSection
import com.saydullin.locationapp.domain.util.Resource

interface LocationSectionRepository {

    suspend fun getLocationSection(): Resource<LocationSection>

    suspend fun renameLocationSection(locationSectionId: Int, newTitle: String): Resource<Unit>

    suspend fun addLocationSection(locationSection: LocationSection): Resource<Unit>

    suspend fun removeLocationSection(locationSection: LocationSection): Resource<Unit>

}