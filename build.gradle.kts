plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "com.mooncrown04"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.recloudstream.cloudstream:library-jvm:master-SNAPSHOT")
    implementation("org.jsoup:jsoup:1.18.3")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
}

application {
    mainClass.set("com.mooncrown04.M3UStreamProviderKt") // Eğer main fonksiyon yoksa bu kısmı kaldırabilirsin
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

