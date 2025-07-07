plugins {
    kotlin("jvm") version "1.8.0"
    id("java-library")
}

group = "com.mooncrown04"
version = "1.0"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.recloudstream:cloudstream:3.1.2") // Uyumlu sürüm
}

tasks.register<Jar>("cs3") {
    archiveBaseName.set("M3U_Stream")
    archiveExtension.set("cs3")
    from(sourceSets.main.get().output)
    from("plugin.json")
}
