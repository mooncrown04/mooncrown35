plugins {
    id("cloudstream-plugin") version "1.0.0"
    kotlin("jvm") version "1.8.0"
}

cloudstream {
    description = "M3U playlist okuyucu eklentisi"
    authors = listOf("mooncrown35")
    status = 1
    tvTypes = listOf("Live")
    iconUrl = "https://www.google.com/s2/favicons?domain=twitch.tv&sz=%size%"
    isCrossPlatform = true
}

repositories {
    mavenCentral()
    google()
    maven("https://jitpack.io")
    maven("https://recloudstream.github.io/maven")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.recloudstream.cloudstream:library-jvm:master-SNAPSHOT")
    implementation("com.github.Blatzar:NiceHttp:0.4.11")
    implementation("org.jsoup:jsoup:1.18.3")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
}
