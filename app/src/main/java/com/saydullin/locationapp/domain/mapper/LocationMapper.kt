package com.saydullin.locationapp.domain.mapper

import com.saydullin.locationapp.data.db.entities.LocationEntity
import com.saydullin.locationapp.domain.model.Location
import javax.inject.Inject

class LocationMapper @Inject constructor(

): Mapper<LocationEntity, Location>() {

    override fun map(from: LocationEntity): Location {

        return Location(
            id = from.id,
            title = from.title,
            sectionId = from.sectionId,
            collection = listOf()
        )
    }

}


