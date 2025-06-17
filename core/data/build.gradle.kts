plugins {
    alias(libs.plugins.scenepick.jvm.library)
    alias(libs.plugins.scenepick.hilt)
    id("com.google.devtools.ksp")
}

dependencies {
    implementation(projects.core.domain)

    implementation(libs.kotlinx.coroutines.core)
    testImplementation(libs.kotlinx.coroutines.test)
}