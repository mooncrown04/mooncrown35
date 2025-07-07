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
    // Cloudstream ve nicehttp için uygun sürümleri kullanın, örnek:
    implementation("com.github.recloudstream:cloudstream:3.4.0")
    implementation("com.github.recloudstream:nicehttp:0.1.21")
}
