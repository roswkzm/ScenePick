plugins {
    alias(libs.plugins.scenepick.android.feature)
    alias(libs.plugins.scenepick.android.library.compose)
}

android {
    namespace = "com.example.scenepick.feature.home"
}

dependencies {

//    implementation(projects.core.domain)

    testImplementation(libs.hilt.android.testing)
}