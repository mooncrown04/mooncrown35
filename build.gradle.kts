plugins {
    id 'org.jetbrains.kotlin.jvm' version '1.9.0'
}

group 'com.mooncrown04'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
    // Cloudstream ve nicehttp için ek repository gerekebilir:
    maven { url "https://jitpack.io" }
}

dependencies {
    implementation 'org.jsoup:jsoup:1.15.4'
    implementation 'com.github.recloudstream:cloudstream:3.4.0'
    implementation 'com.github.recloudstream:nicehttp:0.1.21'
}
