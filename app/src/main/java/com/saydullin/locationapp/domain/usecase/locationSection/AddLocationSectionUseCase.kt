package com.saydullin.locationapp.domain.usecase.locationSection

import com.saydullin.locationapp.domain.model.LocationSection
import com.saydullin.locationapp.domain.repository.LocationSectionRepository
import com.saydullin.locationapp.domain.util.Resource
import javax.inject.Inject

class AddLocationSectionUseCase @Inject constructor(
    private val locationSectionRepository: LocationSectionRepository
) {

    suspend fun execute(location: LocationSection): Resource<Unit> {
        return locationSectionRepository.addLocationSection(location)
    }

}


