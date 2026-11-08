rootProject.name = "ae2wtlib"
pluginManagement {
    plugins {
        id("net.neoforged.moddev") version "2.0.141"
        id("net.neoforged.moddev.repositories") version "2.0.141"
        id("com.diffplug.spotless") version "7.0.0.BETA2"
    }
}
plugins {
    id("net.neoforged.moddev.repositories")
}
dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        maven {
            url = uri("https://modmaven.dev/")
            content {
            }
        }
        // синк/порт 26.1.2: shedaniel/architectury maven-блок удалён — политика (AGENTS.md п.3а)
        maven {
            url = uri("https://maven.terraformersmc.com/")
            content {
                includeGroup("dev.emi")
            }
        }
        maven {
            url = uri("https://maven.theillusivec4.top/")
            content {
                includeGroup("top.theillusivec4.curios")
            }
        }
        maven {
            url = uri("https://api.modrinth.com/maven")
            content {
                includeGroup("maven.modrinth")
            }
        }
    }
}

include("ae2wtlib_api")
