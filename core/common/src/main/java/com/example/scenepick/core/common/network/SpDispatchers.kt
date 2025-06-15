package com.example.scenepick.core.common.network

import javax.inject.Qualifier
import kotlin.annotation.AnnotationRetention.RUNTIME

@Qualifier
@Retention(RUNTIME)
annotation class Dispatcher(val spDispatcher: SpDispatchers)

enum class SpDispatchers {
    Default,
    IO,
}
