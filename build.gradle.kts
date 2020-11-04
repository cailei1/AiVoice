// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val gradle_version = "4.0.1"
    val kotlin_version = "1.4.10"
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${KotlinConstants.gradleVersion}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${KotlinConstants.kotlinPlugin}")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}
tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}

//task clean (type: Delete) {
//    delete rootProject . buildDir
//}