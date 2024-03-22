package com.saydullin.locationapp.di

import com.saydullin.locationapp.data.db.entities.LocationEntity
import com.saydullin.locationapp.data.db.entities.LocationImageEntity
import com.saydullin.locationapp.domain.mapper.LocationEntityMapper
import com.saydullin.locationapp.domain.mapper.LocationImageEntityMapper
import com.saydullin.locationapp.domain.mapper.LocationMapper
import com.saydullin.locationapp.domain.mapper.Mapper
import com.saydullin.locationapp.domain.model.Location
import com.saydullin.locationapp.domain.model.LocationImage
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MapperModule {

    @Binds
    abstract fun bindLocationEntityMapper(
        mapper: LocationEntityMapper
    ): Mapper<Location, LocationEntity>

    @Binds
    abstract fun bindLocationMapper(
        mapper: LocationMapper
    ): Mapper<LocationEntity, Location>

    @Binds
    abstract fun bindLocationImageEntityMapper(
        mapper: LocationImageEntityMapper
    ): Mapper<LocationImageEntity, LocationImage>

}


