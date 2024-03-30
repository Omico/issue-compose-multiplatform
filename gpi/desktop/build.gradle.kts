plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
}

compose {
    desktop {
        application {
            mainClass = "me.omico.gpi.desktop.DesktopKt"
        }
    }
}

dependencies {
    implementation(project(":gpi-shared"))
    implementation(compose.desktop.currentOs)
}
