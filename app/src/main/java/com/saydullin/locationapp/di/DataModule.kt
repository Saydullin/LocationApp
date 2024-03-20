package com.saydullin.locationapp.di

import android.content.Context
import androidx.room.Room
import com.saydullin.locationapp.data.db.AppDatabase
import com.saydullin.locationapp.data.db.dao.LocationDao
import com.saydullin.locationapp.data.db.dao.LocationImageDao
import com.saydullin.locationapp.data.db.dao.LocationSectionDao
import com.saydullin.locationapp.data.repository.LocationSectionRepositoryImpl
import com.saydullin.locationapp.domain.repository.LocationSectionRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun providesAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "LocationDatabase",
        ).build()
    }

    @Provides
    @Singleton
    fun providesLocationDao(appDatabase: AppDatabase): LocationDao {
        return appDatabase.locationDao()
    }

    @Provides
    @Singleton
    fun providesLocationSectionDao(appDatabase: AppDatabase): LocationSectionDao {
        return appDatabase.locationSectionDao()
    }

    @Provides
    @Singleton
    fun providesLocationImageDao(appDatabase: AppDatabase): LocationImageDao {
        return appDatabase.locationImageDao()
    }

    @Provides
    @Singleton
    fun providesLocationRepository(): LocationSectionRepository {
        return LocationSectionRepositoryImpl()
    }

}