/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
    alias(libs.plugins.nowinandroid.kmp.library)
    alias(libs.plugins.nowinandroid.kotlin.inject)
    alias(libs.plugins.nowinandroid.android.library.compose)
    alias(libs.plugins.nowinandroid.android.hilt)
}

android {
    namespace = "com.google.samples.apps.nowinandroid.core.testing"
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(kotlin("test"))
//            api(libs.androidx.compose.ui.test)
            api(projects.core.analytics)
            api(projects.core.data)
            api(projects.core.model)
            api(projects.core.notifications)
            implementation(libs.kotlinx.coroutines.test)
            implementation(libs.kotlinx.datetime)
            implementation(projects.core.common)
            implementation(projects.core.designsystem)
        }

        androidMain.dependencies {
            api(libs.androidx.compose.ui.testManifest)
            implementation(libs.androidx.test.rules)
            implementation(libs.hilt.android.testing)
        }
    }
}
