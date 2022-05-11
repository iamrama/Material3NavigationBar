package com.rk.material3_navigationbar.buildSrc

object libs{

    object  KotlinLibs{
        private const val version = "1.6.20"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
        const val kotlinCore = "androidx.core:core-ktx:1.7.0"
        const val ktxLifeCycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
    }
    object Coroutines {
        private const val version = "1.6.0"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"

    }

    object AndroidX{
        object Compose {
            const val snapshot = ""
            const val version = "1.1.1"

            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val ui = "androidx.compose.ui:ui:$version"
            const val uiUtil = "androidx.compose.ui:ui-util:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val material = "androidx.compose.material:material:$version"
            const val animation = "androidx.compose.animation:animation:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$version"
            const val iconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
            const val debugUiTest = "androidx.compose.ui:ui-test-manifest:1.1.1"
        }

        object MaterialUI{
            const val materialUI = "androidx.compose.material3:material3:1.0.0-alpha02"
        }

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.4.0"
        }

        object Lifecycle {
            const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:2.4.1"
        }

        object Navigation {
            const val navigationCompose = "androidx.navigation:navigation-compose:2.4.2"
            const val  navigationRunTime = "androidx.navigation:navigation-runtime-ktx:2.3.5"
        }

        object ConstraintLayout {
            const val constraintLayoutCompose =
                "androidx.constraintlayout:constraintlayout-compose:1.0.0"
        }

        object Test {
            private const val version = "1.4.0"
            const val core = "androidx.test:core:$version"
            const val runner = "androidx.test:runner:$version"
            const val rules = "androidx.test:rules:$version"
            object Ext {
                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }
            const val espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
            const val macroBenchmark = "androidx.benchmark:benchmark-macro-junit4:1.1.0-beta04"
            const val uiAutomator = "androidx.test.uiautomator:uiautomator:2.2.0"
        }

    }

    object JUnit {
        private const val version = "4.13.2"
        const val junit = "junit:junit:$version"
        const val jUnitExt = "androidx.test.ext:junit:1.1.3"
    }

    object Coil {
        const val coilCompose = "io.coil-kt:coil-compose:1.4.0"
    }
}