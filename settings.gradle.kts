import java.util.Locale

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

if (!file(".git").exists()) {
    val errorText = """
        
        =====================[ ERROR ]=====================
         The Mizi project directory is not a properly cloned Git repository.
         
         In order to build Mizi from source you must clone
         the Mizi repository using Git, not download a code
         zip from GitHub.
         
         See https://github.com/PaperMC/Paper/blob/master/CONTRIBUTING.md
         for further information on building and modifying Paper and Forks.
        ===================================================
    """.trimIndent()
    error(errorText)
}

rootProject.name = "mizi"

for (name in listOf("Mizi-API", "Mizi-Server")) {
    val projName = name.lowercase(Locale.ENGLISH)
    include(projName)
    file(name).mkdirs()
    findProject(":$projName")!!.projectDir = file(name)
}
