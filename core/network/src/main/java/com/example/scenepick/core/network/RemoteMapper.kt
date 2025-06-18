package com.example.scenepick.core.network

interface RemoteMapper<DataModel> {
    fun toData(): DataModel
}