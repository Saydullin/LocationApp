package com.saydullin.locationapp.presentation.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saydullin.locationapp.domain.model.Location
import com.saydullin.locationapp.domain.usecase.location.AddLocationUseCase
import com.saydullin.locationapp.domain.usecase.location.GetLocationsByIdUseCase
import com.saydullin.locationapp.domain.usecase.location.RemoveLocationUseCase
import com.saydullin.locationapp.domain.usecase.location.RenameLocationUseCase
import com.saydullin.locationapp.domain.util.Resource
import com.saydullin.locationapp.domain.util.StatusCode
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LocationViewModel @Inject constructor(
    private val addLocationUseCase : AddLocationUseCase,
    private val getLocationsByIdUseCase: GetLocationsByIdUseCase,
    private val renameLocationUseCase: RenameLocationUseCase,
    private val removeLocationUseCase: RemoveLocationUseCase,
): ViewModel() {

    private val _locations = mutableStateOf<List<Location>?>(null)
    private val _statusCode = mutableStateOf<StatusCode?>(null)
    val statusCode = _statusCode
    val location = _locations

    fun getLocationsById(id: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            val locationsById = getLocationsByIdUseCase.execute(id)
            if (locationsById is Resource.Success) {
                _locations.value = locationsById.data
                _statusCode.value = null
            } else {
                _statusCode.value = locationsById.statusCode
                _locations.value = null
            }
        }
    }

    fun addLocation(location: Location) {
        viewModelScope.launch(Dispatchers.IO) {
            val locationAddedResult = addLocationUseCase.execute(location)
            if (locationAddedResult is Resource.Success) {
                _statusCode.value = StatusCode.LOCATION_ADDED
            } else {
                _statusCode.value = locationAddedResult.statusCode
            }
        }
    }

}