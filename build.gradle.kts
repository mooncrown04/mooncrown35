plugins {
    id("com.lagradost.cloudstream3.gradle")
}

cloudstream {
    language = "tr"
    description = "M3U playlist okuyucu eklentisi"
    authors = listOf("mooncrown35")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jsoup:jsoup:1.18.3")
    implementation("com.github.Blatzar:NiceHttp:0.4.11")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
}
