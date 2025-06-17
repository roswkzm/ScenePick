package com.example.scenepick.core.data

internal interface DataMapper<DomainModel> {
    fun toDomain(): DomainModel
}