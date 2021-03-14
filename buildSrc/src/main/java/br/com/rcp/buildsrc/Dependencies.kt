package br.com.rcp.buildsrc

object Dependencies {
    object Versions {
        object Builds {
            val buildGradle                     = "4.1.2"
            val kotlinGradlePlugin              = "1.4.21"
            val navigationSafeArgsGradlePlugin  = "2.3.4"
        }

        object Libraries {
            val kotlinStandardLibrary           = "1.4.21"
            val androidCoreKTX                  = "1.3.2"
            val androidAPPCompat                = "1.2.0"
            val androidMaterial                 = "1.3.0"
        }

        object Tests {
            val jUnit                           = "4.13.1"
            val jUnitExtension                  = "1.1.2"
            val espressoCore                    = "3.3.0"
        }
    }

    object Libraries {
        val kotlinStandardLibrary           = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Libraries.kotlinStandardLibrary}"
        val androidCoreKTX                  = "androidx.core:core-ktx:${Versions.Libraries.androidCoreKTX}"
        val androidAPPCompat                = "androidx.appcompat:appcompat:${Versions.Libraries.androidAPPCompat}"
        val androidMaterial                 = "com.google.android.material:material:${Versions.Libraries.androidMaterial}"
    }

    object Tests {
        val jUnit                           = "junit:junit:${Versions.Tests.jUnit}"
        val jUnitExtension                  = "androidx.test.ext:junit:${Versions.Tests.jUnitExtension}"
        val espressoCore                    = "androidx.test.espresso:espresso-core:${Versions.Tests.espressoCore}"
    }

    object Builds {
        val buildGradle                     = "com.android.tools.build:gradle:${Versions.Builds.buildGradle}"
        val kotlinGradlePlugin              = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Builds.kotlinGradlePlugin}"
        val navigationSafeArgsGradlePlugin  = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.Builds.navigationSafeArgsGradlePlugin}"
    }
}
