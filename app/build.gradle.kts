plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.myownportfolio.simplemvvmwithcoroutine"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.myownportfolio.simplemvvmwithcoroutine"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // ViewModel and LiveData
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
// Compose extensions for LiveData
    implementation ("androidx.compose.runtime:runtime-livedata:1.5.3")
    // Kotlin Coroutines Core Library
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

    // Kotlin Coroutines Android Library
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // ViewModel Integration with Coroutines
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")

    // LifecycleScope and LiveDataScope Integration
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")


}