// Top-level build file where you can add configuration options common to all sub-projects/modules.
import com.diffplug.spotless.extra.wtp.EclipseWtpFormatterStep

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.spotless)
}

spotless {
    kotlin {
        target("app/src/**/*.kt")
        ktlint()
    }

    kotlinGradle {
        target("*.gradle.kts", "app/*.gradle.kts")
        ktlint()
    }

    format("xml") {
        target("app/src/main/res/**/*.xml", "app/src/main/AndroidManifest.xml")
        eclipseWtp(EclipseWtpFormatterStep.XML)
    }
}
