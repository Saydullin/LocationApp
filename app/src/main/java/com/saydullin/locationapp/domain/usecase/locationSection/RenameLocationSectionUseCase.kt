package com.saydullin.locationapp.domain.usecase.locationSection

import com.saydullin.locationapp.domain.repository.LocationSectionRepository
import com.saydullin.locationapp.domain.util.Resource
import javax.inject.Inject

class RenameLocationSectionUseCase @Inject constructor(
    private val locationSectionRepository: LocationSectionRepository
) {

    suspend fun execute(locationSectionId: Int, newTitle: String): Resource<Unit> {
        return locationSectionRepository.renameLocationSection(locationSectionId, newTitle)
    }

}


