/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.busschedule.database.schedule

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/**
 * Provides access to read/write operations on the schedule table.
 * Used by the view models to format the query results for use in the UI.
 */
@Dao
interface ScheduleDao {

    @Query("SELECT * FROM schedule ORDER BY Bus_Arrival_Schedule DESC")
    fun getAll(): Flow<List<Schedule>>

    @Query("SELECT * FROM schedule WHERE Station_bus = :stopName ORDER BY Bus_Arrival_Schedule ASC")
    fun getByStopName(BusArrival_Schedule: String): Flow<List<Schedule>>

}
