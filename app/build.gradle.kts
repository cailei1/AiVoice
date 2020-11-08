import org.jetbrains.kotlin.fir.expressions.FirEmptyArgumentList.arguments
import org.jetbrains.kotlin.fir.resolve.calls.ResolvedCallArgument.DefaultArgument.arguments

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}
android {
    compileSdkVersion(AppConfig.compileSdkVersion)
    buildToolsVersion(AppConfig.buildToolsVersion)

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdkVersion(AppConfig.minSdkVersion)
        targetSdkVersion(AppConfig.targetSdkVersion)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        kapt {
            arguments {
                arg("AROUTER_MODULE_NAME", project.name)
            }
        }
    }

    signingConfigs {
        register("release") {
            keyAlias = "lei"
            keyPassword = "123456"
            storeFile = file("/src/main/jks/aivoice.jks")
            storePassword = "123456"
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            //自动签名打包
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    //输出类型
    android.applicationVariants.all {
        val buildType = this.buildType.name
        outputs.all {
            if (this is com.android.build.gradle.internal.api.ApkVariantOutputImpl) {
                this.outputFileName = "AI_V${defaultConfig.versionName}_${buildType}.apk"
            }
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}


dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(project(":lib_base"))

    if (!ModuleConfig.isApp) {
        implementation(project(":module_joke"))
        implementation(project(":module_map"))
    }

    kapt(DependenciesConfig.AROUTER_COMPILER)
}