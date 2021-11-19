plugins {
    id("com.android.application")
    id("kotlin-android")
}

val composeVersion = "1.0.5"
android {
    compileSdk =31
    buildToolsVersion ="31.0.0"

    defaultConfig {
        applicationId = "li.songe.ad_closer"
        minSdk =26
        targetSdk =31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
//    signingConfigs{
//        release{
//            storeFile = file("./android.jks")
//            storePassword = "KdMQ6pqiNSJ6Sype"
//            keyAlias = "key0"
//            keyPassword = "KdMQ6pqiNSJ6Sype"
//        }
//    }

    buildTypes {
        getByName("release") {
//            isMinifyEnabled = false
//            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
//            signingConfig = signingConfigs.getByName("release")
        }
//        debug{
//            signingConfig = signingConfigs.getByName("release")
//        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose =true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = composeVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.compose.ui:ui:$composeVersion")
    implementation("androidx.compose.material:material:$composeVersion")
    implementation("androidx.compose.ui:ui-tooling-preview:$composeVersion")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
    implementation("androidx.activity:activity-compose:1.4.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:$composeVersion")
    debugImplementation("androidx.compose.ui:ui-tooling:$composeVersion")

//    https://github.com/RikkaApps/Shizuku-API
    val shizuku_version = "12.1.0"
    implementation("dev.rikka.shizuku:api:$shizuku_version")
    // Add this line if you want to support Shizuku
    implementation("dev.rikka.shizuku:provider:$shizuku_version")

    //    工具集合类
    //    https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/README-CN.md
    implementation("com.blankj:utilcodex:1.30.6")

}