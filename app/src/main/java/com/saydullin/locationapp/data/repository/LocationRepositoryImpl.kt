package com.saydullin.locationapp.data.repository

import com.saydullin.locationapp.data.db.dao.LocationDao
import com.saydullin.locationapp.data.db.dao.LocationImageDao
import com.saydullin.locationapp.domain.mapper.LocationEntityMapper
import com.saydullin.locationapp.domain.mapper.LocationImageEntityMapper
import com.saydullin.locationapp.domain.mapper.LocationMapper
import com.saydullin.locationapp.domain.model.Location
import com.saydullin.locationapp.domain.repository.LocationRepository
import com.saydullin.locationapp.domain.util.Resource
import com.saydullin.locationapp.domain.util.StatusCode

class LocationRepositoryImpl(
    override val locationDao: LocationDao,
    override val locationImageDao: LocationImageDao,
    override val locationMapper: LocationMapper,
    override val locationEntityMapper: LocationEntityMapper,
    override val locationImageEntityMapper: LocationImageEntityMapper,
) : LocationRepository {

    override suspend fun getAllLocations(): Resource<List<Location>> {
        TODO("Not yet implemented")
    }

    override suspend fun getLocationsBySectionId(locationId: Int): Resource<List<Location>> {
        val locationsList = ArrayList<Location>()
        val locationEntities = locationDao.getLocationsBySectionId(locationId)

        locationEntities.map { locationEntityMap ->
            val locationEntity = locationEntityMap.key
            val locationImageEntityList = locationEntityMap.value

            // Mapping
            val location = locationMapper.map(locationEntity)
            val locationImageList = locationImageEntityList.map {
                locationImageEntityMapper.map(it)
            }

            location.collection = locationImageList

            locationsList.add(location)
        }

        return Resource.Success(locationsList)
    }

    override suspend fun renameLocationTitle(
        location: Int,
        newLocationTitle: String
    ): Resource<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun addLocation(location: Location): Resource<Unit> {

        return try {
            locationDao.addLocation(locationEntityMapper.map(location))
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(statusCode = StatusCode.DATABASE_ERROR)
        }
    }

    override suspend fun removeLocation(location: Location): Resource<Unit> {
        TODO("Not yet implemented")
    }

}


