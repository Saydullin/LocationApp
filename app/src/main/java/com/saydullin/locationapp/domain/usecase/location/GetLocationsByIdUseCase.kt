package com.saydullin.locationapp.domain.usecase.location

import com.saydullin.locationapp.domain.model.Location
import com.saydullin.locationapp.domain.repository.LocationRepository
import com.saydullin.locationapp.domain.util.Resource
import javax.inject.Inject

class GetLocationsByIdUseCase @Inject constructor(
    private val locationRepository: LocationRepository
) {

    suspend fun execute(locationId: Int): Resource<List<Location>> {
        return locationRepository.getLocationsById(locationId)
    }

}