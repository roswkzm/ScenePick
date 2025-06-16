plugins {
    alias(libs.plugins.scenepick.android.library)
    alias(libs.plugins.scenepick.hilt)
}

android {
    namespace = "com.example.scenepick.core.datastore"
}

dependencies {
    api(libs.androidx.dataStore)
    api(projects.core.datastoreProto)

    implementation(projects.core.common)

    testImplementation(libs.kotlinx.coroutines.test)
}
