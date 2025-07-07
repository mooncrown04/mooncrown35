plugins {
    kotlin("jvm") version "2.1.10"
    id("java-library")
}

group = "com.mooncrown04"
version = "1.0"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    // Sürüm burada güncellendi
    implementation("com.github.recloudstream:cloudstream:master-SNAPSHOT")
}

tasks.register<Jar>("cs3") {
    archiveBaseName.set("mooncrown35")
    archiveExtension.set("cs3")
    from(sourceSets.main.get().output)
    from("plugin.json")
}
