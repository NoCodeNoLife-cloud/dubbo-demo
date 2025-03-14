plugins {
    id("java")
}

// Multi-project dependency management
allprojects {
    // Note: Don’t forget apply plugin
    apply(plugin = "java")

    group = "org.code"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.0"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter
        implementation("org.springframework.boot:spring-boot-starter:3.2.5")
        // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test
        testImplementation("org.springframework.boot:spring-boot-starter-test:3.2.5")
        // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-aop
        implementation("org.springframework.boot:spring-boot-starter-aop:3.2.5")

        // https://mvnrepository.com/artifact/org.projectlombok/lombok
        compileOnly("org.projectlombok:lombok:1.18.32")
        annotationProcessor("org.projectlombok:lombok:1.18.32")
        // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
        implementation("org.slf4j:slf4j-api:2.0.13")
        // https://mvnrepository.com/artifact/ch.qos.logback/logback-classic
        implementation("ch.qos.logback:logback-classic:1.5.6")
        // https://mvnrepository.com/artifact/ch.qos.logback/logback-core
        implementation("ch.qos.logback:logback-core:1.5.6")

        // https://mvnrepository.com/artifact/org.apache.dubbo/dubbo-spring-boot-starter
        implementation("org.apache.dubbo:dubbo-spring-boot-starter:3.3.0-beta.2")
        // https://mvnrepository.com/artifact/org.apache.dubbo/dubbo-rpc-triple
        implementation("org.apache.dubbo:dubbo-rpc-triple:3.3.0-beta.2")
        // https://mvnrepository.com/artifact/org.apache.dubbo/dubbo-dependencies-zookeeper-curator5
        implementation("org.apache.dubbo:dubbo-dependencies-zookeeper-curator5:3.2.14")
    }

    tasks.test {
        useJUnitPlatform()
    }
}