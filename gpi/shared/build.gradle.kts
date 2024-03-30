plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("com.android.library")
}

kotlin {
    androidTarget {
        jvmToolchain(11)
    }

    jvm("desktop")

    sourceSets {
        commonMain {
            dependencies {
                implementation(compose.material3)
            }
        }
    }
}

android {
    namespace = "me.omico.gpi.shared"
    defaultConfig {
        compileSdk = 34
        minSdk = 21
    }
}
