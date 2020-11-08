/**
kotlin 提取常量文件
 **/

object KotlinConstants {
    const val kotlinPlugin = "1.4.10"
    const val gradleVersion = "4.0.1"
}

object AppConfig {
    const val compileSdkVersion = 29
    const val buildToolsVersion = "29.0.3"
    const val minSdkVersion = 21
    const val targetSdkVersion = 29
    const val versionCode = 1
    const val versionName = "1.0"
    var applicationId = "com.example.aivoice"
}

object DependenciesConfig {
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:1.4.10"

    const val CORE_KTX = "androidx.core:core-ktx:1.3.2"

    const val APPCOMPAT = "androidx.appcompat:appcompat:1.2.0"

    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.4"

    const val EVENT_BUS = "org.greenrobot:eventbus:3.2.0"

    const val AROUTER="com.alibaba:arouter-api:1.5.1"

    const val AROUTER_COMPILER="com.alibaba:arouter-compiler:1.5.1"

}

object ModuleConfig {
    var isApp = true

    const val MODULE_APP_MANAGER = "com.example.module_app_manager"
    const val MODULE_CONSTELLATION = "com.example.module_constellation"
    const val MODULE_DEVELOPER = "com.example.module_developer"
    const val MODULE_JOKE = "com.example.module_joke"
    const val MODULE_MAP = "com.example.module_map"
    const val MODULE_SETTING = "com.example.module_setting"
    const val MODULE_VOICE_SETTING = "com.example.module_voice_setting"
    const val MODULE_WEATHER = "com.example.module_weather"
}