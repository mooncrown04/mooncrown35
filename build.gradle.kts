plugins {
    kotlin("jvm") version "1.9.0"
}

group = "com.mooncrown04"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("org.jsoup:jsoup:1.15.4")
    // Cloudstream ve nicehttp YOK!
}
