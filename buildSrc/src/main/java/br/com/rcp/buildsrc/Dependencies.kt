package br.com.rcp.buildsrc

object Dependencies {
    object Versions {
        object Builds {
            const val buildGradle                     = "4.1.2"
            const val kotlinGradlePlugin              = "1.4.21"
            const val navigationSafeArgsGradlePlugin  = "2.3.4"
        }

        object Libraries {
            const val kotlinStandardLibrary           = "1.4.21"
            const val androidCoreKTX                  = "1.3.2"
            const val androidAPPCompat                = "1.2.0"
            const val androidMaterial                 = "1.3.0"
            const val interceptor                     = "4.8.1"
            const val retrofit                        = "2.9.0"
            const val koin                            = "2.1.5"
            const val sharedPreference                = "1.1.1"
            const val picasso                         = "2.71828"
            const val navigationKTX                   = "2.3.2"
            const val constraintLayout                = "2.0.4"
        }

        object Tests {
            const val jUnit                           = "4.13.1"
            const val jUnitExtension                  = "1.1.2"
            const val espressoCore                    = "3.3.0"
        }
    }

    object Libraries {
        const val kotlinStandardLibrary           = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Libraries.kotlinStandardLibrary}"
        const val androidCoreKTX                  = "androidx.core:core-ktx:${Versions.Libraries.androidCoreKTX}"
        const val androidAPPCompat                = "androidx.appcompat:appcompat:${Versions.Libraries.androidAPPCompat}"
        const val androidMaterial                 = "com.google.android.material:material:${Versions.Libraries.androidMaterial}"

        const val picasso                         = "com.squareup.picasso:picasso:${Versions.Libraries.picasso}"
        const val navigationFragmentKTX           = "androidx.navigation:navigation-fragment-ktx:${Versions.Libraries.navigationKTX}"
        const val navigationKTX                   = "androidx.navigation:navigation-ui-ktx:${Versions.Libraries.navigationKTX}"
        const val constraintLayout                =  "androidx.constraintlayout:constraintlayout:${Versions.Libraries.constraintLayout}"

        const val interceptor                     = "com.squareup.okhttp3:logging-interceptor:${Versions.Libraries.interceptor}"
        const val retrofit                        = "com.squareup.retrofit2:retrofit:${Versions.Libraries.retrofit}"
        const val gsonConverter                   = "com.squareup.retrofit2:converter-gson:${Versions.Libraries.retrofit}"

        const val koinViewModel                   = "org.koin:koin-androidx-viewmodel:${Versions.Libraries.koin}"
        const val koinScope                       = "org.koin:koin-androidx-scope:${Versions.Libraries.koin}"
        const val koin                            = "org.koin:koin-android:${Versions.Libraries.koin}"

        const val sharedPreference                = "androidx.preference:preference-ktx:${Versions.Libraries.sharedPreference}"
    }

    object Tests {
        const val jUnit                           = "junit:junit:${Versions.Tests.jUnit}"
        const val jUnitExtension                  = "androidx.test.ext:junit:${Versions.Tests.jUnitExtension}"
        const val espressoCore                    = "androidx.test.espresso:espresso-core:${Versions.Tests.espressoCore}"
    }

    object Builds {
        const val buildGradle                     = "com.android.tools.build:gradle:${Versions.Builds.buildGradle}"
        const val kotlinGradlePlugin              = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Builds.kotlinGradlePlugin}"
        const val navigationSafeArgsGradlePlugin  = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.Builds.navigationSafeArgsGradlePlugin}"
    }
}
