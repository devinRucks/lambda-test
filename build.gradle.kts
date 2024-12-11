plugins {
    java
    war
    kotlin("jvm") version "1.9.23"
}

group = "com.drucks"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    implementation("com.amazonaws:aws-lambda-java-core:1.2.1")
//    implementation("com.amazonaws:aws-lambda-java-events:2.2.7")
//    implementation("com.amazonaws:aws-java-sdk-lambda:1.11.762")

    implementation("com.amazonaws:aws-java-sdk-lambda:1.11.762")
    implementation("com.amazonaws:aws-lambda-java-events:2.2.7")
    implementation("com.amazonaws:aws-lambda-java-core:1.2.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
