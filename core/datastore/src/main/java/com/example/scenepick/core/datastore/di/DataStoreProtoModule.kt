package com.example.scenepick.core.datastore.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.core.DataStoreFactory
import androidx.datastore.dataStoreFile
import com.example.scenepick.core.common.network.Dispatcher
import com.example.scenepick.core.common.network.SpDispatchers.IO
import com.example.scenepick.core.common.network.di.ApplicationScope
import com.example.scenepick.core.datastore.UserPreferences
import com.example.scenepick.core.datastore.UserPreferencesSerializer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataStoreProtoModule {

    @Provides
    @Singleton
    internal fun providesUserPreferencesDataStore(
        @ApplicationContext context: Context,
        @Dispatcher(IO) ioDispatcher: CoroutineDispatcher,
        @ApplicationScope scope: CoroutineScope,
        userPreferencesSerializer: UserPreferencesSerializer,
    ): DataStore<UserPreferences> =
        DataStoreFactory.create(
            serializer = userPreferencesSerializer,
            scope = CoroutineScope(scope.coroutineContext + ioDispatcher),
        ) {
            context.dataStoreFile("user_preferences.pb")
        }
}