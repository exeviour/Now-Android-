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

package com.google.samples.apps.nowinandroid.feature.bookmarks

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.google.samples.apps.nowinandroid.core.domain.model.SaveableNewsResource
import com.google.samples.apps.nowinandroid.core.model.data.previewNewsResources
import com.google.samples.apps.nowinandroid.core.ui.NewsFeedUiState
import org.junit.Rule
import org.junit.Test

/**
 * UI tests for [BookmarksScreen] composable.
 */
class BookmarksScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun loading_showsLoadingSpinner() {
        launchBookmarksRobot(
            composeTestRule,
            NewsFeedUiState.Loading
        ) {
            loadingIndicatorShown()
        }
    }

    @Test
    fun feed_whenHasBookmarks_showsBookmarks() {
        launchBookmarksRobot(
            composeTestRule,
            NewsFeedUiState.Success(
                previewNewsResources.take(2)
                    .map { SaveableNewsResource(it, true) }
            )
        ) {
            clickNewsResourceBookmark(previewNewsResources[0])
            scrollToNewsResource(previewNewsResources[1])
            clickableNewsResourceExists(previewNewsResources[1])
        }
    }

    @Test
    fun feed_whenRemovingBookmark_removesBookmark() {
        launchBookmarksRobot(
            composeTestRule,
            NewsFeedUiState.Success(
                previewNewsResources.take(2)
                    .map { SaveableNewsResource(it, true) }
            )
        ) {
            clickNewsResourceBookmark(previewNewsResources[0])
            removedNewsResourceBookmark(previewNewsResources[0])
        }
    }
}

private fun launchBookmarksRobot(
    composeTestRule: AndroidComposeTestRule<ActivityScenarioRule<ComponentActivity>, ComponentActivity>,
    newsFeedUiState: NewsFeedUiState,
    func: BookmarksRobot.() -> Unit
) = BookmarksRobot(composeTestRule).apply {
    setContent(newsFeedUiState)
    func()
}
