package com.saydullin.locationapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.saydullin.locationapp.data.db.dao.LocationDao
import com.saydullin.locationapp.data.db.dao.LocationImageDao
import com.saydullin.locationapp.data.db.dao.LocationSectionDao
import com.saydullin.locationapp.data.db.entities.LocationEntity
import com.saydullin.locationapp.data.db.entities.LocationImageEntity
import com.saydullin.locationapp.data.db.entities.LocationSectionEntity

@Database(
    entities = [
        LocationSectionEntity::class,
        LocationEntity::class,
        LocationImageEntity::class,
    ],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun locationSectionDao(): LocationSectionDao

    abstract fun locationDao(): LocationDao

    abstract fun locationImageDao(): LocationImageDao

}