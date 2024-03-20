package com.saydullin.locationapp.domain.usecase.location

import com.saydullin.locationapp.domain.repository.LocationRepository
import com.saydullin.locationapp.domain.util.Resource
import javax.inject.Inject

class RenameLocationUseCase @Inject constructor(
    private val locationRepository: LocationRepository
) {

    suspend fun execute(locationId: Int, newTitle: String): Resource<Unit> {
        return locationRepository.renameLocationTitle(locationId, newTitle)
    }

}


