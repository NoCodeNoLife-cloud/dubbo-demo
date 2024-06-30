plugins {
    id("java")
}

group = "org.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // Importing parallel dependencies
    implementation(project(":dubbo-spring-boot-demo-interface"))
}

tasks.test {
    useJUnitPlatform()
}