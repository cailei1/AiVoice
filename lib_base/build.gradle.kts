plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(AppConfig.compileSdkVersion)
    buildToolsVersion(AppConfig.buildToolsVersion)

    defaultConfig {
        minSdkVersion(AppConfig.minSdkVersion)
        targetSdkVersion(AppConfig.targetSdkVersion)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            //自动签名打包
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    api(DependenciesConfig.KOTLIN_STDLIB)
    api(DependenciesConfig.CORE_KTX)
    api(DependenciesConfig.APPCOMPAT)
    api(DependenciesConfig.CONSTRAINT_LAYOUT)


    api(DependenciesConfig.EVENT_BUS)

    api(DependenciesConfig.AROUTER)
    //运行时注解
    annotationProcessor(DependenciesConfig.AROUTER_COMPILER)


    api(project(":lib_voice"))
    api(project(":lib_network"))

}