package com.example.scenepick.core.datastore

import androidx.datastore.core.DataStore
import javax.inject.Inject

class UserPreferencesDataSource @Inject constructor(
    private val userPreferences: DataStore<UserPreferences>
) {

}