plugins {
    alias(libs.plugins.scenepick.jvm.library)
    alias(libs.plugins.scenepick.hilt)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.turbine)
}