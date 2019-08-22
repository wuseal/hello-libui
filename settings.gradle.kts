pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlin-multiplatform") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }

    repositories {
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-dev") }
        mavenCentral()
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
}
