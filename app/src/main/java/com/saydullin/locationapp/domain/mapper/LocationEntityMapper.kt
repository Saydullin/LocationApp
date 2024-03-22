package com.saydullin.locationapp.domain.mapper

import com.saydullin.locationapp.data.db.entities.LocationEntity
import com.saydullin.locationapp.domain.model.Location
import javax.inject.Inject

class LocationEntityMapper @Inject constructor(

): Mapper<Location, LocationEntity>() {

    override fun map(from: Location): LocationEntity {
        return LocationEntity(
            id = from.id,
            title = from.title,
            sectionId = from.sectionId
        )
    }

}


