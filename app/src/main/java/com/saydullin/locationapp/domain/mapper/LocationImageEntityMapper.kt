package com.saydullin.locationapp.domain.mapper

import com.saydullin.locationapp.data.db.entities.LocationImageEntity
import com.saydullin.locationapp.domain.model.LocationImage
import javax.inject.Inject

class LocationImageEntityMapper @Inject constructor(

): Mapper<LocationImageEntity, LocationImage>() {

    override fun map(from: LocationImageEntity): LocationImage {
        TODO("Not yet implemented")
    }

}


