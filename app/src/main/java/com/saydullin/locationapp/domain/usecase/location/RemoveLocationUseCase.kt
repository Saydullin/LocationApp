package com.saydullin.locationapp.domain.usecase.location

import com.saydullin.locationapp.domain.model.Location
import com.saydullin.locationapp.domain.repository.LocationRepository
import com.saydullin.locationapp.domain.repository.LocationSectionRepository
import com.saydullin.locationapp.domain.util.Resource
import javax.inject.Inject

class RemoveLocationUseCase @Inject constructor(
    private val locationRepository: LocationRepository
) {

    suspend fun execute(location: Location): Resource<Unit> {
        return locationRepository.removeLocation(location)
    }

}


