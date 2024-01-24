plugins {
    id("java")
}

group = "triet.iuh"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation ("com.github.javaparser:javaparser-symbol-solver-core:3.25.8")
}

tasks.test {
    useJUnitPlatform()
}