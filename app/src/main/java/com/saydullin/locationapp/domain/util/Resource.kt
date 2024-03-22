package com.saydullin.locationapp.domain.util

sealed class Resource<T>(
    val data: T?,
    val statusCode: StatusCode = StatusCode.UNKNOWN_ERROR
) {

    class Success<T>(data: T?): Resource<T>(data)

    class Error<T>(statusCode: StatusCode, data: T? = null): Resource<T>(data, statusCode)

}