package com.saydullin.locationapp.domain.mapper

abstract class Mapper<From, To> {

    abstract fun map(from: From): To

}


