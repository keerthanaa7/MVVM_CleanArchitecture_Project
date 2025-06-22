plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("org.jetbrains.kotlin.kapt")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.mvvm_cleanarchitecture_project"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.mvvm_cleanarchitecture_project"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        buildConfigField("String", "API_KEY", "\"f60ae473c8d03fdd88e75848cea96a8e\"")

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
    buildFeatures {
        compose = true
        dataBinding = true
        buildConfig = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    // ViewModel and LiveData
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7") // Use the latest stable version
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.7") // Use the latest stable version
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7") // For lifecycle-aware coroutines
    // Saved State module for ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.8.0") // Use the latest stable version
    // Annotation processor for LiveData/Lifecycle components
    kapt("androidx.lifecycle:lifecycle-compiler:2.8.0") // Use the latest stable version
    val room_version = "2.7.2"

    implementation("androidx.room:room-runtime:$room_version")

    // If this project uses any Kotlin source, use Kotlin Symbol Processing (KSP)
    // See Add the KSP plugin to your project
    ksp("androidx.room:room-compiler:$room_version")
    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:$room_version")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1") // Or the latest stable version
    // For Android-specific features like Dispatchers.Main
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1") // Or the latest stable version
    implementation ("com.google.dagger:dagger:2.56.2")
    kapt ("com.google.dagger:dagger-compiler:2.56.2")
    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.10.0")
    // Gson Converter (for JSON parsing)
    implementation("com.squareup.retrofit2:converter-gson:2.10.0")
    // You might also need OkHttp for logging or other interceptors
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    kapt("com.github.bumptech.glide:compiler:4.16.0")
    // If you are using annotationProcessor instead of kapt, use:
     annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")

    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    // To use constraintlayout in compose
    implementation("androidx.constraintlayout:constraintlayout-compose:1.1.1")

}