package com.saydullin.locationapp.domain.usecase.locationSection

import com.saydullin.locationapp.domain.model.LocationSection
import com.saydullin.locationapp.domain.repository.LocationSectionRepository
import com.saydullin.locationapp.domain.util.Resource
import javax.inject.Inject

class GetLocationSectionUseCase @Inject constructor(
    private val locationSectionRepository: LocationSectionRepository
) {

    suspend fun execute(): Resource<LocationSection> {
        return locationSectionRepository.getLocationSection()
    }

}