package com.saydullin.locationapp.di

import com.saydullin.locationapp.domain.repository.LocationRepository
import com.saydullin.locationapp.domain.repository.LocationSectionRepository
import com.saydullin.locationapp.domain.usecase.location.AddLocationUseCase
import com.saydullin.locationapp.domain.usecase.location.GetAllLocationsUseCase
import com.saydullin.locationapp.domain.usecase.location.GetLocationsByIdUseCase
import com.saydullin.locationapp.domain.usecase.location.RemoveLocationUseCase
import com.saydullin.locationapp.domain.usecase.location.RenameLocationUseCase
import com.saydullin.locationapp.domain.usecase.locationSection.AddLocationSectionUseCase
import com.saydullin.locationapp.domain.usecase.locationSection.GetLocationSectionUseCase
import com.saydullin.locationapp.domain.usecase.locationSection.RemoveLocationSectionUseCase
import com.saydullin.locationapp.domain.usecase.locationSection.RenameLocationSectionUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun providesAddLocationSectionUseCase(
        locationSectionRepository: LocationSectionRepository
    ): AddLocationSectionUseCase {
        return AddLocationSectionUseCase(
            locationSectionRepository = locationSectionRepository
        )
    }

    @Provides
    fun providesGetLocationSectionUseCase(
        locationSectionRepository: LocationSectionRepository
    ): GetLocationSectionUseCase {
        return GetLocationSectionUseCase(
            locationSectionRepository = locationSectionRepository
        )
    }

    @Provides
    fun providesRemoveLocationSectionUseCase(
        locationSectionRepository: LocationSectionRepository
    ): RemoveLocationSectionUseCase {
        return RemoveLocationSectionUseCase(
            locationSectionRepository = locationSectionRepository
        )
    }

    @Provides
    fun providesRemoveLocationUseCase(
        locationRepository: LocationRepository
    ): RemoveLocationUseCase {
        return RemoveLocationUseCase(
            locationRepository = locationRepository
        )
    }

    @Provides
    fun providesRenameLocationSectionUseCase(
        locationSectionRepository: LocationSectionRepository
    ): RenameLocationSectionUseCase {
        return RenameLocationSectionUseCase(
            locationSectionRepository = locationSectionRepository
        )
    }

    @Provides
    fun providesRenameLocationUseCase(
        locationRepository: LocationRepository
    ): RenameLocationUseCase {
        return RenameLocationUseCase(
            locationRepository = locationRepository
        )
    }

    @Provides
    fun providesGetLocationUseCase(
        locationRepository: LocationRepository
    ): GetAllLocationsUseCase {
        return GetAllLocationsUseCase(
            locationRepository = locationRepository
        )
    }

    @Provides
    fun providesGetLocationsByIdUseCase(
        locationRepository: LocationRepository
    ): GetLocationsByIdUseCase {
        return GetLocationsByIdUseCase(
            locationRepository = locationRepository
        )
    }

    @Provides
    fun providesAddLocationUseCase(
        locationRepository: LocationRepository
    ): AddLocationUseCase {
        return AddLocationUseCase(
            locationRepository = locationRepository
        )
    }

}