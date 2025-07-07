plugins {
    kotlin("jvm") version "1.9.10"
}

version = 2

cloudstream {
    description = "Watch livestreams from Twitch"
    authors = listOf("mooncrown04")

    /**
     * Status int as one of the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta-only
     **/
    status = 1

    tvTypes = listOf("Live")
    iconUrl = "https://www.google.com/s2/favicons?domain=twitch.tv&sz=%size%"
    isCrossPlatform = true
}

repositories {
    mavenCentral()
    google()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("com.github.recloudstream.cloudstream:library-jvm:master-SNAPSHOT")
    implementation("com.github.Blatzar:NiceHttp:0.4.11")
    implementation("org.jsoup:jsoup:1.18.3")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
}
