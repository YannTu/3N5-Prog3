plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.tupayachi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jsoup:jsoup:1.18.1")
    implementation("commons-validator:commons-validator:1.9.0")
    implementation("org.magicwerk.brownies:brownies-collections:0.9.23")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}