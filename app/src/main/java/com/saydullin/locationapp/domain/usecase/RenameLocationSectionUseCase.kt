package com.saydullin.locationapp.domain.usecase

import com.saydullin.locationapp.domain.repository.LocationRepository
import com.saydullin.locationapp.domain.util.Resource
import javax.inject.Inject

class RenameLocationSectionUseCase @Inject constructor(
    private val locationRepository: LocationRepository
) {

    suspend fun execute(newTitle: String): Resource<Unit> {
        return locationRepository.renameLocationSection(newTitle)
    }

}