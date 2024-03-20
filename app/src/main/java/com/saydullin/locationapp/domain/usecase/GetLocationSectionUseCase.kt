package com.saydullin.locationapp.domain.usecase

import com.saydullin.locationapp.domain.model.LocationSection
import com.saydullin.locationapp.domain.repository.LocationRepository
import com.saydullin.locationapp.domain.util.Resource
import javax.inject.Inject

class GetLocationSectionUseCase @Inject constructor(
    private val locationRepository: LocationRepository
) {

    suspend fun execute(): Resource<LocationSection> {
        return locationRepository.getLocationSection()
    }

}