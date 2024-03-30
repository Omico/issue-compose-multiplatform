plugins {
    kotlin("android")
    id("com.android.application")
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "me.omico.gpi.android"
    defaultConfig {
        compileSdk = 34
        targetSdk = 34
        minSdk = 21
    }
    buildFeatures {
        compose = true
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.11"
    }
}

dependencies {
    implementation(project(":gpi-shared"))
    implementation(androidx.activity.compose)
}
