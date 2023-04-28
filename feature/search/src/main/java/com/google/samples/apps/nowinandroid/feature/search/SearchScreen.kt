/*
 * Copyright 2023 The Android Open Source Project
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

package com.google.samples.apps.nowinandroid.feature.search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells.Adaptive
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.samples.apps.nowinandroid.core.designsystem.icon.NiaIcons
import com.google.samples.apps.nowinandroid.core.designsystem.theme.NiaTheme
import com.google.samples.apps.nowinandroid.core.model.data.FollowableTopic
import com.google.samples.apps.nowinandroid.core.model.data.UserNewsResource
import com.google.samples.apps.nowinandroid.core.ui.DevicePreviews
import com.google.samples.apps.nowinandroid.core.ui.ImmutableListWrapper
import com.google.samples.apps.nowinandroid.core.ui.NewsFeedUiState
import com.google.samples.apps.nowinandroid.core.ui.R.string
import com.google.samples.apps.nowinandroid.core.ui.TrackScreenViewEvent
import com.google.samples.apps.nowinandroid.core.ui.TrackScrollJank
import com.google.samples.apps.nowinandroid.core.ui.immutableListWrapperOf
import com.google.samples.apps.nowinandroid.core.ui.newsFeed
import com.google.samples.apps.nowinandroid.feature.bookmarks.BookmarksViewModel
import com.google.samples.apps.nowinandroid.feature.foryou.ForYouViewModel
import com.google.samples.apps.nowinandroid.feature.interests.InterestsViewModel
import com.google.samples.apps.nowinandroid.feature.interests.TopicsTabContent
import com.google.samples.apps.nowinandroid.feature.search.R as searchR

@Composable
internal fun SearchRoute(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    onInterestsClick: () -> Unit,
    onTopicClick: (String) -> Unit,
    bookmarksViewModel: BookmarksViewModel = hiltViewModel(),
    interestsViewModel: InterestsViewModel = hiltViewModel(),
    searchViewModel: SearchViewModel = hiltViewModel(),
    forYouViewModel: ForYouViewModel = hiltViewModel(),
) {
    val recentSearchQueriesUiState by searchViewModel.recentSearchQueriesUiState.collectAsStateWithLifecycle()
    val searchResultUiState by searchViewModel.searchResultUiState.collectAsStateWithLifecycle()
    val searchQuery by searchViewModel.searchQuery.collectAsStateWithLifecycle()
    SearchScreen(
        modifier = modifier,
        onBackClick = onBackClick,
        onClearRecentSearches = searchViewModel::clearRecentSearches,
        onFollowButtonClick = interestsViewModel::followTopic,
        onInterestsClick = onInterestsClick,
        onSearchQueryChanged = searchViewModel::onSearchQueryChanged,
        onSearchTriggered = searchViewModel::onSearchTriggered,
        onTopicClick = onTopicClick,
        onNewsResourcesCheckedChanged = forYouViewModel::updateNewsResourceSaved,
        onNewsResourceViewed = { bookmarksViewModel.setNewsResourceViewed(it, true) },
        recentSearchesUiState = recentSearchQueriesUiState,
        searchQuery = searchQuery,
        searchResultUiState = searchResultUiState,
    )
}

@Composable
internal fun SearchScreen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {},
    onClearRecentSearches: () -> Unit = {},
    onFollowButtonClick: (String, Boolean) -> Unit = { _, _ -> },
    onInterestsClick: () -> Unit = {},
    onNewsResourcesCheckedChanged: (String, Boolean) -> Unit = { _, _ -> },
    onNewsResourceViewed: (String) -> Unit = {},
    onSearchQueryChanged: (String) -> Unit = {},
    onSearchTriggered: (String) -> Unit = {},
    onTopicClick: (String) -> Unit = {},
    searchQuery: String = "",
    recentSearchesUiState: RecentSearchQueriesUiState = RecentSearchQueriesUiState.Loading,
    searchResultUiState: SearchResultUiState = SearchResultUiState.Loading,
) {
    TrackScreenViewEvent(screenName = "Search")
    Column(modifier = modifier) {
        Spacer(Modifier.windowInsetsTopHeight(WindowInsets.safeDrawing))
        SearchToolbar(
            onBackClick = onBackClick,
            onSearchQueryChanged = onSearchQueryChanged,
            onSearchTriggered = onSearchTriggered,
            searchQuery = searchQuery,
        )
        when (searchResultUiState) {
            SearchResultUiState.Loading,
            SearchResultUiState.LoadFailed,
            -> Unit

            SearchResultUiState.SearchNotReady -> SearchNotReadyBody()
            SearchResultUiState.EmptyQuery,
            -> {
                if (recentSearchesUiState is RecentSearchQueriesUiState.Success) {
                    RecentSearchesBody(
                        onClearRecentSearches = onClearRecentSearches,
                        onRecentSearchClicked = {
                            onSearchQueryChanged(it)
                            onSearchTriggered(it)
                        },
                        recentSearchQueries = recentSearchesUiState.recentQueries,
                    )
                }
            }

            is SearchResultUiState.Success -> {
                if (searchResultUiState.isEmpty()) {
                    EmptySearchResultBody(
                        onInterestsClick = onInterestsClick,
                        searchQuery = searchQuery,
                    )
                    if (recentSearchesUiState is RecentSearchQueriesUiState.Success) {
                        RecentSearchesBody(
                            onClearRecentSearches = onClearRecentSearches,
                            onRecentSearchClicked = {
                                onSearchQueryChanged(it)
                                onSearchTriggered(it)
                            },
                            recentSearchQueries = recentSearchesUiState.recentQueries,
                        )
                    }
                } else {
                    SearchResultBody(
                        topics = searchResultUiState.topics,
                        onFollowButtonClick = onFollowButtonClick,
                        onNewsResourcesCheckedChanged = onNewsResourcesCheckedChanged,
                        onNewsResourceViewed = onNewsResourceViewed,
                        onSearchTriggered = onSearchTriggered,
                        onTopicClick = onTopicClick,
                        newsResources = searchResultUiState.newsResources,
                        searchQuery = searchQuery,
                    )
                }
            }
        }
        Spacer(Modifier.windowInsetsBottomHeight(WindowInsets.safeDrawing))
    }
}

@Composable
fun EmptySearchResultBody(
    onInterestsClick: () -> Unit,
    searchQuery: String,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 48.dp),
    ) {
        val message = stringResource(id = searchR.string.search_result_not_found, searchQuery)
        val start = message.indexOf(searchQuery)
        Text(
            text = AnnotatedString(
                text = message,
                spanStyles = listOf(
                    AnnotatedString.Range(
                        SpanStyle(fontWeight = FontWeight.Bold),
                        start = start,
                        end = start + searchQuery.length,
                    ),
                ),
            ),
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(vertical = 24.dp),
        )
        val interests = stringResource(id = searchR.string.interests)
        val tryAnotherSearchString = buildAnnotatedString {
            append(stringResource(id = searchR.string.try_another_search))
            append(" ")
            withStyle(
                style = SpanStyle(
                    textDecoration = TextDecoration.Underline,
                    fontWeight = FontWeight.Bold,
                ),
            ) {
                pushStringAnnotation(tag = interests, annotation = interests)
                append(interests)
            }
            append(" ")
            append(stringResource(id = searchR.string.to_browse_topics))
        }
        ClickableText(
            text = tryAnotherSearchString,
            style = MaterialTheme.typography.bodyLarge.merge(
                TextStyle(
                    textAlign = TextAlign.Center,
                ),
            ),
            modifier = Modifier
                .padding(start = 36.dp, end = 36.dp, bottom = 24.dp)
                .clickable {},
        ) { offset ->
            tryAnotherSearchString.getStringAnnotations(start = offset, end = offset)
                .firstOrNull()
                ?.let {
                    onInterestsClick()
                }
        }
    }
}

@Composable
private fun SearchNotReadyBody() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 48.dp),
    ) {
        Text(
            text = stringResource(id = searchR.string.search_not_ready),
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(vertical = 24.dp),
        )
    }
}

@Composable
private fun SearchResultBody(
    topics: ImmutableListWrapper<FollowableTopic>,
    newsResources: ImmutableListWrapper<UserNewsResource>,
    onFollowButtonClick: (String, Boolean) -> Unit,
    onNewsResourcesCheckedChanged: (String, Boolean) -> Unit,
    onNewsResourceViewed: (String) -> Unit,
    onSearchTriggered: (String) -> Unit,
    onTopicClick: (String) -> Unit,
    searchQuery: String = "",
) {
    if (topics.isNotEmpty()) {
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(stringResource(id = searchR.string.topics))
                }
            },
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        )
        TopicsTabContent(
            topics = topics,
            onTopicClick = {
                // Pass the current search query to ViewModel to save it as recent searches
                onSearchTriggered(searchQuery)
                onTopicClick(it)
            },
            onFollowButtonClick = onFollowButtonClick,
            withBottomSpacer = false,
        )
    }

    if (newsResources.isNotEmpty()) {
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(stringResource(id = searchR.string.updates))
                }
            },
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        )

        val state = rememberLazyGridState()
        TrackScrollJank(scrollableState = state, stateName = "search:newsResource")
        LazyVerticalGrid(
            columns = Adaptive(300.dp),
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            modifier = Modifier
                .fillMaxSize()
                .testTag("search:newsResources"),
            state = state,
        ) {
            newsFeed(
                feedState = NewsFeedUiState.Success(feed = newsResources),
                onNewsResourcesCheckedChanged = onNewsResourcesCheckedChanged,
                onNewsResourceViewed = onNewsResourceViewed,
                onTopicClick = onTopicClick,
                onExpandedCardClick = {
                    onSearchTriggered(searchQuery)
                },
            )
        }
    }
}

@Composable
private fun RecentSearchesBody(
    onClearRecentSearches: () -> Unit,
    onRecentSearchClicked: (String) -> Unit,
    recentSearchQueries: ImmutableListWrapper<String>,
) {
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append(stringResource(id = searchR.string.recent_searches))
                    }
                },
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            )
            if (recentSearchQueries.isNotEmpty()) {
                IconButton(
                    onClick = {
                        onClearRecentSearches()
                    },
                    modifier = Modifier.padding(horizontal = 16.dp),
                ) {
                    Icon(
                        imageVector = NiaIcons.Close,
                        contentDescription = stringResource(
                            id = searchR.string.clear_recent_searches_content_desc,
                        ),
                        tint = MaterialTheme.colorScheme.onSurface,
                    )
                }
            }
        }
        LazyColumn(modifier = Modifier.padding(horizontal = 16.dp)) {
            items(recentSearchQueries) { recentSearch ->
                Text(
                    text = recentSearch,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier
                        .padding(vertical = 16.dp)
                        .clickable {
                            onRecentSearchClicked(recentSearch)
                        }
                        .fillMaxWidth(),
                )
            }
        }
    }
}

@Composable
private fun SearchToolbar(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    onSearchQueryChanged: (String) -> Unit,
    searchQuery: String = "",
    onSearchTriggered: (String) -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth(),
    ) {
        IconButton(onClick = { onBackClick() }) {
            Icon(
                imageVector = NiaIcons.ArrowBack,
                contentDescription = stringResource(
                    id = string.back,
                ),
            )
        }
        SearchTextField(
            onSearchQueryChanged = onSearchQueryChanged,
            onSearchTriggered = onSearchTriggered,
            searchQuery = searchQuery,
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
private fun SearchTextField(
    onSearchQueryChanged: (String) -> Unit,
    searchQuery: String,
    onSearchTriggered: (String) -> Unit,
) {
    val focusRequester = remember { FocusRequester() }
    val keyboardController = LocalSoftwareKeyboardController.current

    val onSearchExplicitlyTriggered = {
        keyboardController?.hide()
        onSearchTriggered(searchQuery)
    }

    TextField(
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
        ),
        leadingIcon = {
            Icon(
                imageVector = NiaIcons.Search,
                contentDescription = stringResource(
                    id = searchR.string.search,
                ),
                tint = MaterialTheme.colorScheme.onSurface,
            )
        },
        trailingIcon = {
            if (searchQuery.isNotEmpty()) {
                IconButton(
                    onClick = {
                        onSearchQueryChanged("")
                    },
                ) {
                    Icon(
                        imageVector = NiaIcons.Close,
                        contentDescription = stringResource(
                            id = searchR.string.clear_search_text_content_desc,
                        ),
                        tint = MaterialTheme.colorScheme.onSurface,
                    )
                }
            }
        },
        onValueChange = {
            if (!it.contains("\n")) {
                onSearchQueryChanged(it)
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .focusRequester(focusRequester)
            .onKeyEvent {
                if (it.key == Key.Enter) {
                    onSearchExplicitlyTriggered()
                    true
                } else {
                    false
                }
            }
            .testTag("searchTextField"),
        shape = RoundedCornerShape(32.dp),
        value = searchQuery,
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Search,
        ),
        keyboardActions = KeyboardActions(
            onSearch = {
                onSearchExplicitlyTriggered()
            },
        ),
        maxLines = 1,
        singleLine = true,
    )
    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }
}

@Preview
@Composable
private fun SearchToolbarPreview() {
    NiaTheme {
        SearchToolbar(
            onBackClick = {},
            onSearchQueryChanged = {},
            onSearchTriggered = {},
        )
    }
}

@Preview
@Composable
private fun EmptySearchResultColumnPreview() {
    NiaTheme {
        EmptySearchResultBody(
            onInterestsClick = {},
            searchQuery = "C++",
        )
    }
}

@Preview
@Composable
private fun RecentSearchesBodyPreview() {
    NiaTheme {
        RecentSearchesBody(
            onClearRecentSearches = {},
            onRecentSearchClicked = {},
            recentSearchQueries = immutableListWrapperOf("kotlin", "jetpack compose", "testing"),
        )
    }
}

@Preview
@Composable
private fun SearchNotReadyBodyPreview() {
    NiaTheme {
        SearchNotReadyBody()
    }
}

@DevicePreviews
@Composable
private fun SearchScreenPreview(
    @PreviewParameter(SearchUiStatePreviewParameterProvider::class)
    searchResultUiState: SearchResultUiState,
) {
    NiaTheme {
        SearchScreen(searchResultUiState = searchResultUiState)
    }
}
