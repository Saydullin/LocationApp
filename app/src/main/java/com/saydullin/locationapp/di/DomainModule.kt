package com.saydullin.locationapp.di

import com.saydullin.locationapp.domain.repository.LocationSectionRepository
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
    fun providesAddLocationUseCase(
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
    fun providesRemoveLocationUseCase(
        locationSectionRepository: LocationSectionRepository
    ): RemoveLocationSectionUseCase {
        return RemoveLocationSectionUseCase(
            locationSectionRepository = locationSectionRepository
        )
    }

    @Provides
    fun providesRemoveLocationSectionUseCase(
        locationSectionRepository: LocationSectionRepository
    ): RenameLocationSectionUseCase {
        return RenameLocationSectionUseCase(
            locationSectionRepository = locationSectionRepository
        )
    }

}