/*
 * Copyright 2024 The Android Open Source Project
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

package com.google.samples.apps.nowinandroid.core.network.assets

/**
 * A file to store sample data in the code to avoid fetching resources from the assets
 * Since it is kinda hard to fetch assets in the common module
 * TODO Read the data from the assets
 */

internal val TOPICS_DATA = """
    [
      {
        "id": "1",
        "name": "Headlines",
        "shortDescription": "News you'll definitely be interested in",
        "longDescription": "The latest events and announcements from the world of Android development.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Headlines.svg?alt=media&token=506faab0-617a-4668-9e63-4a2fb996603f",
        "url": ""
      },
      {
        "id": "2",
        "name": "UI",
        "shortDescription": "not including Compose",
        "longDescription": "Stay up to date on Material Design, Navigation, Text, Paging, Compose, Accessibility (a11y), Internationalization (i18n), Localization (l10n), Animations, Large Screens, Widgets and much more!\n\nTo get Compose specific news, make sure you also follow the Compose topic. ",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_UI.svg?alt=media&token=0ee1842b-12e8-435f-87ba-a5bb02c47594",
        "url": ""
      },
      {
        "id": "3",
        "name": "Compose",
        "shortDescription": "",
        "longDescription": "All the latest and greatest news on Jetpack Compose - Android’s modern toolkit for building native user interfaces.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Compose.svg?alt=media&token=9f0228e8-fdf2-45ee-9fd0-7e51fda23b48",
        "url": ""
      },
      {
        "id": "4",
        "name": "Architecture",
        "shortDescription": "",
        "longDescription": "Stay up-to-date with Android architecture best practices including scalability and modularization. ",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Architecture.svg?alt=media&token=e69ed228-fa91-49ae-9017-c8b7331f4269",
        "url": ""
      },
      {
        "id": "5",
        "name": "Android Studio & Tools",
        "shortDescription": "",
        "longDescription": "The latest news on Android development tools, including Android Studio, Gradle, device emulators, debugging tools and more.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Android-Studio.svg?alt=media&token=b28b82dc-5aa1-4098-9eff-deb04636d3ac",
        "url": ""
      },
      {
        "id": "6",
        "name": "Testing",
        "shortDescription": "",
        "longDescription": "The latest news on testing, including unit and UI testing, and continuous integration.  ",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Testing.svg?alt=media&token=a11533c4-7cc8-4b11-91a3-806158ebf428",
        "url": ""
      },
      {
        "id": "7",
        "name": "Performance",
        "shortDescription": "",
        "longDescription": "Up-to-date content on optimizing your app performance, including profiling, tracing and jank avoidance.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Performance.svg?alt=media&token=558fdf02-1918-4527-b13f-323db67e31cc",
        "url": ""
      },
      {
        "id": "8",
        "name": "New APIs & Libraries",
        "shortDescription": "",
        "longDescription": "Stay up-to-date with new APIs & library releases, including Jetpack.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_New-APIs-_-Libraries.svg?alt=media&token=8efd12df-6dd9-4b1b-81fd-017a49a866ac",
        "url": ""
      },
      {
        "id": "9",
        "name": "Data Storage",
        "shortDescription": "",
        "longDescription": "Everything to do with data storage, including Room and DataStore.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Data-Storage.svg?alt=media&token=c9f78039-f371-4ce1-ba82-2c0c1e20d180",
        "url": ""
      },
      {
        "id": "10",
        "name": "Kotlin",
        "shortDescription": "",
        "longDescription": "New language features and guidance for getting the best out of Kotlin on Android. ",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Kotlin.svg?alt=media&token=bdc73380-e80d-47df-8954-d9b61cccacd2",
        "url": ""
      },
      {
        "id": "11",
        "name": "Privacy & Security",
        "shortDescription": "",
        "longDescription": "The latest news on security best practices, APIs and libraries.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Privacy-_-Security.svg?alt=media&token=6232fd17-c1cc-43b3-bf70-a734323fa6df",
        "url": ""
      },
      {
        "id": "12",
        "name": "Publishing & Distribution",
        "shortDescription": "",
        "longDescription": "Everything to do with publishing and distributing your app, including Google Play.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Publishing-_-Distribution.svg?alt=media&token=64a5aeaf-269a-479d-8a44-29f59d337dbf",
        "url": ""
      },
      {
        "id": "13",
        "name": "Platform & Releases",
        "shortDescription": "",
        "longDescription": "Stay up-to-date with the latest Android releases and features.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Platform-_-Releases.svg?alt=media&token=ff6d7a38-5205-4a51-8b6a-721e665dc515",
        "url": ""
      },
      {
        "id": "14",
        "name": "Accessibility",
        "shortDescription": "",
        "longDescription": "The latest news on accessibility features and services, helping you to improve your app's usability, particularly for users with disabilities.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Accessibility.svg?alt=media&token=5b783a03-dd3b-4d0c-9e0c-16ae8350295f",
        "url": ""
      },
      {
        "id": "15",
        "name": "Android Auto",
        "shortDescription": "",
        "longDescription": "The latest news on Android Automotive OS and Android Auto.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Android-Auto.svg?alt=media&token=56453754-14a5-4953-b596-66d63c56c196",
        "url": ""
      },
      {
        "id": "16",
        "name": "Android TV",
        "shortDescription": "",
        "longDescription": "Stay up-to-date on everything to do with building apps for Android TV.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Android-TV.svg?alt=media&token=a78ca0df-f1ba-44a6-a89d-3912c82ef661",
        "url": ""
      },
      {
        "id": "17",
        "name": "Games",
        "shortDescription": "",
        "longDescription": "The latest news on Android game development.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Games.svg?alt=media&token=4effa537-cc42-4d7f-b6bd-f1f14568db07",
        "url": ""
      },
      {
        "id": "18",
        "name": "Camera & Media",
        "shortDescription": "",
        "longDescription": "The latest news on capturing and playing media on Android, including the Camera and Media APIs. ",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Camera-_-Media.svg?alt=media&token=73adea20-20d4-4f4c-8f3b-eb47c1097496",
        "url": ""
      },
      {
        "id": "19",
        "name": "Wear OS",
        "shortDescription": "",
        "longDescription": "The latest news on app development for Wear OS.",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Wear.svg?alt=media&token=bd11fe4c-9c92-4536-8ebc-5210f44d09be",
        "url": ""
      }
    ]
""".trimIndent()

internal val NEWS_DATA = """
    [
      {
        "id": "1",
        "title": "Android Dev Summit ’22: Coming to you, online and around the world! ⛰️",
        "content": "Android Dev Summit is back, so join us online or in person — for the first time since 2019 — at locations around the world. We’ll be sharing the sessions live on YouTube in three tracks spread across three weeks.",
        "url": "https://android-developers.googleblog.com/2022/10/android-dev-summit.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh1VWQmqQu6wDswls9f_5NpEQnq4eR57g2NwzWvhKItcKtV6rb_Cyo75XSyL6vvmCIo4tzQn-8taNagEp7QG0KU1L4yMqwbYozNMzBMEFxEN2XintAhy5nLI4RQDaOXr8dgiIFdGOBMdl577Ndelzc0tDBzjI6mz7e4MF8_Tn09KWguZi6I-bS5NbJn/w1200-h630-p-k-no-nu/unnamed%20%2816%29.png",
        "publishDate": "2022-10-04T23:00:00.000Z",
        "type": "Event 📆",
        "topics": [
          "1"
        ],
        "authors": [
          "64"
        ]
      },
      {
        "id": "2",
        "title": "The new Google Pixel Watch is here  — start building for Wear OS! ⌚",
        "content": "We launched the Google Pixel Watch, powered by Wear OS 3.5, at the Made by Google event — the perfect device to showcase apps built with Compose for Wear OS. With Compose for Wear OS, the Tiles Material library, and the tools in Android Studio Dolphin, it’s now simpler and more efficient than ever to make apps for WearOS.",
        "url": "https://android-developers.googleblog.com/2022/10/the-new-google-pixel-watch-is-here.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhH63icac2kmydOI8Fs2I09KiuRA3GUo2pfZ1Wpf0M5JIEoVQ8dj9LYSl8jpxSQlmlsUVXoeXbwN4UbHMCf5p0M7FHh_EXzMeFRAJ-6feI9-7eIyhBmtGZSD5o-MItwFLH_ESi15Cxd01AlznWaGy9WDqhK0NWtMQwiWELg3xE1I7hba-_7eVqs747V/w1200-h630-p-k-no-nu/WhasNewinPixelDevices_Social.png",
        "publishDate": "2022-10-06T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "1",
          "3",
          "19"
        ],
        "authors": []
      },
      {
        "id": "3",
        "title": "Listen to our major Text to Speech upgrades for 64 bit devices 💬",
        "content": "An upgrade to Speech Services by Google is rolling out to 64-bit Android devices via Google Play over the next few weeks, providing clearer, more natural voices. All 421 voices in 67 languages are being upgraded with a new voice model and synthesizer. The post includes more on this update, including demonstrations of some voice upgrades, along with guidance on how to use text to speech in your projects.",
        "url": "https://android-developers.googleblog.com/2022/09/listen-to-our-major-text-to-speech-upgrades-for-64-bit-devices.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjrHro6d3BTw7ZZ4IXgfb6_8aESB7-SsWfelDSSInZVamiMSnYpBZzGBaZBBrWxWwYgLqOHuOtroGvGjxrwzdUkhjwuIvM1u6chIblGKS1gQ6JVkjXr-Vztyk2zoYb1ylvhNgLgC5q6M-7LaiXT1xnAT96DvkPx89APNb8JEaz-1mnMRcfaOYYBHzQL/w1200-h630-p-k-no-nu/Text%20to%20Speech%20-%20Social%20-%201024x512.png",
        "publishDate": "2022-09-27T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "14"
        ],
        "authors": [
          "66",
          "67"
        ]
      },
      {
        "id": "4",
        "title": "MAD Skills Compose: Powerful Toolkit",
        "content": "Learn about the powerful toolkit of UI components that ship with Compose enabling you to build rich UIs and interactions.",
        "url": "https://medium.com/androiddevelopers/compose-toolkit-8d3651228764",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*3FZeNmAPZDYUCmgL0cBXoA.png",
        "publishDate": "2022-09-29T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": [
          "68"
        ]
      },
      {
        "id": "5",
        "title": "MAD Skills Compose: Accelerate development with tooling",
        "content": "Learn how to accelerate your Compose development process with a dive into Android Studio tooling support, including live templates, gutter icons for drawables and colors, composable preview functions, multipreview, preview on device, live edits of literals, and the Layout Inspector.",
        "url": "https://medium.com/androiddevelopers/compose-tooling-42621bd8719b",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*WVUBQsNgePqQxmrHjaID4g.png",
        "publishDate": "2022-10-06T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": [
          "68"
        ]
      },
      {
        "id": "6",
        "title": "Deep Links Crash Course: Part 3 - Troubleshooting",
        "content": "In part 3 of the Deep Links Crash Course you'll learn how to diagnose and debug common issues with deep links using command line tools and the Android Debug Bridge (ADB).",
        "url": "https://www.youtube.com/watch?v=OAxJ2kWG4ZI",
        "headerImageUrl": "https://i.ytimg.com/vi/OAxJ2kWG4ZI/maxresdefault.jpg",
        "publishDate": "2022-09-29T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2",
          "5"
        ],
        "authors": []
      },
      {
        "id": "7",
        "title": "Deep Links Crash Course: Part 4 - Deep links for your business",
        "content": "Part 4 of the Deep Links Crash Course explores Deep links for your business, covering the importance and benefits of implementing deep links for your app, your users, and your business, including success stories and how App Links provide an optimal experience for users.",
        "url": "https://www.youtube.com/watch?v=UvMIswgsJF8",
        "headerImageUrl": "https://i.ytimg.com/vi/UvMIswgsJF8/maxresdefault.jpg",
        "publishDate": "2022-10-05T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2",
          "5"
        ],
        "authors": []
      },
      {
        "id": "8",
        "title": "Migrating the AOSP QuickSearchBox App to Kotlin",
        "content": "This article includes the methodology used in the migration to Kotlin, how manual changes were addressed, and what the impact to APK size and build speed was.",
        "url": "https://medium.com/androiddevelopers/migrating-the-aosp-quicksearchbox-app-to-kotlin-1264346619ec",
        "headerImageUrl": "https://miro.medium.com/max/720/1*cWnPe-kD4hAVuH3IIcNUcA.png",
        "publishDate": "2022-09-22T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "10"
        ],
        "authors": [
          "69"
        ]
      },
      {
        "id": "9",
        "title": "Prepare your Android Project for Android Gradle plugin 8.0 API changes",
        "content": "How to prepare your Android Project for Android Gradle plugin 8.0 API changes; this article specifically addresses migrating from the Transform APIs — which slow down builds and will be removed in 8.0 — to the Artifacts API and Instrumentation API.",
        "url": "https://android-developers.googleblog.com/2022/10/prepare-your-android-project-for-agp8-changes.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgy74acii7wq-Z2pW8TUSga1YGpRKjLZjroOlZlUillRJuTFIlGpUi93PPletKlkcAaz9u6NgF8_LejO9686VYEWNtO2ypawLgpY2QW7JMtrMSVTlPsRGgEDUiQJKUfzEXw2Q_Y7qX1CSUlH9lma8Jjdm3AqMogbEI6PScD3AK1XsWgHmVeqJlVqUiK/w1200-h630-p-k-no-nu/Header-PrepareyourAndroidProjectforAGP8.0Changes%20.png",
        "publishDate": "2022-10-05T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "5",
          "5"
        ],
        "authors": [
          "70",
          "71",
          "72"
        ]
      },
      {
        "id": "10",
        "title": "Optimize for Android (Go edition) : Lessons from Google apps Part 2",
        "content": "Part two of the Optimize for Android Go : Lessons from Google apps blog series, covering strategies Google apps used to improve startup latency and optimize app size — things that will improve the user experience for any app.",
        "url": "https://android-developers.googleblog.com/2022/09/optimize-for-android-go-lessons-from-google-apps-part-2.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiD7uoBIqlA_WYXwuhyDxKy1Nt2ibaa_GYd9l8ewfQcC7f-f11t0WRCTTS6XhwnkJMqWUxSX-nxAq9DD8oBbk_Om2ik0yNMOV8lHw0sGmRAixLY2T0dxpKtQe0DnsVrzmexNSX1-BYdz9p0cvCtdXoxgDi1Mx6OLixzC5JAnxEEAf1TkHrTQON0fURg/w1200-h630-p-k-no-nu/MAD%20App%20Architecture%20launch%20-%20Mobile%20%281%29%20%281%29.png",
        "publishDate": "2022-09-27T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7"
        ],
        "authors": [
          "73"
        ]
      },
      {
        "id": "11",
        "title": "Helping users discover apps for all their devices from their phone",
        "content": "Changes in Google Play are helping users discover apps for all their devices from their phone, including homepages for non-phone devices, a device search filter, and the ability to remotely install an app to another device.",
        "url": "https://android-developers.googleblog.com/2022/09/helping-users-discover-apps-for-all-their-devices-from-their-phone.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjyGaErzRykqFDWOwEmkHWos7vU7OhdETz5GNEjObA7FOhCudnf5DiQ1hAfpxuq102pwxuBf_ZCeifURihNeAwNnLj46pkdoBdbl_JYn8A9plqwaqS8D_0XML6B7Bupt0GhPZuABbfTXB_nkWsVVW6faVQXqpetHIV6QlNQyl1WD6zuojFf-U7wDSHO/w1200-h630-p-k-no-nu/image3.gif",
        "publishDate": "2022-09-26T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "12"
        ],
        "authors": [
          "74"
        ]
      },
      {
        "id": "12",
        "title": "Deep Links Crash Course : Part 3 Troubleshooting Your Deep Links",
        "content": "The Deep Links Crash Course continues with Summers writing an article on troubleshooting deep links. He goes over common issues that can occur with deep links and how to solve them.",
        "url": "https://medium.com/androiddevelopers/deep-links-crash-course-part-3-troubleshooting-your-deep-links-61329fecb93",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*IsRqP0Fe9I6YLxrJybIG6Q.png",
        "publishDate": "2022-09-15T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "6"
        ],
        "authors": [
          "79"
        ]
      },
      {
        "id": "13",
        "title": "Jetpack Compose Composition Tracing",
        "content": "Ben covered Compose Composition Tracing, a new feature that allows showing Jetpack Compose composable functions in the Android Studio Flamingo system trace profiler. This feature gives you the low intrusiveness from system tracing, with method tracing levels of detail in composition. This is great for checking your Compose app’s performance and working out why your app may not be performing as you expect. Learn more about this feature in the post!",
        "url": "https://medium.com/androiddevelopers/jetpack-compose-composition-tracing-9ec2b3aea535",
        "headerImageUrl": "https://miro.medium.com/max/700/1*jPVPY4GjPRK3prnJ2o09cQ.png",
        "publishDate": "2022-09-19T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3",
          "7"
        ],
        "authors": [
          "80"
        ]
      },
      {
        "id": "14",
        "title": "Android Studio: Dolphin is available",
        "content": "Android Studio Dolphin is here! In this post, Takeshi goes over the three key themes: Jetpack Compose, Wear OS, and development productivity. Exciting features include the Compose Animation Inspector, the Wear OS Emulator Pairing Assistant, and Gradle managed virtual devices. Learn about all the new features in the blog post or the video!",
        "url": "https://www.youtube.com/watch?v=EQ_btxhpRzU&t=1s",
        "headerImageUrl": "https://i.ytimg.com/vi/EQ_btxhpRzU/maxresdefault.jpg",
        "publishDate": "2022-09-14T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "5",
          "5"
        ],
        "authors": [
          "81"
        ]
      },
      {
        "id": "15",
        "title": "Mad Skills: Compose",
        "content": "Chris started a brand new MAD Skills series on Compose. This series is a great place to start to learn how to think and start building apps with Compose.",
        "url": "https://www.youtube.com/watch?v=4UXJTeb9Khg&t=1s",
        "headerImageUrl": "https://i.ytimg.com/vi/4UXJTeb9Khg/maxresdefault.jpg",
        "publishDate": "2022-09-12T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "3"
        ],
        "authors": [
          "68"
        ]
      },
      {
        "id": "16",
        "title": "Introducing Compose Camp",
        "content": "We launched Compose Camp, a series of in-person and virtual sessions where you can learn how to build Android apps with Jetpack Compose alongside your peers. Compose Camp has two tracks: the beginner track caters to complete Android beginners including people that have no coding experience, and the experienced track is for Android developers who want to learn how to migrate to Compose and stop using XML.",
        "url": "https://android-developers.googleblog.com/2022/09/learn-jetpack-compose-at-compose-camp-near-you.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjn6__UOZ_lipXjY09TrHeXW4HjKodPUdFzmovYRn1tLwdYr8GVKjCN6wfgKpcby5rrJ6JFrUmZozT7aeDkp8x7v46QdH6wtz9ysQFTZAQPwswFfGWQkWcPmKHbeELq_BUUhazt4ppYm9ErYEo7HbFzPCfBid4IQ9qL-hydSgRpJx7w2lNZKh5ylNcb/w1200-h630-p-k-no-nu/Compose%20Camp%203.png",
        "publishDate": "2022-09-12T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "1",
          "3"
        ],
        "authors": [
          "78"
        ]
      },
      {
        "id": "17",
        "title": "Privacy Sandbox developer preview 5 🔐",
        "content": "The Privacy Sandbox aims to develop new technologies that improve user privacy and enable effective, personalized advertising experiences for mobile apps. Developer Preview 5 was released, this version is a major milestone that will become the foundation for upcoming Privacy Sandbox Beta releases. Please keep giving us your feedback! See what’s changed in the blog post.",
        "url": "https://android-developers.googleblog.com/2022/09/privacy-sandbox-developer-preview-5-is-here.html",
        "headerImageUrl": "https://services.google.com/fb/forms/privacysandbox/fb/forms/getlogo/5679849861677056/",
        "publishDate": "2022-09-06T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "11"
        ],
        "authors": [
          "77"
        ]
      },
      {
        "id": "18",
        "title": "Guide to app modularization 🧩",
        "content": "The team just released new guidance on modularization. Guidance on this topic has been one of the top community requests and here it is! The guide is split into two parts. The overview page gives you a high level, theoretical overview of the matter and its benefits. The common modularization patterns page dives deep into practical examples in the context of modern Android architecture. Take a look at the guide announcement blog post to learn more about this.",
        "url": "https://android-developers.googleblog.com/2022/09/announcing-new-guide-to-android-app-modularization.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj0ZsQN4PZ_SQ975Hfbc-LDFXMTgOr6RVf42kSUBqNxfv9OcDvc6dTYRZPynsYx0JIlXT7k5TMz_Kjq7bJstYb4dUy2ZX6ilugMH20JudIZISLWEsa19f8sN0hDxA7JWXgS570gDxkXNp3ioHxxH42tvquQ0wUK-qPS6Qv2OeGK06HhumP2vvC0V07V/s1600/Android-AppModularization_4209x1253.png",
        "publishDate": "2022-09-05T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "4"
        ],
        "authors": [
          "82"
        ]
      },
      {
        "id": "19",
        "title": "Build an offline-first app",
        "content": "If you need to make your app work offline, we got you covered. The new Build an offline-first app guide helps you design your app to properly handle reads and writes, and deal with synchronization and conflict resolution in a device with no Internet connectivity.",
        "url": "https://developer.android.com/topic/architecture/data-layer/offline-first",
        "headerImageUrl": "https://developer.android.com/static/images/topic/architecture/data-layer/data-layer.png",
        "publishDate": "2022-09-13T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "4"
        ],
        "authors": []
      },
      {
        "id": "20",
        "title": "State holders and UI state page ",
        "content": "Another new guide is the State holders and UI state page in the UI layer docs. Not everything needs to be present in ViewModel classes. This page goes through the different types of state holders you can find in the UI layer and what their responsibilities are.",
        "url": "https://developer.android.com/topic/architecture/ui-layer/stateholders",
        "headerImageUrl": "https://developer.android.com/static/images/topic/architecture/ui-layer/udf.png",
        "publishDate": "2022-09-13T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "4",
          "3"
        ],
        "authors": []
      },
      {
        "id": "21",
        "title": "Architecture pathway",
        "content": "If you want to learn all about Architecture and be up-to-date with our current best practices, check out the Architecture pathway, that got updated with all the videos of the Architecture MAD Skills series we produced early this year and the new docs.",
        "url": "https://developer.android.com/courses/pathways/android-architecture",
        "headerImageUrl": "https://developer.android.com/static/topic/libraries/architecture/images/mad-arch-overview.png",
        "publishDate": "2022-09-13T23:00:00.000Z",
        "type": "Codelab",
        "topics": [
          "4"
        ],
        "authors": []
      },
      {
        "id": "22",
        "title": "Mad Skills: Performance ⚡️",
        "content": "Ben wrote this blog post that contains a summary of all the videos on MAD Skills: Performance! Don't miss it out!",
        "url": "https://medium.com/androiddevelopers/mad-skills-performance-wrap-up-33688abfc51f",
        "headerImageUrl": "https://miro.medium.com/max/720/0*qdkZp112bKTGtQIN",
        "publishDate": "2022-09-13T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7"
        ],
        "authors": [
          "36"
        ]
      },
      {
        "id": "23",
        "title": "AndroidX releases 🚀",
        "content": "Since the previous episode, there are some AndroidX releases worth highlighting.Core and core-ktx made it to 1.9.0 stable. This version improves compatibility with Android 13 adding parity between the accessibility framework and compat APIs, and some other additions. Other releases include new in beta Car app 1.3, and new in alpha Navigation 2.6 and Test Ui Automator 2.3.",
        "url": "https://developer.android.com/jetpack/androidx/versions/all-channel",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-09-13T23:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "8"
        ],
        "authors": []
      },
      {
        "id": "24",
        "title": "Precise Improvements: How TikTok Enhanced its Video Social Experience on Android",
        "content": "The Developer Relations team wrote about how TikTok Enhanced its Video Social Experience on Android. They were able to significantly improve their overall performance by following Android’s performance guidance, and employing their deep understanding of development tools such as Android Gradle Plugin and Jetpack libraries. Read more here!",
        "url": "https://android-developers.googleblog.com/2022/08/precise-improvements-how-tiktok-enhanced-its-social-experience-on-android.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhvwJsvRHyECCaiD1FaBBCLGrUr-PoZoDaqm9aUKoswBFPOlWyKNvcC94FhX6M6Ugdo0wVTdZyI48BUmKaiA1xSgOcEE_xOFt9EGmoHd9PDHyJ4mAiKrfjnFHBIEKgjL1JhFeTQWbjWec4DJX-q9lnYAw5b9l0vC7nM09QBKtItv7JmBNxjYosCroQI/s1600/241588700__38488906__148018.png",
        "publishDate": "2022-09-13T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7"
        ],
        "authors": []
      },
      {
        "id": "25",
        "title": "The deep links crash course, Part 1: Introduction to deep links",
        "content": "Sabs started a crash course series about deep links. The first part is an introduction to deep links with a blog post and a video. Get to know what a deep link is, go from URIs to app links, and more!",
        "url": "https://medium.com/androiddevelopers/the-deep-links-crash-course-part-1-introduction-to-deep-links-2189e509e269",
        "headerImageUrl": "https://miro.medium.com/max/720/1*m44rS8zc3W23lmDy1_Vu8g.png",
        "publishDate": "2022-09-01T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7"
        ],
        "authors": [
          "83"
        ]
      },
      {
        "id": "26",
        "title": "Experimenting with Jetpack Glance",
        "content": "Marcel wrote about experimenting with Jetpack Glance that covers a standalone experimental repository to supplement Jetpack Glance with tools that are commonly required for development but not yet available. At the moment, it includes a composable to display RemoteViews inside your app (enabling Live Edit), a debug tool to view and interact with AppWidget snapshots embedded inside the app, and a Material3 Scaffold for AppWidgets.",
        "url": "https://medium.com/androiddevelopers/experimenting-with-jetpack-glance-35fbffe520f4",
        "headerImageUrl": "https://miro.medium.com/max/720/0*gfm9zG95iVoEX5Gu",
        "publishDate": "2022-08-31T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3",
          "2"
        ],
        "authors": [
          "9"
        ]
      },
      {
        "id": "27",
        "title": "Jetpack Compose: Debugging Recomposition",
        "content": "Ben Trengove wrote about Debugging recomposition in Compose. Check it out because it also contains a screencast of Ben fixing a performance issue in Jetsnack, a Compose sample. For this, Ben also uses the layout inspector in Android Studio where you can see the recomposition and skip counts of composable functions.",
        "url": "https://medium.com/androiddevelopers/jetpack-compose-debugging-recomposition-bfcf4a6f8d37",
        "headerImageUrl": "https://miro.medium.com/max/720/1*gwdtRcu1bo_PoH8rwh5E4A.png",
        "publishDate": "2022-09-06T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7",
          "3",
          "5",
          "5"
        ],
        "authors": [
          "80"
        ]
      },
      {
        "id": "28",
        "title": "Optimize for Android (Go edition): Lessons from Google apps - Part 1",
        "content": "Nikariha started another blog post series about optimizing for Android Go edition. The first part introduces Android Go edition, why you’d want to build for it, and some best practices based on experience building the Gboard and Camera from Google apps.",
        "url": "https://android-developers.googleblog.com/2022/09/optimize-for-android-go-lessons-from-google-apps-part-1.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjT34hXV07gVlKKi5X9mjpDGRlawITJfAKr7BpE7E02gtIYVqxYW8RoyjX_SPWJo0KS4PcBNy9rqITsAx0UnXeZp0V6zEoldaBCy9FJ9wyyebLEpPoxJgT6BENWxJqpIrihbpcwUsXO45qhcDAJJ3zTldnKkT8Dw_5VGxl2xYTA2trIVGsczYZLJgKj/s1600/MAD%20App%20Architecture%20launch%20-%20header%20%282%29.png",
        "publishDate": "2022-09-07T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7"
        ],
        "authors": [
          "73"
        ]
      },
      {
        "id": "29",
        "title": "ADB Podcast Episodes🎙: Episode 188 - Android 13",
        "content": "In Episode 188: Android 13, Chet, Romain, and Tor talk about some of their favorite new features and changes of the new version of Android, both for users and developers.",
        "url": "https://adbackstage.libsyn.com/episode-188-android-13",
        "headerImageUrl": "https://ssl-static.libsyn.com/p/assets/4/6/e/5/46e518b4880184c288c4a68c3ddbc4f2/ADB_188_Android_13.jpg",
        "publishDate": "2022-08-31T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "13"
        ],
        "authors": [
          "31"
        ]
      },
      {
        "id": "30",
        "title": "Cross device SDK Developer Preview 📱↔️📱",
        "content": "We launched the Cross device SDK for Android developer preview, which allows you to build rich multi-device experiences, abstracting away the intricacies involved with working with device discovery, authentication, and connection protocols.",
        "url": "https://android-developers.googleblog.com/2022/07/announcing-cross-device-SDK-Developer-Preview-for-Android.html",
        "headerImageUrl": "https://miro.medium.com/max/1280/0*1CDepdsU40_03H5K.png",
        "publishDate": "2022-08-25T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "8",
          "6"
        ],
        "authors": [
          "84"
        ]
      },
      {
        "id": "31",
        "title": "CameraX 1.2 is now in Beta",
        "content": "CameraX version 1.2 is now in Beta. It introduces a zero shutter lag capture mode along with MlKitAnalyzer, an implementation of ImageAnalysis.Analyzer that handles much of the ML Kit setup for you. MlKitAnalyzer works with both cameraController and cameraProvider workflows and can even handle coordinate transformations between ML Kit output and your PreviewView. Zero shutter lag greatly reduces image capture lag on supported devices by using a circular buffer of captures to get the frame closest to the actual press of the shutter button.",
        "url": "https://android-developers.googleblog.com/2022/08/camerax-12-is-now-in-beta.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiS_SSchtaoz90hvgXHZQzwD61bSnd06zOvd7L2sLG-isR8ykrzy7Afk1snnZjCBVkNtMXrmCJIMJfp-gP3X3NMXSbPdVvEgmpqSfTIph-vc_QkBVPDgH8ZQonnMu-XY5Aasi4tp1nmI5jetU2eF4TK_AMOWqA0gLxadk-0dPt2wjpruoDOhxP4PhE_/w681-h202/Android_NewCameraXInBeta_4209x1253.png",
        "publishDate": "2022-08-23T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "18"
        ],
        "authors": [
          "85"
        ]
      },
      {
        "id": "32",
        "title": "Build Tiles fast with the WearOS Material Tiles Library ⌚",
        "content": "Tiles are one of the most used surfaces on Wear OS, providing users glanceable access to the information and actions they need to get things done quickly. We launched the Tiles Material library allowing you to use pre-built Material components such as Button, Chip, CompactChip, TitleChip, CircularProgressIndicator, and Text along with layouts such as PrimaryLayout, EdgeContentLayout, MultiButtonLayout, and MultiSlotLayout to create tiles that embrace the latest Material design for Wear OS. Together with the Tiles Design Kit, they help you to easily follow the Tiles Design Guidelines.",
        "url": "https://android-developers.googleblog.com/2022/08/wear-os-tiles-material-library-build-tiles-fast.html",
        "headerImageUrl": "https://miro.medium.com/max/1278/0*tgTI6u6xZZFHhvSc.png",
        "publishDate": "2022-08-23T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "19",
          "2"
        ],
        "authors": [
          "16",
          "86"
        ]
      },
      {
        "id": "33",
        "title": "New deep links monitor in Play Console 🔗",
        "content": "Deep links allow you to get your users directly to in-app content by accepting traffic from external sources, including the web. Since answering basic questions like “is this URL deep-linked?” or “why is this deep link not working?” can be difficult to answer, many apps have partial, broken, or no deep links configured. To make it easier for you to keep your deep links in good shape, we’ve introduced a new, dedicated Play Console page that gives you a quick but comprehensive snapshot of your current setup along with tooling to help you identify and troubleshoot issues at a glance.",
        "url": "https://android-developers.googleblog.com/2022/08/monitor-your-deep-links-in-one-place.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj42yJ079EEgbm1oAfoXwCKB_LxBw_0iEPsixWd572w6BThCaA5P-O6Ahp7P6SCcCgLZ59rKPtQFkfbpGeVn-f7dk2ef81nSMMqHz3IEw1FL9fAfhiFGgPJZNu5wny2AoWWZ0Ma1PAqGkSGS60eGB59abQHdQ_Hb-_9VdEnS7yg4JLmUIUuW3dNxg0l/w640-h190/Android-DeepLinksWithGooglePlayConsole_4209x1253%20.png",
        "publishDate": "2022-08-21T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "12",
          "2",
          "5"
        ],
        "authors": [
          "87",
          "88"
        ]
      },
      {
        "id": "34",
        "title": "Celebrating 5 years of Kotlin on Android 🎉",
        "content": "Five years ago Android announced official support for the interoperable, mature, production-ready, and open source Kotlin programming language. Since then, JetBrains and Google have been collaborating around the development of Kotlin, and the Kotlin Foundation was co-founded by the two companies; JetBrains developing both the language and tooling has given Kotlin outstanding IDE support. We put together some posts and videos to celebrate the journey and elaborate the milestones of Kotlin on Android with many of the people that helped to make it happen.",
        "url": "https://android-developers.googleblog.com/2022/08/celebrating-5-years-of-kotlin-on-android.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjRKysS-6n5YNTJAtLz2PkRNV5XsFnSlod6hwTvKRHbUb0W5pE8RszvmTfFK6GNbh2TKa3dbTP1AjB4pI0NB3agCRb1F4MbP5LQb6Q-8oveLb-mDjqFteWaZnIaztK4W1yONSJ5M6ffWAt-qu9CAu04v0PBIg6OIm9kFHMX6kolmf3zkagX2MIDDOtn/w640-h192/Kotlin%20Header.png",
        "publishDate": "2022-08-16T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "10"
        ],
        "authors": [
          "1"
        ]
      },
      {
        "id": "35",
        "title": "Mad Skills: Performance 🏎️💨",
        "content": "The MAD Skills series on Performance continued with a blog post from \nBen and a video from Tomáš that covers how to use the Macrobenchmark library along with UIAutomator to help generate Baseline Profiles for you. Baseline Profiles help your app to start and run faster by optimizing critical code paths ahead of time, allowing for a smoother user experience.",
        "url": "https://medium.com/androiddevelopers/improving-performance-with-baseline-profiles-fdd0db0d8cc6",
        "headerImageUrl": "https://miro.medium.com/max/1400/0*Tztd-PrhMpbWTXGC",
        "publishDate": "2022-08-22T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7"
        ],
        "authors": [
          "36"
        ]
      },
      {
        "id": "36",
        "title": "AndroidX releases 🚀",
        "content": "In AndroidX, the Wear Compose Version 1.0.1 release fixed a logic bug in ScalingLazyColumn. As mentioned before, we released Wear Tiles Version 1.1. Webkit Version 1.5 added setAlgorithmicDarkeningAllowed, and added support for setting an allow-list of URLs for the configured proxy.",
        "url": "https://developer.android.com/jetpack/androidx/versions",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-10-25T23:00:00.000Z",
        "type": "DAC - Android version features",
        "topics": [
          "8",
          "19"
        ],
        "authors": []
      },
      {
        "id": "37",
        "title": "A story of App Excellence, featuring Tik Tok",
        "content": "Over in video, we covered how TikTok used Android tools to improve app startup and make the user experience more seamless, and how it impacted app usage and Play Store ratings.",
        "url": "https://youtu.be/k9Pdgiugleg",
        "headerImageUrl": "https://i.ytimg.com/vi/k9Pdgiugleg/maxresdefault.jpg",
        "publishDate": "2022-08-31T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "5",
          "7",
          "2"
        ],
        "authors": [
          "61"
        ]
      },
      {
        "id": "38",
        "title": "Design high-quality apps for kids",
        "content": "We introduced the Google Play Academy course around designing kids’ apps, ensuring that they’re fun, usable, and appropriate for their target age group. The course covers the framework for rating kids apps on Google Play that teachers across the US use, so you can understand what they’re looking for to help your app stand out.",
        "url": "https://youtu.be/-FUmVUPThX8",
        "headerImageUrl": "https://i.ytimg.com/vi/-FUmVUPThX8/hqdefault.jpg",
        "publishDate": "2022-08-31T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "12",
          "2"
        ],
        "authors": [
          "61"
        ]
      },
      {
        "id": "39",
        "title": "MAD about Media",
        "content": "Avish, our summer Android DevRel Engineer intern, discussed modern approaches to creating Android media apps leveraging experience in converting the Universal Android Media Player (UAMP) media playback sample app to Compose, updating it to use modern libraries such as Media3.",
        "url": "https://medium.com/androiddevelopers/mad-about-media-f536f7d601c",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*BKAchEMpYdP3dEyaIAP5xA.png",
        "publishDate": "2022-08-25T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "18"
        ],
        "authors": [
          "61"
        ]
      },
      {
        "id": "40",
        "title": "Top Tips for Adopting Android’s Notification Permission",
        "content": "Terence covered tips to improve your app’s user experience with notifications before targeting Android 13, as well as how to test your app’s integration with the permission without flashing different OS versions onto your device.",
        "url": "https://medium.com/androiddevelopers/top-tips-for-adopting-androids-notification-permission-bf69afd677b8",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*XQmi35H84FdYhY_ONP6ntQ.png",
        "publishDate": "2022-08-23T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "13",
          "6"
        ],
        "authors": [
          "89"
        ]
      },
      {
        "id": "41",
        "title": "Jetpack Compose Accompanist — An FAQ.",
        "content": "Ben wrote a FAQ on the Jetpack Compose Accompanist, a labs-like environment for new Compose APIs. Accompanist is used to help fill known gaps in the Compose toolkit, experiment with new APIs and to gather insight into the development experience of building a Compose library. The goal of Accompanist is to eventually upstream libraries into the official toolkit. (at which point they will be deprecated and removed from Accompanist) Current libraries in Accompanist include support for Flow Layouts, Pager, Navigation Transitions, and Swipe Refresh.",
        "url": "https://medium.com/androiddevelopers/jetpack-compose-accompanist-an-faq-b55117b02712",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*w_MA7M6H9HpwdWb_fx-2IA.png",
        "publishDate": "2022-08-18T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": [
          "80"
        ]
      },
      {
        "id": "42",
        "title": "Introducing the MAD Skills series on Performance",
        "content": "It’s time for another series of MAD Skills on Performance! Performance spans every aspect of Android development, and as part of Modern Android Development we’re aiming to make it more approachable and user-friendly. We have also found direct correlations between improved app performance, user satisfaction and business metrics.",
        "url": "https://medium.com/androiddevelopers/introducing-the-mad-skills-series-on-performance-7dbb26e8b17f",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgkWBi6t47sZvF2EqduUT_a38uamN_jLbjDIoada1oN9PSbkyyduU1f_x6t4H8gX1ghq11Wyt09dBjw-l3efO5EO62AvdrVELnk4qc6Xft96Fk_ViJ8xipsPXirDnvVoYw44tl-gJqUHqOXxrdbPbZjjGwXGmoLL992o_5AMdkpnWyoL0oz8HrAJagH/w1200-h630-p-k-no-nu/unnamed_%281%29.png.jpeg",
        "publishDate": "2022-08-09T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7",
          "5"
        ],
        "authors": [
          "36"
        ]
      },
      {
        "id": "43",
        "title": "MAD Skills: Important Performance Metrics",
        "content": "Before you begin to work with performance effectively, we recommend you make yourself familiar with key performance metrics. By understanding what metrics you should look at, you will make inspecting, improving and monitoring performance easier.",
        "url": "https://medium.com/androiddevelopers/important-performance-metrics-c7dacf018eb3",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjYdlNQTXP5pTpqN3fQwfF__WHtEmflMVuLS6ErWorUPYM9MwThUmwuBfFhDMVtw5X1jVmchC9z20Bl_yD7M_thVbCmhRJLyZqh3sHZBm6Sryz_xyu4cvusk_xx1kJCh5ANM-TtsvG1WwqMUPllTZegJlstUj3KDesGJ2Xrh6AsLU9HvaFCLT4RLZd7/w1200-h630-p-k-no-nu/resize%20play_10-android_dev.png",
        "publishDate": "2022-08-10T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7"
        ],
        "authors": [
          "36"
        ]
      },
      {
        "id": "44",
        "title": "MAD Skills: Inspecting Performance\n",
        "content": "This MAD Skills article on inspecting performance introduces you to tools and methods that help when your code’s performance. When you inspect performance you make sure that what’s happening in your app aligns with what you expect to happen.",
        "url": "https://medium.com/androiddevelopers/inspecting-performance-95b76477a3d7",
        "headerImageUrl": "https://1.bp.blogspot.com/-9MiK78CFMLM/YQFurOq9AII/AAAAAAAAQ1A/lKj5GiDnO_MkPLb72XqgnvD5uxOsHO-eACLcBGAsYHQ/w1200-h630-p-k-no-nu/Android-Compose-1.0-header-v2.png",
        "publishDate": "2022-08-14T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7",
          "5"
        ],
        "authors": [
          "36"
        ]
      },
      {
        "id": "45",
        "title": "Consuming flows safely in Jetpack Compose",
        "content": "Collecting flows in a lifecycle-aware manner is the recommended way to collect flows on Android. If you’re building an Android app with Jetpack Compose, use the collectAsStateWithLifecycle API to collect flows in a lifecycle-aware manner from your UI.",
        "url": "https://medium.com/androiddevelopers/consuming-flows-safely-in-jetpack-compose-cde014d0d5a3",
        "headerImageUrl": "https://miro.medium.com/max/720/1*LL7FLWzjT4c6bQdGlvdz7w.png",
        "publishDate": "2022-08-09T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3",
          "8",
          "4"
        ],
        "authors": [
          "23"
        ]
      },
      {
        "id": "46",
        "title": "Brushing up on Compose Text coloring",
        "content": "Alejandra Stamato’s last article covered compose brush text coloring, and this week she taught us how to take it a step further and add animation to brush text coloring. She covers using the animation APIs in conjunction with the Brush APIs, demonstrating these with a candy cane shimmer effect and a back-and-forth shimmer effect.",
        "url": "https://medium.com/androiddevelopers/brushing-up-on-compose-text-coloring-84d7d70dd8fa",
        "headerImageUrl": "https://miro.medium.com/max/720/1*PZK1BRIYM22iLQhexPGT1Q.png",
        "publishDate": "2022-07-24T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": [
          "91"
        ]
      },
      {
        "id": "47",
        "title": "Final Android 13 Beta update, official release is next!",
        "content": "We’re just a few weeks away from the official release of Android 13! Meanwhile, we published the last Beta for your testing and development. We reached Platform Stability at Beta 3, so all app-facing surfaces are final, including SDK and NDK APIs, app-facing system behaviors, and restrictions on non-SDK interfaces. With these and the latest fixes and optimizations, Beta 4 gives you everything you need to complete your testing.",
        "url": "https://android-developers.googleblog.com/2022/07/Final-Android-13-Beta-update-official-release-is-next.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiKBGMJx7yKi1RuRF9Q1X-1GOgfCvJ7XVIhNZlsmYgeabTPyljHhEOr2F0iGkF2BM7jeE1HYnL75GXllESyWgpEZEQWm9xfKU5a8kDgrvS5-ZZN0eTq0QaTsCBOAFkJzGX9kBTZxfo_4p6O3DYkXVqsBMRynTq1Mw3EDq3hwEL5OcoCrSQ8rOvFrraK/w1200-h630-p-k-no-nu/Compose%20Blog%20social.jpg",
        "publishDate": "2022-07-12T23:00:00.000Z",
        "type": "DAC - Android version features",
        "topics": [
          "13"
        ],
        "authors": [
          "62"
        ]
      },
      {
        "id": "48",
        "title": "10 years of Google Play",
        "content": "In 2012, the team opened the (digital) doors of Google Play. A decade later, more than 2.5 billion people in over 190 countries use Google Play every month to discover apps, games and digital content. And more than 2 million developers work with us to build their businesses and reach people around the globe! Congratulations to the Google Play team for this huge milestone.",
        "url": "https://android-developers.googleblog.com/2022/03/celebrating-10-years-of-google-play.html",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-07-24T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "12"
        ],
        "authors": [
          "63"
        ]
      },
      {
        "id": "49",
        "title": "Android Basics with Compose Unit 3 available",
        "content": "The Unit 3 of Android Basics with Compose course is available already! Unit 3 covers how to build apps that display a list of data and how to make your apps more beautiful with Material Design.",
        "url": "https://developer.android.com/courses/android-basics-compose/course",
        "headerImageUrl": "https://www.gstatic.com/devrel-devsite/prod/vab7ee6e3641f10848d404faa598f256587df1a361a1e70cd114230c2961b73d9/android/images/lockup.svg",
        "publishDate": "2022-08-02T23:00:00.000Z",
        "type": "Codelab",
        "topics": [
          "2",
          "3",
          "10"
        ],
        "authors": []
      },
      {
        "id": "50",
        "title": "Jetpack Compose 1.2 is now stable",
        "content": "This release contains new features like downloadable fonts, lazy grids, and improvements for tablets and Chrome OS with better focus, mouse, and input handling.",
        "url": "https://android-developers.googleblog.com/2022/07/jetpack-compose-1-2-is-now-stable.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj1vg5QdkR-Hj7oQ3yueza1VGYFrNOBbuAxRQycRYGO6HLR-Hf2LR9DHT__OxVFecRYFZbVq6cYg6ca15h7kkKO99zzheFMB_x6MdTO74DaJpTR933pmrkJ-pWVq_7fEmN38nYHQv2u1l7-Ukk8RtNPrtGnn-ChdYwcbbx8Q-MnbJ3z3BjSj3U0Q-YX/w1200-h630-p-k-no-nu/header-image-predictive-back-blog%20%281%29.png",
        "publishDate": "2022-07-26T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": [
          "65"
        ]
      },
      {
        "id": "51",
        "title": "Compose for Wear OS is now 1.0",
        "content": "Compose for Wear OS makes building apps for Wear OS easier, faster, and more intuitive by following the declarative approach and offering powerful Kotlin syntax. Moving forward, Compose for Wear OS is our recommended approach for building user interfaces for Wear OS apps.",
        "url": "https://android-developers.googleblog.com/2022/07/compose-for-wear-os-10-stable.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjsdruRjulgaFFtqwrnp6Z0mzIAhmMzJZIOUjVqugCB3i5noivoLOVecpMNBQGVIsG_kjkzthRTpibL-CEmlsn5nZJUhnSkkdhEe0V2yaNPQt2l-FGh0sQz1JnOZVRHRDZIr72twcPZQL7Q0kdgb-JzxgKJlZSsESJkMLuAkvqCfyXoE7d-XxFQYVoJ/w1200-h630-p-k-no-nu/Google_Android_DeveloperPoweredCTS_4209x1253.jpg",
        "publishDate": "2022-07-26T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3",
          "19"
        ],
        "authors": [
          "75"
        ]
      },
      {
        "id": "52",
        "title": "AndroidX releases 🚀",
        "content": "Jetpack Compose 1.2, Compose for Wear OS 1.0, Core splashscreen v1.0, and Profile Installer v1.2 went stable. In RC, you can find AppCompat v1.5, Compose Compiler v1.3 (that brings support to Kotlin version 1.7.10), Emoji2 v1.2, and ShareTarget v1.2. Lastly, Wear Tiles v1.1 reached its first beta version!",
        "url": "https://developer.android.com/jetpack/androidx/versions/all-channel",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEirdkVqgyYoZDm0ktFFXjyIATaFKJUCVU0lIzQpTw4dlJjvqruWxLJn5mJ5xHoZijqVQ-poghVIGWGCpZM0Nb_bzx274kr1Lo_nn0PvEzMXcU_DgNEFrKzw5HtuE_vA9zfRVy8RDuiAIgC_aDVhHmGdqSLhzsPK5Pj2m3QNB4lzsf4E0VkbctqiowND/w1200-h630-p-k-no-nu/Android-discountinuing-kotlin-synthetics-for-views-social%20%281%29.png",
        "publishDate": "2022-08-02T23:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "8"
        ],
        "authors": []
      },
      {
        "id": "53",
        "title": "Make your app large screen ready",
        "content": "Learn how to get started with large screen support and why it is so important. Accurately handling orientation changes, aspect ratios, and adaptive layouts may seem challenging, but with new large screen experiences in mind, multiple form factors bring new possibilities to your users.",
        "url": "https://medium.com/androiddevelopers/make-your-app-large-screen-ready-baf8fe505ae7",
        "headerImageUrl": "https://miro.medium.com/max/1200/0*1hkxEoydoX8GzK9N",
        "publishDate": "2022-07-19T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2"
        ],
        "authors": [
          "90"
        ]
      },
      {
        "id": "54",
        "title": "Get familiar with Wear OS 3 (without a physical device)",
        "content": "You don’t need a physical device to test your Wear apps. Read this article to take a brief look at unique UI surfaces on Wear OS, create a Wear emulator and explore it from a user perspective.",
        "url": "https://medium.com/androiddevelopers/get-familiar-with-wear-os-3-without-a-physical-device-e7962c97f02b",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*3M48bGiXnBX8y83eYLgFtw.png",
        "publishDate": "2022-07-20T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "19",
          "2"
        ],
        "authors": [
          "86"
        ]
      },
      {
        "id": "55",
        "title": "Jetpack Compose Interop: Using Compose in a RecyclerView",
        "content": "What versions of Compose and RecyclerView do you need to use to get the best performance? In addition, you’ll understand how the interop works under the hood.",
        "url": "https://medium.com/androiddevelopers/jetpack-compose-interop-using-compose-in-a-recyclerview-569c7ec7a583",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*aBNjsK7y35V05OKNQ2oIZg.png",
        "publishDate": "2022-07-21T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3",
          "2"
        ],
        "authors": [
          "68"
        ]
      },
      {
        "id": "56",
        "title": "Brushing up on Compose Text coloring",
        "content": "A very colorful blog post about how to work with Brush API together with TextStyle to achieve complex text coloring like giving a gradient to your text in a simple way.",
        "url": "https://medium.com/androiddevelopers/brushing-up-on-compose-text-coloring-84d7d70dd8fa",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*PZK1BRIYM22iLQhexPGT1Q.png",
        "publishDate": "2022-07-24T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3",
          "2"
        ],
        "authors": [
          "91"
        ]
      },
      {
        "id": "57",
        "title": "Animating brush Text coloring in Compose 🖌️",
        "content": "Learn how to animate gradients in your text using the Brush API and Compose animations. Go check them out, I can’t stop looking at those animations now!",
        "url": "https://medium.com/androiddevelopers/animating-brush-text-coloring-in-compose-%EF%B8%8F-26ae99d9b402",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*9fEDrtJES1CQEVlyI7WjgQ.png",
        "publishDate": "2022-07-31T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3",
          "2"
        ],
        "authors": [
          "91"
        ]
      },
      {
        "id": "58",
        "title": "Prepare your app to support predictive back gestures",
        "content": "Predictive back gestures is a feature that will be available in future versions of Android. However, to give you more time to adopt it, we made it available in the developer options of Android 13 Beta 4. Read the blog post for details on how to try out the new gesture and support it in your apps. Spoiler alert: it’s straightforward for most apps!",
        "url": "https://android-developers.googleblog.com/2022/07/prepare-your-app-to-support-predictive-back-gestures.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi9NXOkaUCvb2KLyrnCp4DWpr2dyryXzHsqvX94Dcrw3r_5znwMZFy6PwmaHJj25D0DKYcZlF8Jac5C0KhM1s2j_mEc0VULf-eiCpT3JGbYgI_jg105SyUEwNG7w2dvF-60npxBgZidqgXqx7A1iWRftv9lOZrM9OAfc4f105met0ZauGQ5hRQC0_wE/w1200-h630-p-k-no-nu/image3.jpg",
        "publishDate": "2022-07-28T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "13"
        ],
        "authors": [
          "92",
          "93",
          "94"
        ]
      },
      {
        "id": "59",
        "title": "ADB Podcast Episodes🎙187: System UI: A Retrospective",
        "content": "In this episode Tor and Chet meet Dan Sandler and Adam Cohen from the SystemUI team. They dip into a bit of history, talking about where things were at when they joined the team, and how things have developed in the many years since. They also talk about how to expose (or not) gestures and features in a UI system.",
        "url": "https://adbackstage.libsyn.com/episode-187-system-ui-a-retrospective",
        "headerImageUrl": "https://ssl-static.libsyn.com/p/assets/9/4/d/b/94dbe077f2f14ee640be95ea3302a6a1/ADB184_Skia_and_AGSL.png",
        "publishDate": "2022-07-24T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "2"
        ],
        "authors": [
          "32",
          "31"
        ]
      },
      {
        "id": "60",
        "title": "Developer-Powered CTS (CTS-D) 🧪",
        "content": "The Compatibility Test Suite (CTS) is a key part of the Android Compatibility Program that helps to ensure that devices provide a stable, consistent environment for your apps. To enhance CTS, we are adding a new test suite called CTS-D that is built and run by developers like you. You can build and contribute test cases to CTS-D to help catch pain points that you are seeing in the field — places where device behavior doesn’t match the Android public APIs and the Android Compatibility Definition Document (CDD).",
        "url": "https://android-developers.googleblog.com/2022/06/developer-powered-cts-cts-d.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjsdruRjulgaFFtqwrnp6Z0mzIAhmMzJZIOUjVqugCB3i5noivoLOVecpMNBQGVIsG_kjkzthRTpibL-CEmlsn5nZJUhnSkkdhEe0V2yaNPQt2l-FGh0sQz1JnOZVRHRDZIr72twcPZQL7Q0kdgb-JzxgKJlZSsESJkMLuAkvqCfyXoE7d-XxFQYVoJ/w1200-h630-p-k-no-nu/Google_Android_DeveloperPoweredCTS_4209x1253.jpg",
        "publishDate": "2022-06-22T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "6",
          "13"
        ],
        "authors": [
          "98"
        ]
      },
      {
        "id": "61",
        "title": "Independent versioning of Jetpack Compose libraries ✒️",
        "content": "We announced that the various Jetpack Compose libraries will move to independent versioning schemes, making it easier to incrementally upgrade your application and stay up-to-date with the latest Compose features.",
        "url": "https://android-developers.googleblog.com/2022/06/independent-versioning-of-Jetpack-Compose-libraries.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjolHnYXFnb81t2qu38Z8BPxU0QNitCVulwRwgZlijGDwCbcSSPETvSVr9apTSV_eDknzPDs1BwccZU_lYr15czYU_ddiXete76bVxWWIhNE29-PfOCxMzvashjOwvGWrzZ4rynym-k4aNQ4c-tmN7v4O5vh0iaRpFZTMuYTFqjFLrNpHNlOwSyZyf6/w1200-h630-p-k-no-nu/unnamed_%281%29.png.jpeg",
        "publishDate": "2022-06-28T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": [
          "65"
        ]
      },
      {
        "id": "62",
        "title": "Notes from Google Play: making Play work for everyone ▶️",
        "content": "In the latest edition of Notes from Google Play, we touched on the Play Integrity API, the Data Safety section, the Privacy Sandbox on Android, and the newly-launched Google Play SDK Index, which provides data and insights about over 100 of the most widely used commercial SDKs. We covered new subscription capabilities that allow you to create multiple base plans and offers for each subscription, as well as the option to lower prices starting at the equivalent of 5 US cents to adapt to local purchasing power.",
        "url": "https://android-developers.googleblog.com/2022/06/notes-from-google-play-making-play-work.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEicboZEaxs6kOlhHSoRE__yCFdTkFvVW7z9ksAfVlkdCVgNQzkG1B1z4RVCV6l3g-Up3ZPGchGjq5idAKV5prrVVy9T2o6MtJh-iXZtUKcKyNY1Cqt39bi5VzwZ2CLy7N3FANcklla-mHIGboZzvNRl3eN5ZMvjl29tjtGGLGubVKIYwIUCh6q2-FhT/w1200-h630-p-k-no-nu/AD%20Blog%20Social.png",
        "publishDate": "2022-06-21T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "12"
        ],
        "authors": []
      },
      {
        "id": "63",
        "title": "Dark theme testing in Pre-Launch Report 🕶️",
        "content": "After you upload and publish a test Android App Bundle to Google Play, we install it on a set of Android devices, launch and crawl your app for several minutes, and compile your results into the pre-launch report. We’ve introduced a new test in the Pre-Launch Report that runs accessibility checks on a device switched to dark theme; this can detect color contrast issues that make it difficult to differentiate text and icons from a background. ",
        "url": "https://support.google.com/googleplay/thread/170731936/dark-theme-test-now-included-in-pre-launch-report",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgJtTKEaaohJa7b5H5mkmCNu1LbQ3FPrPv0hSVWdEacemvtEHRWhk-DCi5aEartYwL0OMg6NOHJ1Vnn1fqeJ5cMc7Bl08SY7JcEBpKp5Vde-y_VDIPoVNlhb5VZbyv4PlauW_xpvnf6iS8yszMOnuo5w0Rw5NmYZ45reEvulY2KgGoPaG9NZ6H8hO2b/w1200-h630-p-k-no-nu/Android_SandboxPreview_V2_1024x512.jpg",
        "publishDate": "2022-07-10T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "12",
          "6"
        ],
        "authors": []
      },
      {
        "id": "64",
        "title": "Performance tips to achieve App Excellence",
        "content": "The Performance tips to achieve App Excellence video covered five app performance issues along with the tools that Android Studio and Google Play Console provide to help you diagnose and troubleshoot them.",
        "url": "https://www.youtube.com/watch?v=VJItLXb7_V8",
        "headerImageUrl": "https://i.ytimg.com/vi/VJItLXb7_V8/maxresdefault.jpg",
        "publishDate": "2022-07-05T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "7",
          "2"
        ],
        "authors": []
      },
      {
        "id": "65",
        "title": "Making Sense of Intent Filters in Android 13",
        "content": "Before Android 13, when an app registered an exported component in its manifest and added an <intent-filter>, the component could be started by any explicit intent — even those that do not match the intent filter. In some circumstances this can allow other apps to trigger internal-only functionality.\n\nThis behavior has been updated in Android 13. Now intents that specify actions and originate from external apps are delivered to an exported component if and only if the intent matches its declared <intent-filter> elements.",
        "url": "https://medium.com/androiddevelopers/making-sense-of-intent-filters-in-android-13-8f6656903dde",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*PX8VuYcLzaC-AvOtSPgMRw.png",
        "publishDate": "2022-07-05T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "13",
          "2"
        ],
        "authors": [
          "99"
        ]
      },
      {
        "id": "66",
        "title": "Customizing AnimatedContent in Jetpack Compose 🌟",
        "content": "Rebecca covers using AnimatedContent to transition between different composables with a smoother and more custom transition effect. Even the default behavior of AnimatedContent can make a big difference to the look and feel of your app, without much effort.",
        "url": "https://medium.com/androiddevelopers/customizing-animatedcontent-in-jetpack-compose-629c67b45894",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*Yu-W3qMxx1YyPm_AJMcXGg.png",
        "publishDate": "2022-06-30T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": [
          "96"
        ]
      },
      {
        "id": "67",
        "title": "Jetpack Compose Stability Explained",
        "content": "Ben does a detailed exploration of how Compose determines the stability of each parameter of your composables to see what can be skipped during recomposition, including using compiler reports to determine what stability is being inferred about your classes. ",
        "url": "https://medium.com/androiddevelopers/jetpack-compose-stability-explained-79c10db270c8",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*iLEtRB3BpIkD6CgjWFP2RQ.png",
        "publishDate": "2022-06-29T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": [
          "80"
        ]
      },
      {
        "id": "68",
        "title": "Migrating to the new coroutines 1.6 test APIs",
        "content": "kotlinx.coroutines 1.6 introduces a set of new testing APIs, and the previous testing APIs are now deprecated.\n \nMarton talked about how we’ve migrated some of our own samples to the new APIs, covering a bunch of the necessary work for most Android projects.",
        "url": "https://medium.com/androiddevelopers/migrating-to-the-new-coroutines-1-6-test-apis-b99f7fc47774",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*XQmi35H84FdYhY_ONP6ntQ.png",
        "publishDate": "2022-06-28T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "10",
          "6"
        ],
        "authors": [
          "1"
        ]
      },
      {
        "id": "69",
        "title": "Android 13 beta 3",
        "content": "We released the third beta of Android 13! Android 13 has been built on our core themes of privacy and security, developer productivity, and large screen support. ​​Beta 3 takes Android 13 to Platform Stability, which means that the developer APIs and all app-facing behaviors are now final; you can confidently develop and release your updates. Read all about it in the post!\n",
        "url": "https://android-developers.googleblog.com/2022/06/android-13-beta-3-platform-stability.html",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-06-07T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "1",
          "13"
        ],
        "authors": [
          "14"
        ]
      },
      {
        "id": "70",
        "title": "Google Play @ Google I/O - 3 updates you need to know",
        "content": "In this video and blog post, Phalene tells us about the top three things to know about Google Play from Google I/O. These include updates on custom store listings, introducing more developers to the LiveOps beta, and new subscription capabilities. Learn more about these three topics in the video or blog post!\n",
        "url": "https://android-developers.googleblog.com/2022/06/google-play-google-io-3-updates-you-need-to-know_01537187872.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg40pvJlLB9LP1shkyFOq4pIexSrdI-kSH9uPxMEdhjynUPm2Zdfy4W1sHb6v0d5hZqycnWP9qTVjxHu0DADwL2BrtBwkPrOOIFXA8-H2RC6W70ehcnYUTgKXy8eRvwvWDeu2J-0iVmMgkd4c1lyYUBnZi39mPVTJV5Ke83DvWMBioeLOWPivE0Tpvv/w1200-h630-p-k-no-nu/Android-io-spotlight-modern-android-development-social.png",
        "publishDate": "2022-06-12T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "1",
          "12"
        ],
        "authors": [
          "76"
        ]
      },
      {
        "id": "71",
        "title": "Privacy Sandbox Developer Preview 3",
        "content": "The Privacy Sandbox on Android aims to develop new solutions that preserve user privacy while enabling effective, personalized advertising experiences for apps. Now it is in Developer Preview 3, which adds APIs and resources for conversion measurement and remarketing use cases; this allows you to begin testing and evaluating impact on all key APIs for Privacy Sandbox on Android.",
        "url": "https://android-developers.googleblog.com/2022/06/privacy-sandbox-developer-preview-3.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjg5R2hd0VZp__xKUUgs6-tfKHEoabMPqo2aY6uoGvzre-9E4gUlz6RbGsrE-Txszbrc3OaNL9r2TshsZmzGhEiM3M-_eO8M39K6ljm9NrX2BMHRLHM3HeF04YgJf8l4Z1-kNaP9YV8BCRe3n2zTUTSx3FOvA5IRc4PCjVPiJ7CEw7M7Y7uAJLVd7WQ/w1200-h630-p-k-no-nu/Android-GoogleIO3thingstoknowaboutFormFactors_4209x1253.png",
        "publishDate": "2022-06-15T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "11"
        ],
        "authors": [
          "77"
        ]
      },
      {
        "id": "72",
        "title": "ADB Podcast Episodes🎙186: Live Edit",
        "content": "In this episode, we talk with Alan and Esteban from Android Studio about the new \"Live Edit\" feature recently launched at Google I/O in the Electric Eel canary build. We dive into the technology -- how it works, what the technical challenges are, and its current state.",
        "url": "https://adbackstage.libsyn.com/episode-186-live-edit",
        "headerImageUrl": "http://assets.libsyn.com/show/332855?height=250&width=250&overlay=true",
        "publishDate": "2022-06-07T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "5",
          "5"
        ],
        "authors": [
          "31",
          "30",
          "32"
        ]
      },
      {
        "id": "73",
        "title": "AndroidX releases",
        "content": "Let’s take a look at what’s been up with AndroidX releases since the last episode of Now in Android. We have a few new features that are stable including Wear Watchface, Games-Activity, Benchmark, and Annotation",
        "url": "https://developer.android.com/jetpack/androidx/versions/all-channel",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEizEliXuy2sTNnhRQtwNAvL46sKpcBLbHiuROrEiOtPDTJ1D0eQlWDDUjspVECqlDw3_sLhFzJO8SCrGJuFaT2QQ7Iezi0xrkhD7yWqpbacVLRC8aX-1bx0aZ-RM1k_S-S0LFTE0PrvX-BlNsmmilGCGMdvRk0v6zhHs8nKwdFv-AluPQIRjAtFx938/w1200-h630-p-k-no-nu/Android-GoogleIOSpotlightPrivacyAndSecurity_1024x512.png",
        "publishDate": "2022-06-22T23:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "8"
        ],
        "authors": []
      },
      {
        "id": "74",
        "title": "Google I/O recaps ⏱ - Modern Android Development!\n",
        "content": "Our goal is to make developing beautiful and engaging Android apps as fast and easy as possible. We want to take on the complex parts of building apps so that you can focus on your app’s features and deliver high quality experiences to your users.\n\nWe call this approach Modern Android Development (or MAD for short!) and deliver it through a suite of tools, libraries and guidance. At Google I/O we announced a number of updates and additions to our MAD offerings; here’s a recap of the three largest announcements.",
        "url": "https://android-developers.googleblog.com/2022/05/io22-spotlights-mad.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgpSQB-YhRGzOJ4X1hoh1DlnMx9cOxfUKdoriSncXDPuaXZXpiXGYBXpxJUsMVKPhGTbTKkT-Gn3g52Tqcy7Alyv6gkMQEKd7twzAj1JbR2DwdFUZYbIcnMgXD2PeRrkTq9jZw8XId5t0D9im6i3XkVCK-YIk10g3E7ut_pLnVdA9tVnGJU5T7XFLi8/w1200-h630-p-k-no-nu/unnamed.png",
        "publishDate": "2022-05-22T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3",
          "5"
        ],
        "authors": [
          "57"
        ]
      },
      {
        "id": "75",
        "title": "Google I/O recaps ⏱ - Form factors!",
        "content": "With close to half a billion cars, TVs, watches and laptops running on Android, it is more important than ever for apps to work seamlessly across every device. This year at I/O, we renewed our focus on form factors and announced major updates for Wear OS and Large Screens. To help you get to the bottom of what’s new, here are the three things you need to know about Form Factors at Google I/O",
        "url": "https://android-developers.googleblog.com/2022/05/form-factors-google-io-22.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj7lx3OtPkMXTr0cwNlItkSUwDQYcTAO1cP-fE8n_NLtnZQ5uBnoP-y0MfENfmuB_2HGRUbmrx_ADz4FmDW8VkBmp_WcdISO0uQiO4Dw2yi9XjBUPqwjX2o24j8lUEhvYWJidFi6ra9WrjHxO1sTCjwBZrLyXHhIjgbRZzFQX-oUOKeqvf1dXg4XQ-A/w1200-h630-p-k-no-nu/Android_ImplementingColor_1024x512.jpg",
        "publishDate": "2022-05-30T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "19",
          "2",
          "16",
          "15"
        ],
        "authors": []
      },
      {
        "id": "76",
        "title": "Google I/O recaps ⏱ - Android Privacy, Platform & Security!",
        "content": "Amidst the whirlwind of content at Google I/O, we shared huge announcements involving privacy, security, and the Android platform. Read on for the details, and don’t forget to watch the topic playlist on YouTube.",
        "url": "https://android-developers.googleblog.com/2022/06/privacy-security-google-io-22.html",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-06-05T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "11",
          "13"
        ],
        "authors": [
          "95"
        ]
      },
      {
        "id": "77",
        "title": "Spot your UI jank using CPU profiler in Android Studio",
        "content": "Takeshi wrote about spotting your UI jank using the CPU profiler in Android Studio. The article goes through a step by step walkthrough about how to use the new jank detection UI in Android Studio Chipmunk including how to record a trace, and how to inspect janky frames.",
        "url": "https://medium.com/androiddevelopers/spot-your-ui-jank-using-cpu-profiler-in-android-studio-9a4c41a54dab",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*FkkN0FugRiSDxhfp1TQz-Q.png",
        "publishDate": "2022-05-15T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "5"
        ],
        "authors": [
          "81"
        ]
      },
      {
        "id": "78",
        "title": "Custom Canvas Animations in Jetpack Compose ✨",
        "content": "Rebecca Franks wrote about custom Canvas animations in Jetpack Compose. Using the Animatable states and some side-effects, you’ll be able to achieve custom animations as you were able to do with ValueAnimator in the View system.",
        "url": "https://medium.com/androiddevelopers/custom-canvas-animations-in-jetpack-compose-e7767e349339",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*16bn5V--jLMAJLCWspst2Q.png",
        "publishDate": "2022-05-16T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": [
          "96"
        ]
      },
      {
        "id": "79",
        "title": "Implementing Dynamic Color: Lessons from the Chrome team",
        "content": "If you’re interested in Material You dynamic color, Rebecca Gutteridge talks about how the Chrome team implemented it and the things they kept in mind such as accessibility, custom colors, incognito, and more. It also comes with a really helpful list of recommendations from the designers and developers of the team.",
        "url": "https://android-developers.googleblog.com/2022/05/implementing-dynamic-color-lessons-from.html",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-05-26T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2",
          "3"
        ],
        "authors": [
          "97"
        ]
      },
      {
        "id": "80",
        "title": "ViewModel: One-off event antipatterns",
        "content": "We’re very opinionated about what to do with ViewModel events in our UI events Architecture guidance, and this blog post explains why the alternatives to our recommendation might bring higher engineering costs to developers and a worse user experience.",
        "url": "https://medium.com/androiddevelopers/viewmodel-one-off-event-antipatterns-16a1da869b95",
        "headerImageUrl": "https://miro.medium.com/max/1200/0*ROW1i16idpH-rHO-.png",
        "publishDate": "2022-05-31T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2"
        ],
        "authors": [
          "23"
        ]
      },
      {
        "id": "81",
        "title": "Diving Into Compose — Lessons Learned While Building Maps Compose",
        "content": "If you’re interested in Compose and Google Maps, Chris Arriola wrote about the lessons learned while building Maps Compose. You’ll see how they took advantage of Kotlin features, how to aim for binary compatibility, subcomposition, and more!",
        "url": "https://medium.com/androiddevelopers/diving-into-compose-lessons-learned-while-building-maps-compose-d20ef5dfe1bb",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*6rFVWLu8FXGXfmASVP3zYQ.jpeg",
        "publishDate": "2022-06-02T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": [
          "68"
        ]
      },
      {
        "id": "82",
        "title": "I/O 22: What's New in Android",
        "content": "For a survey of what I/O 22 offers to Android developers in video form check out the What’s New in Android talk.",
        "url": "https://youtu.be/Z6iFhczA3NY",
        "headerImageUrl": "https://i.ytimg.com/vi/Z6iFhczA3NY/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "1"
        ],
        "authors": []
      },
      {
        "id": "83",
        "title": "I/O 22: What's New for Android Devs",
        "content": "Move quickly through some of the top material for Android Devs at IO/22",
        "url": "https://www.youtube.com/watch?v=l0iBPh7k_HQ",
        "headerImageUrl": "https://i.ytimg.com/vi/l0iBPh7k_HQ/hqdefault.jpg?sqp=-oaymwEmCOADEOgC8quKqQMa8AEB-AH-CYAC0AWKAgwIABABGGUgUShhMA8=&rs=AOn4CLCNz_S_i8TyDdvX_y1-SZGyAfoK3A",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "1",
          "5",
          "3",
          "8"
        ],
        "authors": []
      },
      {
        "id": "84",
        "title": "I/O 22: Android Fireside Chat",
        "content": "Android Fireside Chat is back! Android leaders answered your questions from the stage.",
        "url": "https://www.youtube.com/watch?v=wq3Et-D9P5Y",
        "headerImageUrl": "https://i.ytimg.com/vi/wq3Et-D9P5Y/maxresdefault.jpg",
        "publishDate": "2022-05-17T23:00:00.000Z",
        "type": "",
        "topics": [
          "1"
        ],
        "authors": []
      },
      {
        "id": "85",
        "title": "13 Things to know for Android developers at Google I/O!",
        "content": "There aren’t many platforms where you can build something and instantly reach billions of people around the world, not only on their phones—but their TVs, cars, tablets, watches, and more. Today, at Google I/O, we covered a number of ways Android helps you make the most of this opportunity, and how Modern Android Development brings as much commonality as possible, to make it faster and easier for you to create experiences that tailor to all the different screens we use in our daily lives.",
        "url": "https://android-developers.googleblog.com/2022/05/13-things-to-know-for-android-developers-at-google-io.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiC2X0sIY_AGvgi6jD8Eh_u8rOdZXKA6PP18tnJdA6jQxR-n4bF6vsIVI2D4FTOnHAlqSY5hJShEjHcRQr7P8QM-YyP3sM3Su_KxFRdBXhg8WUIoXr74luWfFvtgYGJHWdDe_gPnwpCsLR4YhE0U88QcSqrYs3LLjp7dGqQul_pRoerJr__-mD8lUPA/w1200-h630-p-k-no-nu/Android-IO22AndroidDevRecap_Social.png",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "1",
          "3",
          "2",
          "5",
          "19"
        ],
        "authors": [
          "62"
        ]
      },
      {
        "id": "86",
        "title": "I/O 22: Now in Android, the App ⏱️",
        "content": "After being available on this blog, our YouTube series, and a podcast, starting today, you can check out the alpha version of the Now in Android app on GitHub that was featured in the Google I/O 2022 Developer Keynote 🎉\n\nThe app showcases best practices, opinionated designs, and solutions to complex real-world problems. ",
        "url": "https://android-developers.googleblog.com/2022/05/now-in-android-sample-app-alpha.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgCfJQnd9fqg_J5d_j4lWDbJQ-u-sHd_Z_z8srVPoEuO3_CWY3eVZBulaRTPxqQV3VNkA_1qqkleLVYBI7tRtSIZsOsIDzOKKstOLehI8a1RAUwFgHpXY-3kEmoEPujjQZU1VUk08DesedqDdiA1ZOxUxR-XJIMb66G3gruUq3cxqHwokSQSWycIRPl/w1200-h630-p-k-no-nu/Now-in-Android%28Splash%29.jpg",
        "publishDate": "2022-05-11T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3",
          "2"
        ],
        "authors": [
          "42"
        ]
      },
      {
        "id": "87",
        "title": "I/O 22: Jetpack, Compose, and Tooling 🚀",
        "content": "What’s new in Jetpack covered additions and updates to the over 120 libraries we’ve created to address common pain points and make development easier.",
        "url": "https://android-developers.googleblog.com/2022/05/whats-new-in-jetpack-compose.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiQyCrAWdIb8-moiYuP7EdpznRLOLaKoZWJ04MLzMi1wkJrMfLKQshwXhB_ODNz3T6_aoOwQ0YccVpSbLO2K9qkpx-HTklvNm3ZR_spOINLr861_PgDXDnh6LgpptIyzR5Nv-UjlQ-5FyeLpHwOCb4NjZ8darLIomTVjHM2VvDv7YZdzO-FS6zMKEhlCQ/w1200-h630-p-k-no-nu/Android-JetpackCompose1.2-Social.png",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3",
          "8"
        ],
        "authors": [
          "65",
          "52"
        ]
      },
      {
        "id": "88",
        "title": "I/O 22: Lazy layouts in Compose",
        "content": "Compose brings a simple and performant way of creating scrolling lists, with fewer lines of code than RecyclerView. Learn how lazy layouts enable adding content on demand, how to use Lazy composables, how these work under the hood, and optimization tips for better performance.",
        "url": "https://youtu.be/1ANt65eoNhQ",
        "headerImageUrl": "https://i.ytimg.com/vi/1ANt65eoNhQ/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "3",
          "5"
        ],
        "authors": []
      },
      {
        "id": "89",
        "title": "I/O 22: Fragments: The good (non-deprecated) parts",
        "content": "Fragments have been in constant motion over the past couple of years as we move towards a world where all the behavior is defined. Some of these moves have resulted in new APIs designed to do a specific function and replace old, unreliable ones. Learn about the changes in menus, fragment communication, the new strict mode, single lifecycle, and more.",
        "url": "https://www.youtube.com/watch?v=OE-tDh3d1F4",
        "headerImageUrl": "https://i.ytimg.com/vi/OE-tDh3d1F4/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "3",
          "5"
        ],
        "authors": []
      },
      {
        "id": "90",
        "title": "I/O 22: Performance best practices for Jetpack Compose",
        "content": "Jetpack Compose can feel like magic, but what do you do when the magic isn't as performant as you want? Discover best practices in Jetpack Compose with regards to performance, common mistakes, and how to avoid them.",
        "url": "https://www.youtube.com/watch?v=EOQB8PTLkpY",
        "headerImageUrl": "https://i.ytimg.com/vi/EOQB8PTLkpY/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "3",
          "7"
        ],
        "authors": []
      },
      {
        "id": "91",
        "title": "I/O 22: Workshop: Basic layouts in Compose",
        "content": "Learn how to implement a realistic and complex UI using Compose Layouts.",
        "url": "https://www.youtube.com/watch?v=kyH01Lg4G1E",
        "headerImageUrl": "https://i.ytimg.com/vi/kyH01Lg4G1E/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "3",
          "2"
        ],
        "authors": []
      },
      {
        "id": "92",
        "title": "I/O 22: Workshop: State in Jetpack Compose",
        "content": "Discover the core concepts of using state in Jetpack Compose by building a wellness app. Learn how the app's state determines what is displayed in the UI, how Compose keeps the UI updated when state changes, how to optimize the structure of your composable functions, and work with ViewModels in a Compose app.",
        "url": "https://www.youtube.com/watch?v=PMMY23F0CFg",
        "headerImageUrl": "https://i.ytimg.com/vi/PMMY23F0CFg/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "3",
          "2"
        ],
        "authors": []
      },
      {
        "id": "93",
        "title": "I/O 22: Airbnb uses Jetpack Compose to empower devs to do their best work",
        "content": "Jetpack Compose, Android’s modern UI-building toolkit, directly supports both of Airbnb’s development principles. Compose provided a solid foundation for adaptable, quality engineering and reduced boilerplate code, so developers could focus on delivering a great user experience — and advance their two-fold pursuit of engineering excellence.",
        "url": "https://android-developers.googleblog.com/2022/05/airbnb-uses-jetpack-compose.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj1-9FyHvhui7rTgRvUNvyQE8Mmrx5vQ1ZHnuYs0DMdkwFeBK7DuGIP2VL1sgxiQgBtrGvKF4j0QcKInGgSWXCx4bszhPM4VwmuUHm1VIBjmkJqBSWPYk4D9fPmDVhK3asVTNqmkxRjTidzZpzaUzQYn0JmQzjwblhp3el20qowfr00yTpPdKyhefcT/w1200-h630-p-k-no-nu/image1.gif",
        "publishDate": "2022-05-11T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": []
      },
      {
        "id": "94",
        "title": "I/O 22: What’s new in Android development tools ",
        "content": "Get an overview of what's new in Android Studio for Android app developers, including demos and a presentation of relevant features that can accelerate developers' workflow on the latest Android APIs.",
        "url": "https://www.youtube.com/watch?v=RFv8GkLd5OY",
        "headerImageUrl": "https://i.ytimg.com/vi/RFv8GkLd5OY/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "5",
          "2"
        ],
        "authors": []
      },
      {
        "id": "95",
        "title": "I/O 22: Designing apps for large screens",
        "content": "Explore key concepts and strategies for adapting mobile apps to large screen devices, such as tablets and foldables. Dig into the challenges of optimizing design and finding ways to meet the changing expectations of your users, in order to offer the highest quality large screen app experience.",
        "url": "https://www.youtube.com/watch?v=pvdqeIM6mh0&t",
        "headerImageUrl": "https://i.ytimg.com/vi/pvdqeIM6mh0/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "96",
        "title": "I/O 22: Learn how to update your app for the larger screen",
        "content": "You already have an app you’ve been working on for years, with a set, and hard to change, architecture. Discover the many options to bring your existing app forward, and build optimized large screen experiences without starting from scratch.",
        "url": "https://www.youtube.com/watch?v=1ZOQ_-XPSv8",
        "headerImageUrl": "https://i.ytimg.com/vi/1ZOQ_-XPSv8/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "97",
        "title": "I/O 22: Implementing Android apps for all screen sizes ",
        "content": "Get a better understanding of how to build your app to fill all screen formats. Explore development best practices to optimize applications for all devices with an emphasis on Jetpack Compose, navigation, managing state, and testing.",
        "url": "https://www.youtube.com/watch?v=MPwf5DklKp0&t",
        "headerImageUrl": "https://i.ytimg.com/vi/MPwf5DklKp0/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "98",
        "title": "I/O 22: Input for all screens",
        "content": "Learn about some straight-forward best practices to support input methods like keyboard, mouse, and stylus. These simple changes can elevate your app experience and grow user engagement.",
        "url": "https://www.youtube.com/watch?v=XtImpP23uhE",
        "headerImageUrl": "https://i.ytimg.com/vi/XtImpP23uhE/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "99",
        "title": "I/O 22: Building an adaptive layout with SlidingPaneLayout",
        "content": "Learn how to add a list and detail layout to a View-based app with SlidingPaneLayout. Explore how to reconfigure your fragments, open and close the detail pane, handle custom back navigation, and disable gesture navigation.",
        "url": "https://www.youtube.com/watch?v=2rtLdF9UFqg",
        "headerImageUrl": "https://i.ytimg.com/vi/2rtLdF9UFqg/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "100",
        "title": "I/O 22: Android Developer Story: eBay gets a 4.7 Google Play rating",
        "content": "Matthew Mossman, Android engineer for eBay, shares how he and his team optimized the eBay app for large screens and discusses the impact they saw in their customer’s engagement and experience on the tablets.",
        "url": "https://www.youtube.com/watch?v=8gGXwOxHQjk",
        "headerImageUrl": "https://i.ytimg.com/vi/8gGXwOxHQjk/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "101",
        "title": "I/O 22: Tablet moments, built by you!",
        "content": "Android developers around the world are building some amazing experiences for tablets and large screen devices. You can see how Facebook, TikTok, HBO Max, Zoom and Google Slides are all enhancing their applications.",
        "url": "https://www.youtube.com/watch?v=IRiEcVfJJko",
        "headerImageUrl": "https://i.ytimg.com/vi/IRiEcVfJJko/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "102",
        "title": "I/O 22: Second Beta of Android 13",
        "content": "The Android 13 Beta is available to test on a range of devices from Asus, Lenovo, Nokia, OnePlus, Oppo, Realme, Sharp, TECNO, Vivo, Xiaomi, and ZTE.",
        "url": "https://android-developers.googleblog.com/2022/05/second-beta-of-android-13.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjjV9RykVMNPi7wNhkdMXSTn14sT_GE3-0m7iHPi6zfEIMlLjUr9I8icC7vKh7u0bTKqpU6PKnMKGufNHfE7QJJjvwU6PcTygM0Umd0sEh3C1lYKkAxyeJfOCJblem10kjPCZWlwpUT6E-ITy1F3AglIvqQAoA6mxcHCUAmjNzXfNXw2lCOLUQvjTHj/w1200-h630-p-k-no-nu/Android13_dpp.png",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "DAC - Android version features",
        "topics": [
          "13"
        ],
        "authors": [
          "14"
        ]
      },
      {
        "id": "103",
        "title": "I/O 22: Developing privacy user-centric apps",
        "content": "Keeping users in control of their privacy and safeguarding everything they do online is more important than ever, particularly when it comes to the mobile operating system.",
        "url": "https://www.youtube.com/watch?v=opGkUl8C-HM&t",
        "headerImageUrl": "https://i.ytimg.com/vi/opGkUl8C-HM/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "13",
          "11"
        ],
        "authors": []
      },
      {
        "id": "104",
        "title": "I/O 22: Building the Privacy Sandbox",
        "content": "The Privacy Sandbox initiative is an industry-wide effort to make Android and the web private. It introduces a set of privacy-preserving APIs that give both developers and entrepreneurs the tools they need to build thriving digital businesses and protect people's privacy online. Hear from a panel of Privacy Sandbox team members to hear answers to popular questions.",
        "url": "https://www.youtube.com/watch?v=NKz5oT6kXI4&t",
        "headerImageUrl": "https://i.ytimg.com/vi/NKz5oT6kXI4/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "13",
          "11"
        ],
        "authors": []
      },
      {
        "id": "105",
        "title": "I/O 22: Overview of the Privacy Sandbox on Android",
        "content": "The Privacy Sandbox on Android is intended to fundamentally advance privacy for the ecosystem, without sacrificing key ads functionality and without putting access to free ad-supported apps at risk. Listen to an overview of the key changes and technical considerations for developers.",
        "url": "https://www.youtube.com/watch?v=pQdzFbmlvOo",
        "headerImageUrl": "https://i.ytimg.com/vi/pQdzFbmlvOo/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "13",
          "11"
        ],
        "authors": []
      },
      {
        "id": "106",
        "title": "I/O 22: Best practices for running background work on Android",
        "content": "Learn about several changes to how and when apps can run tasks in the background. Discover why the changes were made and some best practices for developers to run work in the background.",
        "url": "https://www.youtube.com/watch?v=t1_8WSEguDY",
        "headerImageUrl": "https://i.ytimg.com/vi/t1_8WSEguDY/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "13",
          "7"
        ],
        "authors": []
      },
      {
        "id": "107",
        "title": "I/O 22: What’s new in Android machine learning",
        "content": "Learn about the latest APIs and early access programs for machine learning (ML) on Android.",
        "url": "https://www.youtube.com/watch?v=tG6hiQNMLmE",
        "headerImageUrl": "https://i.ytimg.com/vi/tG6hiQNMLmE/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "13"
        ],
        "authors": []
      },
      {
        "id": "108",
        "title": "I/O 22: What’s new in Android Camera",
        "content": "A camera is one of the top reasons consumers purchase phones and devices. Explore the latest in Android Camera and upcoming launches. Learn best practices when using Android Camera and how to bring delightful experiences to users.",
        "url": "https://www.youtube.com/watch?v=n8mubjwEVxQ",
        "headerImageUrl": "https://i.ytimg.com/vi/n8mubjwEVxQ/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "18"
        ],
        "authors": []
      },
      {
        "id": "109",
        "title": "I/O 22: What’s new in Android media",
        "content": "Get a high level overview of everything that's new in Android media, including media features and changes in Android 12+, as well as new features in ExoPlayer and the Jetpack media libraries. Hear about key announcements in Spatial audio, HDR video, video transcoding, editing APIs, AV1 decode, and Performance Class 13.",
        "url": "https://www.youtube.com/watch?v=Ba70zmFZgk0",
        "headerImageUrl": "https://i.ytimg.com/vi/Ba70zmFZgk0/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "18"
        ],
        "authors": []
      },
      {
        "id": "110",
        "title": "I/O 22: Workshop: How to optimize media streaming with ExoPlayer\n",
        "content": "This workshop guides you through using the new Jetpack Media3 APIs to build a simple media app using ExoPlayer for progressive and adaptive streaming playback. Learn about the advantages of using ExoPlayer and the features it offers.",
        "url": "https://www.youtube.com/watch?v=Hw0Jeq42FNU",
        "headerImageUrl": "https://i.ytimg.com/vi/Hw0Jeq42FNU/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "18"
        ],
        "authors": []
      },
      {
        "id": "111",
        "title": "I/O 22: What’s new in Accessibility for developers\n",
        "content": "Making applications accessible ensures equal access to roughly one billion people in the world with disabilities, and it can also benefit people without disabilities by providing a better user experience in general. Learn about new developments in Android Studio, a new API that improves the video consuming experience, and advancements in Jetpack Compose that can help you build more accessible apps.",
        "url": "https://www.youtube.com/watch?v=6LsaP6oKxMY",
        "headerImageUrl": "https://i.ytimg.com/vi/6LsaP6oKxMY/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "14"
        ],
        "authors": []
      },
      {
        "id": "112",
        "title": "I/O 22: What's new in app performance",
        "content": "Users expect apps to launch quickly and scroll smoothly, even on low-end devices. That's why performance enhancements should be available on devices with older versions of Android. Learn how to write, maintain, and monitor apps that perform to users' high standards.",
        "url": "https://www.youtube.com/watch?v=DYdHLqLVspY",
        "headerImageUrl": "https://i.ytimg.com/vi/DYdHLqLVspY/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "7"
        ],
        "authors": []
      },
      {
        "id": "113",
        "title": "I/O 22: Introducing Google Wallet and developer API features",
        "content": "Learn more about how to use the Google Wallet APIs to digitize tickets, loyalty cards, and much more. Discover the new Android SDK and additional developer tools to simplify your integration.",
        "url": "https://www.youtube.com/watch?v=2gTCghy-dU4",
        "headerImageUrl": "https://i.ytimg.com/vi/2gTCghy-dU4/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "8"
        ],
        "authors": []
      },
      {
        "id": "114",
        "title": "I/O 22: Android solutions for seamless sign-in across devices",
        "content": "Discover Android solutions that enable seamless and secure login experiences so users can enjoy your app across devices.",
        "url": "https://www.youtube.com/watch?v=xghjqgj4peA",
        "headerImageUrl": "https://i.ytimg.com/vi/xghjqgj4peA/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "13"
        ],
        "authors": []
      },
      {
        "id": "115",
        "title": "I/O 22: Build power, multi-device experiences\n",
        "content": "Developers play a critical role in Google's multi-device ecosystem. Hear about new tools available to you so that you can build your own powerful, multi-device experiences that span platforms and form factors. Learn about Cast, BlockStore, and the new abstraction layer D2DI.",
        "url": "https://www.youtube.com/watch?v=H6UxTnghkMw",
        "headerImageUrl": "https://i.ytimg.com/vi/H6UxTnghkMw/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "13"
        ],
        "authors": []
      },
      {
        "id": "116",
        "title": "I/O 22: Announcing Compose for Wear OS Beta!",
        "content": "Today we’re launching the Beta release of Compose for Wear OS, our modern declarative UI toolkit designed to help developers create beautiful user experiences for Wear OS.",
        "url": "https://android-developers.googleblog.com/2022/05/announcing-compose-for-wear-os-beta.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhrfM5DyOkb4yfuiuJEOelmS5x4sTioxYCRPdnoSI1h64j-xWkWq9Wk0mZ61ljUw_tkO7NXxKsDUb5TbYMHLxLxhcY24rzNnnDhjzFOOClkM_WH--2bTLJFq93HODS7PHebGl00oluu0Sg5p0MTeNAfusLgHvorSxTDS26YwnQXkTJsDq2HJC36m7Jl/w1200-h630-p-k-no-nu/image4.png",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "19",
          "3",
          "8",
          "13"
        ],
        "authors": [
          "75"
        ]
      },
      {
        "id": "117",
        "title": "I/O 22: Introducing Health Connect",
        "content": "Introducint Health Connect, a new API for Android app developers to securely access user health dataAs Android developers, connecting and sharing health and fitness data between apps can help you provide more meaningful experiences and insights for your users",
        "url": "https://android-developers.googleblog.com/2022/05/introducing-health-connect.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEioB9TK2fLuYAv8nIzhQMGsmSQJFhcWTsEl4ZUkR1XXbEkmR4JR3ZBP2N3YLYU143Lo02Qsx3iXE2VBobBBDJ0fr9V_2_epxOtnDLRA9S2XpkUdAWO-OyBejhkrf53wv4sIqnaqmjRB8iu8XzeFhCgM00gxgln1M-ipVeww9WG5bduNTBcpxRpASMha/w1200-h630-p-k-no-nu/231491533__37260715__148018.png",
        "publishDate": "2022-05-11T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "8"
        ],
        "authors": []
      },
      {
        "id": "118",
        "title": "I/O 22: What’s new with Google TV & Android TV OS",
        "content": "Since last year’s I/O, we’ve continued our commitment to enable you to build better and more engaging experiences on Android TV OS. In addition to platform updates, new features, like expanded integrations with the Live tab, offer opportunities for users to better engage with your content.",
        "url": "https://android-developers.googleblog.com/2022/05/whats-new-with-google-tv-android-tv-os.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgkqwL9j8jLb9ItKoISX9Yo0d3r_IdPdNMje6cca3obZpFDuNmmfKsL6Qj-E3agkDK7E312kuVjVLw3Ez2dF-vVj9UeRSUUPuOuc2T3T9d-HqEaZ6g76NQXEvqwIik0rAqFRZPiE6NH2PfgFmaDDQh6hb81HRgQrzmWGT6WJyuyK-yxnrrCfV4YHYnh/w1200-h630-p-k-no-nu/Android_WhatsNewInAndroidTVGoogleTV_1024x512.png",
        "publishDate": "2022-05-11T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "16",
          "13"
        ],
        "authors": [
          "27"
        ]
      },
      {
        "id": "119",
        "title": "I/O 22: What’s new with Android for Cars",
        "content": "We’re excited to share some of our combined accomplishments from this past year, and introduce new updates that will make it easier for you to provide users with an even better experience in the car.",
        "url": "https://android-developers.googleblog.com/2022/05/whats-new-with-android-for-cars.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgNnogZQP4IGFjoSw7QWt1vr7MphwOi1OtRAAfCAVaNDTdnD5_CAaKhsf11nzxS_XrQ3ERet5yhpK7bs0e5YXdarv6o8iuzNYRqJ25fZrRL8TPfyBGpADg3oOrGM364foSvEdNhSTqDOF_2_TTBkRq-rElETpNAC6pOIHioH7ug3s8z8iJ_f3vWL5pTuQ/w1200-h630-p-k-no-nu/Android-whats-new-with-android-for-cars-io22-social%20%281%29.png",
        "publishDate": "2022-05-11T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "15"
        ],
        "authors": []
      },
      {
        "id": "120",
        "title": "I/O 22: What's new in Google Play",
        "content": "At this year’s Google I/O, we focused on three major ways we can help you continue growing your business on Google Play: Privacy and security initiatives ; Tools to help you improve your app quality; New ways to help you acquire users and engage with existing ones",
        "url": "https://android-developers.googleblog.com/2022/05/whats-new-in-google-play.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiugYmi_1-WFvfxVe8BJ5GCiZjAp1R_B42dvrxu-fHkL1WkswlvjZpAVImVJIJdgzEERdFyzF9QzNZYPmoAJDEe2lfwdOnpSr2zHiQy0od18YP2ozVpC_fR7WQUpeB9kJyqTLx7udivLZn1w3trWfVeT4ejl8e9bZqVJfUyH05k0SgODQpYsUb4Junn/w1200-h630-p-k-no-nu/Play-new-google-play-io-01.png",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "12",
          "8",
          "11"
        ],
        "authors": []
      },
      {
        "id": "121",
        "title": "I/O 22: New Google Play SDK Index",
        "content": "New Google Play SDK Index helps you choose the right SDKs for your app. Helping developers, like you, make informed decisions about SDKs is part of keeping Google Play a safe, trusted space for billions of people.",
        "url": "https://android-developers.googleblog.com/2022/05/new-google-play-sdk-index.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjEBzXvqydpodashPiKchgLE9NA6WXVUYbTFBuooFn8_XwK6E4cMEbM7hyiTRPZ-H3pwTvyHY8143pGB5zgUt_zgUuzsjAIkRSQsngYBd4_dusLSXF94j6KZ0r1UiZC3vQFrabOw9vXdA0Wzcm3SDm_LvlCFdxW67-FplcMJLpZYLQ02I2EUrvORXHl/w1200-h630-p-k-no-nu/Play-new-google-play-sdk-index-social-V2.png",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "12"
        ],
        "authors": [
          "87"
        ]
      },
      {
        "id": "122",
        "title": "I/O 22: How to integrate Android widgets with Google Assistant",
        "content": "Explore intermediate-level concepts for integrating Android widgets with Google Assistant. Provide quick answers and interactive app experiences on Assistant enabled surfaces like Android and Android Auto to their users.",
        "url": "https://www.youtube.com/watch?v=6vXZcg9g_Mo",
        "headerImageUrl": "https://i.ytimg.com/vi/6vXZcg9g_Mo/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "123",
        "title": "I/O 22: Integrate Google Assistant into Android for cars",
        "content": "Learn how to integrate voice into apps built for Android Auto. Learn to add voice to Widgets for Auto, and explore some of the other voice-first features coming to the platform.",
        "url": "https://www.youtube.com/watch?v=hhdVMLG5Y10",
        "headerImageUrl": "https://i.ytimg.com/vi/hhdVMLG5Y10/maxresdefault.jpg",
        "publishDate": "2022-05-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2",
          "15"
        ],
        "authors": []
      },
      {
        "id": "124",
        "title": "I/O 22: ADB Podcast Episode 185 : Play Store🎙",
        "content": "In this episode Tor, Chet, and Romain chat with Jon and Andrew from the Play team about the Play Store app, which recently went through a major refactoring.",
        "url": "https://adbackstage.libsyn.com/episode-185-play-store",
        "headerImageUrl": "http://assets.libsyn.com/show/332855?height=250&width=250&overlay=true",
        "publishDate": "2022-05-17T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "12"
        ],
        "authors": []
      },
      {
        "id": "125",
        "title": "Android Basics with Compose",
        "content": "We released the first two units of Android Basics with Compose, our first free course that teaches Android Development with Jetpack Compose to anyone; you do not need any prior programming experience other than basic computer literacy to get started. ",
        "url": "https://android-developers.googleblog.com/2022/05/new-android-basics-with-compose-course.html",
        "headerImageUrl": "https://developer.android.com/images/hero-assets/android-basics-compose.svg",
        "publishDate": "2022-05-04T23:00:00.000Z",
        "type": "Codelab",
        "topics": [
          "2",
          "3",
          "10"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "126",
        "title": "Android 13 Beta 1",
        "content": "Beta 1 includes the latest updates to photo picker, themed app icons, improved localization and language support, and the new notification permission which requires apps targeting Android 13 to request the notification permission from the user before posting notifications. Check out the beta by visiting the Android 13 developer site.",
        "url": "https://android-developers.googleblog.com/2022/04/android-13-beta-1-blog.html",
        "headerImageUrl": "https://developer.android.com/about/versions/13/images/android-13-hero_1440.png",
        "publishDate": "2022-05-04T23:00:00.000Z",
        "type": "DAC - Android version features",
        "topics": [
          "13"
        ],
        "authors": [
          "14"
        ]
      },
      {
        "id": "127",
        "title": "Architecture: Entities - MAD Skills",
        "content": "In this episode, Garima from GoDaddy Studio talks about entities and more specifically how creating separate entities per layer per project leads to clean and scalable model architecture.",
        "url": "https://www.youtube.com/watch?v=cfak1jDKM_4",
        "headerImageUrl": "https://i3.ytimg.com/vi/cfak1jDKM_4/maxresdefault.jpg",
        "publishDate": "2022-05-04T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "4"
        ],
        "authors": []
      },
      {
        "id": "128",
        "title": "Architecture: Live Q&A - MAD Skills",
        "content": "Manuel , Yigit , TJ , and Milosz hosted a very special Architecture Q&A and answered questions from the community. Find out the answers to: “Is LiveData deprecated?”, “MVVM or MVI for Compose”, “Should we use flow in DataSources” and more.",
        "url": "https://www.youtube.com/watch?v=_2BtE1P6MPE",
        "headerImageUrl": "https://i3.ytimg.com/vi/_2BtE1P6MPE/maxresdefault.jpg",
        "publishDate": "2022-05-04T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "4"
        ],
        "authors": [
          "23",
          "34",
          "38"
        ]
      },
      {
        "id": "129",
        "title": "MAD Skills: Architecture",
        "content": "To wrap up the Architecture Android MAD skills series, \nManuel wrote a blog post summarizing each episode of the series! Check it out to get caught up on all things Android Architecture.",
        "url": "https://android-developers.googleblog.com/2022/04/architecture-mad-skills-series-wrap-up.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjwpLUhIDR7IVIgPnCayAMbm0cYAC0ktSWLT9_vWJ1au0oZK_0un_IlXfu4HixEtc4G_AOi4BkWATw6BsyFCTPtCiu2wSvnfL3OVqWVNdblp6neIuFh9N3KH02SYDBgr6hIpAU7A9KjX9mT3oFJI6uuasaYqqMg_GZgptg0aooIqLywmeTp_PrpTAOj/s1600/1_J2NKRQ4qedvMVWoxL_4ZLA.jpeg",
        "publishDate": "2022-05-04T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "4"
        ],
        "authors": [
          "23"
        ]
      },
      {
        "id": "130",
        "title": "The first developer preview of Privacy Sandbox on Android",
        "content": "Privacy Sandbox is a program to help you conduct initial testing of the proposed APIs and evaluate how you might adopt them for your solutions. The Developer Preview provides additional platform APIs and services on top of the Android 13 Developer Beta release, SDK, system images, Preview APIs, API reference, and support references. See the release notes for more details on what’s included in the release.",
        "url": "https://android-developers.googleblog.com/2022/04/first-preview-privacy-sandbox-android.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEimeEtKqNjaaRY2oxecefVbcytzULjln30fNMxfJQfWOu6Tqy9XYQKAVkwLTeGRiPh50RBIxyA6HD86_Qm_Vpiit7eEO1ZmeZttgdsH187-cL8YE-w6NOvqYDwcn-MzIPmk0yiJy-4_kbsZ4_k3CngfP36F-U5g-PQmunzFpPAHuWtBNCsHcbP80flJ/s1600/Android_PrivacySandboxonAndroidDeveloper_4209x1253.png",
        "publishDate": "2022-05-04T23:00:00.000Z",
        "type": "DAC - Android version features",
        "topics": [
          "11",
          "13"
        ],
        "authors": [
          "77"
        ]
      },
      {
        "id": "131",
        "title": "Expanding Play’s Target Level API Requirements 🎯",
        "content": "Starting on November 1, 2022, apps that don’t target an API level within two years of the latest major Android release version will not be available on Google Play to new users with devices running Android OS versions newer than your app’s target API level. For example, as of this November, existing apps need to target at least API level 30, Android 11, to be available to new users on Android 12 and 13 devices.",
        "url": "https://android-developers.googleblog.com/2022/04/expanding-plays-target-level-api-requirements-to-strengthen-user-security.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEifh6osWctzfS76FGmd91DArGexlVFw7BNh0ZCqgSuU5aO1AU2pt2T554nkpGy8AzeY_oIOY-TWc0YsS_DwMR9yp3aV_TSrgh7-XPNAg8jSDe_8ySG4ae6D6OqVUMzPmwEoPDXvEhA09um5qahSO1cfSjWIk03bq7vUVDvDHnvt-EubXLKw_Dz2uoUI/s1600/Android-New-policy-update-to-strengthen-Google-Play-social.png",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "DAC - Android version features",
        "topics": [
          "12"
        ],
        "authors": [
          "10"
        ]
      },
      {
        "id": "132",
        "title": "Google Play PolicyBytes - April 2022 policy updates",
        "content": "Users who have previously installed your app from Google Play will continue to be able to discover, re-install, and use your app, even if they move to a new Android device. App updates still also need to target an API level within a year of the latest major Android release version. Expanding our target level API requirements will protect users from installing older apps that may not have the privacy and security protections in place that newer Android releases offer.",
        "url": "https://www.youtube.com/watch?v=O0UwUF2DgQc",
        "headerImageUrl": "https://i3.ytimg.com/vi/O0UwUF2DgQc/maxresdefault.jpg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "12"
        ],
        "authors": []
      },
      {
        "id": "133",
        "title": "Upgrading Android Attestation: Remote Provisioning 🔐",
        "content": "Attestation for device integrity has been mandated since Android 8.0, and is used in a variety of services such as SafetyNet. Android 12 added the option of Remote Key Provisioning for device manufacturers, and it will be mandated in Android 13. If you’re leveraging attestation in your app, watch out for a longer certificate chain structure, a new root of trust, the deprecation of RSA attestation, and short-lived certificates/attestation keys.",
        "url": "https://android-developers.googleblog.com/2022/03/upgrading-android-attestation-remote.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhXGH6tNkY1UkXgIQluciMoaSR9hZNKAoKcRyv_UxyHbEuPRvTVfWT4A_3BQEb_HCMUALR5bScXZsIEzHiRJwrFgm9fhouknFkP5H5ngCUtdf7uiGpTuCOm5dF5rtDrjR5Vm0r9NNU4J7lzN3k0sdMQumgan-NPp2nPSgXypTqj-yqn6BBS9URGrh1F/s1600/Android-KeyAttestation-Header.png",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "DAC - Android version features",
        "topics": [
          "13"
        ],
        "authors": []
      },
      {
        "id": "134",
        "title": "Architecture: Handling UI events - MAD Skills",
        "content": "With this episode of MAD skills we continue with our architecture series of videos. In this video you'll learn about UI events. Developer Relations Engineer Manuel Vivo covers the different types of UI events, the best practices for handling them, and more!",
        "url": "https://www.youtube.com/watch?v=lwGtp0Yr0PE",
        "headerImageUrl": "https://i3.ytimg.com/vi/lwGtp0Yr0PE/maxresdefault.jpg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "4"
        ],
        "authors": [
          "23"
        ]
      },
      {
        "id": "135",
        "title": "Architecture: The Domain Layer - MAD Skills",
        "content": "In this episode of MAD skills you'll learn about the Domain Layer - an optional layer which sits between the UI and Data layers. Developer Relations Engineer Don Turner will explain how the domain layer can simplify your app architecture, making it easier to understand and test.",
        "url": "https://www.youtube.com/watch?v=gIhjCh3U88I",
        "headerImageUrl": "https://i3.ytimg.com/vi/gIhjCh3U88I/maxresdefault.jpg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "4"
        ],
        "authors": [
          "42"
        ]
      },
      {
        "id": "136",
        "title": "Architecture: Organizing modules - MAD Skills",
        "content": "In this episode of Architecture for Modern Android Development Skills, Emily Kager shares a tip around organizing modules in Android apps.",
        "url": "https://www.youtube.com/watch?v=HB_r9wn49Gc",
        "headerImageUrl": "https://i3.ytimg.com/vi/HB_r9wn49Gc/maxresdefault.jpg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "4"
        ],
        "authors": []
      },
      {
        "id": "137",
        "title": "App Excellence: Android Architecture",
        "content": "How do you build a successful app? Our advice: think like a building architect. If you need help getting started, we have the perfect blueprint for success when building on Android. Check out our updated guide to Android App Architecture, and build something that your users will love.",
        "url": "https://www.youtube.com/watch?v=fodD6UHjLmw",
        "headerImageUrl": "https://i3.ytimg.com/vi/fodD6UHjLmw/maxresdefault.jpg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "4"
        ],
        "authors": []
      },
      {
        "id": "138",
        "title": "Accessibility on TV - Integrate with Android TV & Google TV",
        "content": "Thinking about accessibility is critical when developing a quality app on Android TV OS. Ian will be covering the most common issues, the solution to these issues, and some more complex scenarios. ",
        "url": "https://www.youtube.com/watch?v=GyglHvJ6LMY",
        "headerImageUrl": "https://i3.ytimg.com/vi/GyglHvJ6LMY/maxresdefault.jpg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "16",
          "14"
        ],
        "authors": []
      },
      {
        "id": "139",
        "title": "Google Play Billing - Integrate with Android TV & Google TV",
        "content": "In this episode of Integrate with Android TV & Google TV, Thomas will discuss how you can monetize your Android TV app using Google Play Billing. ",
        "url": "https://www.youtube.com/watch?v=gb55CjH7NHY",
        "headerImageUrl": "https://i3.ytimg.com/vi/gb55CjH7NHY/maxresdefault.jpg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "16"
        ],
        "authors": []
      },
      {
        "id": "140",
        "title": "Android for Cars 🚗",
        "content": "Android for cars has introduced media recommendations powered by Google Assistant, a progress bar for long form content, and per-item content styles to allow browsable/playable items to be individually assigned to a list or grid. Head on over to the developer documentation to learn about all of these changes.",
        "url": "https://developer.android.com/cars",
        "headerImageUrl": "https://developers.google.com/cars/design/images/designforcars_1920.png",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "16"
        ],
        "authors": []
      },
      {
        "id": "141",
        "title": "Google Play Academy🎓 - Go Global: Japan\n",
        "content": "With over 2 billion active Android devices globally, more and more developers are looking for new markets to expand. If you’re looking to succeed in Japan, one of the largest mobile app and gaming markets, these courses will cover strategies to make your content relevant across development, marketing and growth, and monetization.",
        "url": "https://www.youtube.com/watch?v=hY1HH-9efkg",
        "headerImageUrl": "https://i3.ytimg.com/vi/hY1HH-9efkg/maxresdefault.jpg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "12"
        ],
        "authors": []
      },
      {
        "id": "142",
        "title": "Google Play Academy🎓 - Go Global: Southeast Asia",
        "content": "With over 2 billion active Android devices globally, more and more developers are looking for new markets to expand. If you’re looking to succeed in Southeast Asia, a fast-growing market that spends as much as 1.5x more time on the mobile internet than any other region, these courses will cover strategies to make your content relevant across development, marketing and growth, and monetization.",
        "url": "https://www.youtube.com/watch?v=j9VRzvDhTO0",
        "headerImageUrl": "https://i3.ytimg.com/vi/j9VRzvDhTO0/maxresdefault.jpg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "12"
        ],
        "authors": []
      },
      {
        "id": "143",
        "title": "Google Play Academy🎓 - Design for All Users",
        "content": "Learn how to optimize for onboarding, build accessible apps, and reduce app size to reach more users.",
        "url": "https://www.youtube.com/watch?v=07NUULjEJ5A",
        "headerImageUrl": "https://i3.ytimg.com/vi/07NUULjEJ5A/maxresdefault.jpg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "12"
        ],
        "authors": []
      },
      {
        "id": "144",
        "title": "Game development 🎮",
        "content": "We covered how to help you monitor your game’s stability using Android vitals on Google Play Console, how to best optimize your game to improve your customer engagement during the month of Ramadan, and announced that the Indie Games Accelerator & Indie Games Festival 2022 from Google Play is coming soon, offering a way to get notified when submissions open.",
        "url": "https://www.youtube.com/watch?v=m2gTnT2kCRQ",
        "headerImageUrl": "https://i3.ytimg.com/vi/m2gTnT2kCRQ/maxresdefault.jpg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "17"
        ],
        "authors": []
      },
      {
        "id": "145",
        "title": "Migrating Architecture Blueprints to Jetpack Compose",
        "content": "Manuel wrote about how and why we’ve Migrated our Architecture Blueprints to Jetpack Compose, and some issues we faced in doing so.",
        "url": "https://medium.com/androiddevelopers/migrating-architecture-blueprints-to-jetpack-compose-8ffa6615ede3",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*J2NKRQ4qedvMVWoxL_4ZLA.jpeg",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "4",
          "3"
        ],
        "authors": [
          "23"
        ]
      },
      {
        "id": "146",
        "title": "The curious case of FLAG_ACTIVITY_LAUNCH_ADJACENT",
        "content": "Pietro wrote about how to enable split screen use cases using the Android 7.0 FLAG_ACTIVITY_LAUNCH_ADJACENT flag to open your Activity in a new adjacent window on Android 12L. (and some supported Android 11+ devices)",
        "url": "https://medium.com/androiddevelopers/the-curious-case-of-flag-activity-launch-adjacent-f1212f37a8e0",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*YWg6uZkqSakAb5vW6uc-gg.png",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2"
        ],
        "authors": [
          "12"
        ]
      },
      {
        "id": "147",
        "title": "AndroidX releases 🚀",
        "content": "AppCompat AppCompat-Resources Version 1.5.0-alpha01 contains a bunch of bugfixes, as well as updated nullability to match Android 13 DP2 and a few small compatibility features involving TextView, AppCompatDialog, SearchView, and SwitchCompat.\n\nNavigation Version 2.4.2 has been released with all the new bugfixes backported from the 2.5 alpha releases.",
        "url": "https://developer.android.com/jetpack/androidx/versions/all-channel",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEhxtjouMCgk8sv8wkvC5Aip4muxMo4TLnfSVtZ3Hw7ZpuqXQmk-EkV9qk9PKim0yVFVFlpjEJG-vqh6gCLFkQPuf2dQk6qEdQZM_9brvuxBA0dtOUlvUh7tMIQsF11RnSnSPWOPKDIzeiixfapL2ax4YgMahJppgG_a5rjs_4QBjzzgzqsDs9Wc-Ldx=w1200-h630-p-k-no-nu",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "8"
        ],
        "authors": []
      },
      {
        "id": "148",
        "title": "ADB Podcast Episodes🎙184: Skia and AGSL - Shaders of Things to Come",
        "content": "In this episode Tor, Chet, and Romain chat with Derek and Brian from the Skia team about Skia (the graphics layer that backs the Android Canvas APIs), pixel shaders, and the new “AGSL” API that lets you provide pixel shaders for advanced graphics effects, which was recently added as part of the Android T preview release. If you’re interested in graphics technology, this is the episode for you.",
        "url": "https://adbackstage.libsyn.com/episode-184-skia-and-agsl-shaders-of-things-to-come",
        "headerImageUrl": "https://ssl-static.libsyn.com/p/assets/9/4/d/b/94dbe077f2f14ee640be95ea3302a6a1/ADB184_Skia_and_AGSL.png",
        "publishDate": "2022-04-13T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "2",
          "8"
        ],
        "authors": [
          "32",
          "30",
          "31"
        ]
      },
      {
        "id": "149",
        "title": "Android 13 DP 2 😍",
        "content": "Recently we shared Android 13 Developer Preview 2 with more new features and changes for you to try in your apps! Some notable features include Developer downgradable permissions which allows your app to protect user privacy by downgrading previously granted runtime permissions, and Bluetooth LE Audio which helps users receive high fidelity audio without sacrificing battery life; it can also seamlessly switch between different use cases that were not possible with Bluetooth Classic. Check out all the new features in the post!",
        "url": "https://android-developers.googleblog.com/2022/03/second-preview-android-13.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEjnrShXcFkBmErmhgdmx82vJbaKBIxU6p2Yz2Vr1V7AlFkD2tGwRmx_a7tWcInPmiUh8VpPmEEqXut-EjP23lFYG9wiMO4sKBDEwbZ3MNppZOy_HW54OXO4SkdQVH08cWdi7QnTMMwGELFoPq_r7_cyaGU8fx2InJG2R-NfkqF1IRt7rKOfA8M1GhUy",
        "publishDate": "2022-03-29T23:00:00.000Z",
        "type": "DAC - Android version features",
        "topics": [
          "13"
        ],
        "authors": [
          "14"
        ]
      },
      {
        "id": "150",
        "title": "Architecture: The data layer - MAD Skills",
        "content": "Jose goes over the data layer and its two components: repositories and data sources. You will dive deeper into what the roles of these two are and understand their differences. You will also learn about data immutability, error handling, threading testing and more!",
        "url": "https://www.youtube.com/watch?v=r5AseKQh2ZE",
        "headerImageUrl": "https://i3.ytimg.com/vi/r5AseKQh2ZE/maxresdefault.jpg",
        "publishDate": "2022-03-29T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "4"
        ],
        "authors": []
      },
      {
        "id": "151",
        "title": "Architecture: The UI layer - MAD Skills",
        "content": "TJ covers the UI layer in this episode of MAD skills using the JetNews sample app as a case study You will learn UI Layer pipeline, UI state exposure, UI state consumption and more!",
        "url": "https://www.youtube.com/watch?v=p9VR8KbmzEE",
        "headerImageUrl": "https://i3.ytimg.com/vi/p9VR8KbmzEE/maxresdefault.jpg",
        "publishDate": "2022-03-29T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "4"
        ],
        "authors": [
          "38"
        ]
      },
      {
        "id": "152",
        "title": "Account Linking - Integrate with Android TV & Google TV",
        "content": "Miguel and Adekunle discuss account linking. ​​Google Account Linking lets you safely link a user’s Google Account with their account on your platform, granting Google applications and devices access to your services and is needed for many integrations on Android TV & Google TV. They discuss the basics of OAuth like implementing your authorization, token exchange, and revocation endpoints. You will also learn the difference between the Web OAuth, Streamlined, and App Flip linking flows.",
        "url": "https://www.youtube.com/watch?v=-Fa99hpUsdk",
        "headerImageUrl": "https://i3.ytimg.com/vi/-Fa99hpUsdk/maxresdefault.jpg",
        "publishDate": "2022-03-29T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "16"
        ],
        "authors": []
      },
      {
        "id": "153",
        "title": "Modern media playback on Android - Integrate with Android TV & Google TV",
        "content": "Paul explores best practices for integrating and validating media sessions, the unified way for Android apps to interact with media content. MediaSessions allows different devices like smart speakers, watches, peripherals and accessories to surface and interact with playback and content metadata.",
        "url": "https://www.youtube.com/watch?v=OYy41ceW59s",
        "headerImageUrl": "https://i3.ytimg.com/vi/OYy41ceW59s/maxresdefault.jpg",
        "publishDate": "2022-03-29T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "16"
        ],
        "authors": [
          "27"
        ]
      },
      {
        "id": "154",
        "title": "FHIR SDK for Android Developers 🏥",
        "content": "Community health workers in low-and-middle-income countries use mobile devices as critical tools for doing community outreach and providing crucial health services. Unfortunately, the lack of data interoperability means that patient records are fragmented and caregivers may only receive incomplete information. Last year, Google introduced a collaboration with the World Health Organization to build an open source software developer kit designed to help developers build mobile solutions using the Fast Healthcare Interoperability Resources (FHIR) global standard for healthcare data. Read the article to learn more about how this SDK can help you create apps to aid community health workers in low-and-middle-income countries.",
        "url": "https://medium.com/androiddevelopers/our-fhir-sdk-for-android-developers-9f8455e0b42f",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*azSHuKma0fz1RxcPcqiusg.png",
        "publishDate": "2022-03-29T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "1"
        ],
        "authors": []
      },
      {
        "id": "155",
        "title": "Helping Users Discover Quality Apps on Large Screens 🔎",
        "content": "Adoption of large screens is growing rapidly and now there are over 250M active Android tablets, foldables, and ChromeOS devices. To help people get the most from their devices, we’re making three big changes in Google Play to enable users to discover and engage with high quality apps and games: ranking and promotability changes, alerts for low quality apps, and device-specific ratings and reviews. Read all about it in the post!",
        "url": "https://android-developers.googleblog.com/2022/03/helping-users-discover-quality-apps-on.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEiWXMaly6_CP_gSHmxE92yVBXUQ1X5EcTA6pdKwo_NsAtO1Ouv_RhHxG1HqtbStufdnylV51VbHI0FmmPV8lvmLAOqNzhcD2znU3vWVajQXfOlFw_kP-01jxSvrzVIXZG7SCQMiw58yUaWgmqzO-dsaso5DOeYVKnwQm3Vdu9lFmogfCkQT5u7H0sVt",
        "publishDate": "2022-03-29T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "2"
        ],
        "authors": [
          "61"
        ]
      },
      {
        "id": "156",
        "title": "Access Android vitals data through the new Play Developer Reporting API",
        "content": "In this article Lauren talks about Android vitals which are a great way to track how your app is performing in Google Play Console. Now there are new use cases for Android vitals which include building internal dashboards, joining with other datasets for deeper analysis and automation troubleshooting and releases. Learn more about the API and how to use it in this post!",
        "url": "https://android-developers.googleblog.com/2022/03/play-developer-reporting-API.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEhnvMF36lJv9wDDHWLQb7AfVBajueyEuocw_9ne1jgKJAO5dgXWcAyrKa92f4miTcFoSH5usz_Jha2C1gJwJNSr6et8sZGSCnkZTgtdaKPemEfwaHJDjiurWaPtqFF3qI0aX7aRB7B9WUW1VXT_Wgkyyq8nYK7RrOy9zW4a7gROkzd3H5m9T36Bc7Ww",
        "publishDate": "2022-03-29T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "12"
        ],
        "authors": []
      },
      {
        "id": "157",
        "title": "Using performance class to optimize your user experience",
        "content": "The Jetpack Core Performance library in alpha has launched! This library enables you to easily identify what a device is capable of, and tailor your user experience accordingly. As developer, this means you can reliably group devices with the same level of performance and tailor your app’s behavior to those different groups. This enables you to deliver an optimal experience to users with both more and less capable devices.",
        "url": "https://android-developers.googleblog.com/2022/03/using-performance-class-to-optimize.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjYa28aPEBLCSzLkir02bVSWusH5BBIiAcq_CzCx5DD3iQu5WyDLC1sZe1y5OInomon5KHJKemMCa5q6XAtfkMhljMoePuebLGDz6yRDU3cjkwMo7sV5WKe20KNzWhP1ktdOn7OxOxeiXqzeDrPwLcpoVaStm8840phqHOqDptiQ0twMsGTD2u3o0Xf/s1600/Android-using-performance-class-to-optimize-user-experience-header%20%281%29.png",
        "publishDate": "2022-03-29T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "7"
        ],
        "authors": [
          "42"
        ]
      },
      {
        "id": "158",
        "title": "AndroidX releases 🚀",
        "content": "We have a few libraries in alpha-01 including Activity Version 1.6.0-alpha01, CustomView-Poolingcontainer Version 1.0.0-alpha01, and Junit-Gtest Version 1.0.0-alpha01.\n\nCar App Version 1.2.0-rc01 and Mediarouter Version 1.3.0-rc01 are also in rc-01.",
        "url": "https://developer.android.com/jetpack/androidx/versions/all-channel",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEi6y_NUo9gnpHYdRc7lwnbVnraBtUSIZTnIoAcHXkbq8Z0AFHBUHDI_s7HwwP2h2nTwo571RnRuXN-sUWdgJ7qkNb2MSslYiXWP3tteXooTdwAS_YzbZMTux25eLZk0kgdLtXmWTRLdolft-ZcsgGjCyJnH-CjzHsZXGy8vNVxB5oFZkBExOpBwvoDL=w1200-h630-p-k-no-nu",
        "publishDate": "2022-03-29T23:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "8"
        ],
        "authors": []
      },
      {
        "id": "159",
        "title": "Discontinuing Kotlin synthetics for views",
        "content": "Synthetic properties to access views were created as a way to eliminate the common boilerplate of findViewById calls. These synthetics are provided by JetBrains in the Kotlin Android Extensions Gradle plugin (not to be confused with Android KTX).",
        "url": "https://android-developers.googleblog.com/2022/02/discontinuing-kotlin-synthetics-for-views.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEhAba1fyHq6ddgUfT09YxU3XkAhnolKyLnXE2GmcJABVT-y8PWLKUiC7LmesY7Txak65fc6nW8T7yar9_4Uz4ezcBA_MDZ-yqBR2cj4ipSN-5l_E57exa3m9qt2MHFo_RdLWc_YDX7J7AOMkyzs43ylbGtwl6Z8GSf1zgs71Te36cQ-9Z_qgMgFroLq=w1200-h630-p-k-no-nu",
        "publishDate": "2022-02-18T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2",
          "10"
        ],
        "authors": [
          "1"
        ]
      },
      {
        "id": "160",
        "title": "Things to know from the 2022 Google for Games Developer Summit",
        "content": "This week marked the 2022 Google for Games Developer Summit, Google’s biggest event of the year centered around game development. The Android team shared information around the next generation of services, tools and features to help you develop and deliver high quality games. ",
        "url": "https://android-developers.googleblog.com/2022/03/GGDS-recap-blog.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEhW4RL-UKUurgM2bVJRepqjKehVETjf9bqdXllyspPaWTTt8s86MGvfxlxLkDyJAnnkGr7vDpDTPx6bQbgkThYXMSaW1GQvXw9V57xybA8Y89vIE45JDElGxSNFHwOAndATPYrGmc200fkyBTRSNi7w53hTbS1ao-TSoEBFs8jvTgz6ud5Tcb1qitkt",
        "publishDate": "2022-03-15T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "17"
        ],
        "authors": [
          "2"
        ]
      },
      {
        "id": "161",
        "title": "MAD Skills: DataStore and Introduction to Architecture💡",
        "content": "Now that our MAD Skills series on Jetpack DataStore is complete, let’s do a quick wrap up of all the things we’ve covered in each episode.",
        "url": "https://android-developers.googleblog.com/2022/03/jetpack-datastore-wrap-up.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEgo2-I1LhMjWd1zzpIQXzjMCPoZeUZc35n43UosKDuLMyP7rIDe8cGfs23tmkSAed6Wxw9EoNTIpvvWCljermK_lCu0etlrCnONx3WeXMCGe-s8I45hYhuVo6w_Q2UTNATMTA70t2o9MS5p2pBdPFz5Ye4b2ajOJjNlW9rELtqWcEW4O1Rkzy4lfqRO",
        "publishDate": "2022-03-14T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "9"
        ],
        "authors": [
          "3"
        ]
      },
      {
        "id": "162",
        "title": "Play Time with Jetpack Compose",
        "content": "Learn about Google Play Store’s strategy for adopting Jetpack Compose, how they overcame specific performance challenges, and improved developer productivity and happiness.",
        "url": "https://android-developers.googleblog.com/2022/03/play-time-with-jetpack-compose.html",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-03-10T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3",
          "12"
        ],
        "authors": [
          "4",
          "5"
        ]
      },
      {
        "id": "163",
        "title": "App Excellence Summit 2022 ⭐",
        "content": "Did you know that 54% of users who left a 1-star review in the Play Store mentioned app stability and bugs? *\n\nTo help product managers and business decision makers understand how high quality app experiences drive business growth and what tools they can use to make sound business and technical decisions, we are hosting our first Android App Excellence Summit in just a few weeks!",
        "url": "https://android-developers.googleblog.com/2022/03/app-excellence-summit-2022.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEh4Vck7mqle-tLweEgrIc1WT0ycY6O6zBxv9mC1Dt1xCnJN5COTGFxDSQlIM1rbbMKIMZHPtjzXgENMGk80oxb5Mn8kTn6qO7kgUXC_N5YSB0dWxcXvQOIPHEEgNJze9g8eZrY1xgA9_oBls71NLItDJKTYeoJGEXxIBiAE_c6SkXv2jSELZEoFfqVq",
        "publishDate": "2022-03-10T00:00:00.000Z",
        "type": "Event 📆",
        "topics": [
          "1"
        ],
        "authors": []
      },
      {
        "id": "164",
        "title": "#TheAndroidShow: Tablets, Jetpack Compose, and Android 13 📹",
        "content": "Last week, Florina and Huyen hosted #TheAndroidShow, where we went Behind the scenes with animations & Jetpack Compose, asked whether now is the moment to think tablet first, and covered Android 13 along with other key themes for Android this year.",
        "url": "https://www.youtube.com/watch?v=WL9h46CymlU",
        "headerImageUrl": "https://i.ytimg.com/vi/WL9h46CymlU/maxresdefault.jpg",
        "publishDate": "2022-03-09T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "3",
          "2",
          "13",
          "1"
        ],
        "authors": [
          "6"
        ]
      },
      {
        "id": "165",
        "title": "Freeing up 60% of storage for apps 💾",
        "content": "App archiving will allow users to reclaim ~60% of app storage temporarily by removing parts of the app rather than uninstalling the app completely.",
        "url": "https://android-developers.googleblog.com/2022/03/freeing-up-60-of-storage-for-apps.html",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-03-08T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "9"
        ],
        "authors": [
          "7",
          "8"
        ]
      },
      {
        "id": "166",
        "title": "Demystifying Jetpack Glance for app widgets",
        "content": "We recently announced the first Alpha version of Glance, initially with support for AppWidgets and now for Tiles for Wear OS. This new framework is built on top of the Jetpack Compose runtime and designed to make it faster and easier to build “glanceables” such as app widgets without having to handle a lot of boilerplate code or lifecycle events to connect different components.",
        "url": "https://medium.com/androiddevelopers/demystifying-jetpack-glance-for-app-widgets-8fbc7041955c",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*mlswR3fyxaIG-C1OUifYVw.jpeg",
        "publishDate": "2022-03-07T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2",
          "19"
        ],
        "authors": [
          "9"
        ]
      },
      {
        "id": "167",
        "title": "Keeping Google Play safe with our key 2022 initiatives 🔒",
        "content": "We shared information about what’s ahead in 2022 for Google Play’s privacy and safety initiatives to give you time to prepare.",
        "url": "https://android-developers.googleblog.com/2022/03/privacy-and-security-direction.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEhh3FMLL-etD7iDzhSI6CoYbuwgB9ZADjXa6A9C4aM3W-eRqj1FGfP8dyMY4i5RlMtQJD8Sx1y1NHFuaCae10iZkAs_cETaCAllzCDU075awpkAc1pkhld7uxwjTmwNdihGhB-FtySiSsf9aknd1ZULz0zkRtybX4gRUp8JCbPh2n3pPEhjK0mTjNWS",
        "publishDate": "2022-03-03T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "11"
        ],
        "authors": [
          "10"
        ]
      },
      {
        "id": "168",
        "title": "Games-Activity Version 1.1.0",
        "content": "adds WindowInsets listening/querying for notch and IME response along with key and motion event filters.",
        "url": "https://developer.android.com/jetpack/androidx/releases/games#1.1.0",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-02-23T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "17"
        ],
        "authors": []
      },
      {
        "id": "169",
        "title": "Room Version 2.5.0-alpha01",
        "content": "Converted room-common, room-migration, and paging related files in room-runtime from Java to Kotlin along with a new API for multi-process lock to protect multi-process 1st time database creation and migrations",
        "url": "https://developer.android.com/jetpack/androidx/releases/room#2.5.0-alpha01",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-02-23T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "9"
        ],
        "authors": []
      },
      {
        "id": "170",
        "title": "Media Version 1.6.0-alpha 01",
        "content": "Adds the extras necessary to setup a signin/settings page using CarAppLibrary.",
        "url": "https://developer.android.com/jetpack/androidx/releases/media#media-1.6.0-alpha01",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEjo_CL5arSn2zb_YKP8hKjaMG3nqXXPQ_zn05X9FQ0XLdE2Ii6WeGG0eD_miObCRv2iz3hJ2T0lIIn3iDFyT3yN8B7NFET_fE5nhcw6MHQmOKK4G4R5XgXTkEIyqY4kjz2F5hpPscvQgsz0aRkVqSLynp-6x9HqkoldNYwDSp7kbttmh2JCW1cwUXhG=w1200-h630-p-k-no-nu",
        "publishDate": "2022-02-23T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "18"
        ],
        "authors": []
      },
      {
        "id": "171",
        "title": "AppCompat-Resources Version 1.6.0-alpha01",
        "content": "Adds support for customizing locales, providing backwards compatibility for the Android 13 per-language preferences API",
        "url": "https://developer.android.com/jetpack/androidx/releases/appcompat#1.6.0-alpha01",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEhxsx2mynFgTjtKCAxJiWvIYuJF1sNFfRCPnEbBWSmQLATP_Z6Bmz81sr9WmS2CWVUqIzW4uYyRyW2wQSLR73i9WXLUzGc-LbMS-QEcQQZI5qoymfRf3pyrMnOeGuFAKsfLaAEtquvNyqA2KaO28BnF3plt0jr6kVYIyl0tkpWhxHa47CPuNvhEehQ1=w1200-h630-p-k-no-nu",
        "publishDate": "2022-02-23T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "172",
        "title": "Recording Video with CameraX VideoCapture API",
        "content": "A picture is worth a thousand words, and CameraX ImageCapture has already made it much easier to tell your story through still images on Android. Now with the new VideoCapture API, CameraX can help you create thousands of continuous pictures to tell an even better and more engaging story!",
        "url": "https://medium.com/androiddevelopers/recording-video-with-camerax-videocapture-api-a36cfd8a48c8",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*GZmhCFMCrG4L_mOtwSb0zA.png",
        "publishDate": "2022-02-23T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "18"
        ],
        "authors": [
          "11"
        ]
      },
      {
        "id": "173",
        "title": "Unbundling the stable WindowManager",
        "content": "The 1.0.0 stable release of Jetpack WindowManager, the foundation for great experiences on all types of large screen devices.",
        "url": "https://medium.com/androiddevelopers/unbundling-the-stable-windowmanager-a5471ff2907",
        "headerImageUrl": "https://miro.medium.com/max/1400/0*dIXjHF8_-47CvYTb.png",
        "publishDate": "2022-02-17T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2"
        ],
        "authors": [
          "12"
        ]
      },
      {
        "id": "174",
        "title": "Jetpack Compose 1.1 is now stable!",
        "content": "Last week we released version 1.1 of Jetpack Compose and Florina Muntenescu wrote an article giving us all the information! This release contains new features like improved focus handling, touch target sizing, ImageVector caching and support for Android 12 stretch overscroll. This also means that previously experimental APIs are now stable. Check out our recently updated samples, codelabs, and the Accompanist library!",
        "url": "https://android-developers.googleblog.com/2022/02/jetpack-compose-11-now-stable.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEiEIiQOoFF-f-sDcbYOMINZw5-2R9aQjrREfiXFMGsRYODVfaz1sgdCS2C3UjgeJjCII5oyE4y97kbvQIUsl9wIx8RqTSZPSdIoCywW89lvmAJ5a15bkFOwoR9UacCEUb4CjOMy0omVMfC0CQhUfz9VMTZR4iyjDGagEZfNuMid8BT0lvarns9Tp6PC",
        "publishDate": "2022-02-09T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "2"
        ],
        "authors": [
          "6"
        ]
      },
      {
        "id": "175",
        "title": "MAD Skills: DataStore",
        "content": "The DataStore MAD Skills series rolls on! In the sixth episode, Simona Stojanovic covered DataStore: Best Practices part 2 covering DataStore-to-DataStore migration. This is used when you make significant changes to your dataset like renaming your data model values or changing their type. ",
        "url": "https://medium.com/androiddevelopers/datastore-and-data-migration-fdca806eb1aa",
        "headerImageUrl": "https://miro.medium.com/max/1400/0*8wsdb7Z7QxT1d4lM",
        "publishDate": "2022-02-15T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "9"
        ],
        "authors": [
          "3"
        ]
      },
      {
        "id": "176",
        "title": "DataStore and Testing",
        "content": "For the final part of the DataStore series, Simona covered DataStore and testing and teaches you how to fully test your DataStore.",
        "url": "https://medium.com/androiddevelopers/datastore-and-testing-edf7ae8df3d8",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*5_yt1M6_QEMN0OgGU8VaZw.png",
        "publishDate": "2022-02-16T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "9"
        ],
        "authors": [
          "3"
        ]
      },
      {
        "id": "177",
        "title": "Material You: Coming to more Android Devices near you",
        "content": "Material You will soon be available on more Android 12 phones globally including devices by Samsung, Oppo, OnePlus and more! Material You has made the Android experience more fluid and personal than ever. Our OEM partners continue to work with us to ensure that key design APIs work consistently across the Android ecosystem so developers can benefit from a cohesive experience.",
        "url": "https://android-developers.googleblog.com/2022/02/material-you-coming-to-more-android.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEhDOIPFoqZ8uvg7VmH5EuY3ocfxvKZXawUQ9NczUCEtOdpw3v42vSTrpUSvHjbph5KmTlDH-XtnmGeXmCFTMaHDnRS9ibzLUHBip_XnVHUL7xv-3UrVL6plimErj_oK_KyW5ULpmj6orVTaTq9r56K0V3npQFdIrBPE7_caRWb_QA5E9FljpREWVB7Y",
        "publishDate": "2022-02-10T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2",
          "13"
        ],
        "authors": [
          "13"
        ]
      },
      {
        "id": "178",
        "title": "The first developer preview of Android 13",
        "content": "We’re sharing a first look at the next release of Android, with the Android 13 Developer Preview 1. With Android 13 we’re continuing some important themes: privacy and security, as well as developer productivity. We’ll also build on some of the newer updates we made in 12L to help you take advantage of the 250+ million large screen Android devices currently running.",
        "url": "https://android-developers.googleblog.com/2022/02/first-preview-android-13.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEjnrShXcFkBmErmhgdmx82vJbaKBIxU6p2Yz2Vr1V7AlFkD2tGwRmx_a7tWcInPmiUh8VpPmEEqXut-EjP23lFYG9wiMO4sKBDEwbZ3MNppZOy_HW54OXO4SkdQVH08cWdi7QnTMMwGELFoPq_r7_cyaGU8fx2InJG2R-NfkqF1IRt7rKOfA8M1GhUy",
        "publishDate": "2022-02-10T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "13"
        ],
        "authors": [
          "14"
        ]
      },
      {
        "id": "179",
        "title": "AndroidX releases 🚀",
        "content": "Since Compose just went stable, the Animation, Compiler, Foundation, Material, Runtime and UI Versions also went stable! Games-Text-Input and ProfileInstaller also went stable! \n\nThere are a bunch of new APIs in alpha including new Testing APIs (Test Runner, Test Monitor, Test Services and Test Orchestrator), Metrics Version and Startup Version.",
        "url": "https://developer.android.com/jetpack/androidx/versions/all-channel#february_9_2022",
        "headerImageUrl": "https://miro.medium.com/max/1400/0*bux1xKYcB3A9pBFx",
        "publishDate": "2022-02-09T00:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "3",
          "8"
        ],
        "authors": [
          "15"
        ]
      },
      {
        "id": "180",
        "title": "DataStore best practices part 1",
        "content": "learn about performing synchronous work and how to make it work with Kotlin data class serialization and Hilt.",
        "url": "https://www.youtube.com/watch?v=S10ci36lBJ4",
        "headerImageUrl": "https://i.ytimg.com/vi/S10ci36lBJ4/maxresdefault.jpg",
        "publishDate": "2022-02-07T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "9"
        ],
        "authors": [
          "3"
        ]
      },
      {
        "id": "181",
        "title": "All about Proto DataStore",
        "content": "In this post, we will learn about Proto DataStore, one of two DataStore implementations. We will discuss how to create it, read and write data and how to handle exceptions, to better understand the scenarios that make Proto a great choice.",
        "url": "https://medium.com/androiddevelopers/all-about-proto-datastore-1b1af6cd2879",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*UtNu7pmbt3WEA213SW9p9Q.png",
        "publishDate": "2022-01-31T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "9"
        ],
        "authors": [
          "3"
        ]
      },
      {
        "id": "182",
        "title": "Glance: Tiles for Wear OS made simple ⌚️",
        "content": "Last year we announced the Wear Tiles API. To complement that Java API, we are excited to announce that support for Wear OS Tiles has been added to Glance, a new framework built on top of Jetpack Compose designed to make it easier to build for surfaces outside your Android app. As this library is in alpha, we’d love to get your feedback.",
        "url": "https://android-developers.googleblog.com/2022/01/announcing-glance-tiles-for-wear-os.html",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-01-26T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "19"
        ],
        "authors": [
          "16"
        ]
      },
      {
        "id": "183",
        "title": "Android Studio Bumblebee 🐝 stable",
        "content": "Android Studio Bumblebee (2021.1.1) is now stable. We’ve since patched it to address some launch issues — so make sure to upgrade! It improves functionality across the typical developer workflow: Build and Deploy, Profiling and Inspection, and Design.",
        "url": "https://android-developers.googleblog.com/2022/01/android-studio-bumblebee-202111-stable.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEhQ7R2ySipHb8y5jNJeiIj3pE8dZfWAV7EF0wQZ4rQ65lB4MsZroAT4R_7rSfznMZ30xBMLx9_dwnt05V6I0Du0EfI7mvLicK6LwdkuZsF_Gc3sPqrZGxkojTJpHCXFI3Kvr3bLyoSjElldtt1NUpGSBzHgG3O1pvS9BR02L9R2_FYTUgPLfUoNLWYQ",
        "publishDate": "2022-01-25T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "5"
        ],
        "authors": [
          "17"
        ]
      },
      {
        "id": "184",
        "title": "All about Preferences DataStore",
        "content": "In this post, we will take a look at Preferences DataStore, one of two DataStore implementations. We will go over how to create it, read and write data, and how to handle exceptions, all of which should, hopefully, provide you with enough information to decide if it’s the right choice for your app.",
        "url": "https://medium.com/androiddevelopers/all-about-preferences-datastore-cc7995679334",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*UtNu7pmbt3WEA213SW9p9Q.png",
        "publishDate": "2022-01-24T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "9"
        ],
        "authors": [
          "3"
        ]
      },
      {
        "id": "185",
        "title": "Building apps for Android Automotive OS 🚘",
        "content": "The Car App Library version 1.2 is already in beta, enabling app developers to start building their navigation, parking, and charging apps for Android Automotive OS. Now, developers can begin building and testing apps for these categories using the Automotive OS emulator across both Android Automotive OS and Android Auto.",
        "url": "https://android-developers.googleblog.com/2022/01/building-apps-for-android-automotive-os.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEicCVDoRaflBAdKr9_Zh2cAGUB8pphAj9m0w1iN7VLizNZ6L2iNGNSnt7tvD6MP72BW8eqobZpU751t32aF47bpNDv2walZ6zzsXxyuAjCyhBl0b4o06X1j3bPi0AAU0EedqYjp5FSXMQHHzvxBedjsST3MIIFvalX3tZpgiFZgEdqbB2f_H741Irrb=w1200-h630-p-k-no-nu",
        "publishDate": "2022-01-27T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "15"
        ],
        "authors": [
          "18"
        ]
      },
      {
        "id": "186",
        "title": "Navigation 2.4 is stable ",
        "content": "It’s been rewritten in Kotlin, with two pane integration, Navigation routes + Kotlin DSL improvements, Navigation Compose’s first stable release, and multiple back stack support.",
        "url": "https://developer.android.com/jetpack/androidx/releases/navigation#2.4.0",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEhsJgTKhUlIb-1X_G1rWQLCxpd0KMmGTUgqUfSNr4__CsxxjiOdJgJHCtgO9dG8mZdwzAHat9HyIcMsvA-fS0o6T0-_ut_Ej74hKfn09AJUPNc3YscwfGG6hqFS-W_oTczgtd1aGNzpCdDDo4b4lrUM3n8OsFKjvslqE6pHRY3w0aZSTHsaYytSnQSA=w1200-h630-p-k-no-nu",
        "publishDate": "2022-01-26T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "187",
        "title": "Google Maps with Jetpack Compose",
        "content": "A project which contains Jetpack Compose components for the Google Maps SDK for Android.\n\n",
        "url": "https://github.com/googlemaps/android-maps-compose",
        "headerImageUrl": "https://opengraph.githubassets.com/0952eadfbb07f5ce9f631fd0312d87e8f0e2557df01bac3b587311ca864cf836/googlemaps/android-maps-compose",
        "publishDate": "2022-02-11T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "3"
        ],
        "authors": []
      },
      {
        "id": "188",
        "title": "Improving App Performance with Baseline Profiles",
        "content": "In this blog post we’ll discuss Baseline Profiles and how they improve app and library performance, including startup time by up to 40%. While this blogpost focuses on startup, baseline profiles also significantly improve jank as well.",
        "url": "https://android-developers.googleblog.com/2022/01/improving-app-performance-with-baseline.html",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-01-28T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7"
        ],
        "authors": [
          "19",
          "20",
          "21"
        ]
      },
      {
        "id": "189",
        "title": "Smule Adopts Google’s Oboe to Improve Recording Quality & Completion Rates",
        "content": "As the most downloaded singing app of all time, Smule Inc. has been investing on Android to improve the overall audio quality and, more specifically, to reduce latency, i.e. allowing singers to hear their voices in the headset as they perform. The teams specialized in Audio and Video allocated a significant part of 2021 into making the necessary changes to convert the Smule application used by over ten million Android users from using the OpenSL audio API to the Oboe audio library, enabling roughly a 10%+ increase in recording completion rate.",
        "url": "https://android-developers.googleblog.com/2022/02/smule-adopts-googles-oboe-to-improve.html",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-02-02T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "18"
        ],
        "authors": []
      },
      {
        "id": "190",
        "title": "Guide to background work",
        "content": "Do you use coroutines or WorkManager for background work? The team updated the guide to background work to help you choose which library is best for your use case. It depends on whether or not the work is persistent, and if it needs to run immediately, it’s long running, or deferrable.",
        "url": "https://developer.android.com/guide/background",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-02-11T00:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "4"
        ],
        "authors": []
      },
      {
        "id": "191",
        "title": "Accessibility best practices",
        "content": "If you work on Android TV, you should be aware of the accessibility best practices that the team created. It provides recommendations for both native and non-native apps. Get to know why accessibility is important for your TV app, how to evaluate your apps when TalkBack is used, how to adopt system caption settings, and more!",
        "url": "https://developer.android.com/training/tv/accessibility",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2022-02-11T00:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "16",
          "14"
        ],
        "authors": []
      },
      {
        "id": "192",
        "title": "TalkBack - the Google screen reader",
        "content": "Next up in the Accessibility series is TalkBack, the Google screen reader! In this video, learn what TalkBack is, how to set it up, how to navigate through your app with it, and how you can use it to improve the Accessibility of your app.",
        "url": "https://www.youtube.com/watch?v=_1yRVwhEv5I",
        "headerImageUrl": "https://i.ytimg.com/vi/_1yRVwhEv5I/maxresdefault.jpg",
        "publishDate": "2022-01-21T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "14"
        ],
        "authors": []
      },
      {
        "id": "193",
        "title": "ADB Podcast 182: Large screens are a big deal",
        "content": "Clara, Florina and Daniel join your usual hosts to talk about large screens, what they are and what they mean for app developers. You will also learn about the resources at your disposal to build high quality experiences on large screen devices: from samples and guidance to canonical layouts and new APIs such as window size classes. Disclaimer: Florina is very excited about this, don’t miss the epic Large screens! Large screens! Large screens! intro!",
        "url": "https://adbackstage.libsyn.com/episode-182-large-screens-are-a-big-deal",
        "headerImageUrl": "http://assets.libsyn.com/show/332855?height=250&width=250&overlay=true",
        "publishDate": "2022-02-01T00:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "194",
        "title": "Jetpack Alpha for Glance Widgets 🔍",
        "content": "We made the first release of Jetpack Glance available, a new framework designed to make it faster and easier to build app widgets for the home screen and other surfaces. Glance offers similar modern, declarative Kotlin APIs that you are used to with Jetpack Compose, helping you build beautiful, responsive app widgets with way less code. Glance provides a base-set of its own Composables to help build “glanceable” experiences — starting today with app widget components but with more coming. Using the Jetpack Compose runtime, Glance translates these Composables into RemoteViews that can be displayed in an app widget",
        "url": "https://android-developers.googleblog.com/2021/12/announcing-jetpack-glance-alpha-for-app.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEgol-A5cMCZY79MH5v0axcekWIVJ--ymPUe0U5Q4BLsC0BA1LTbWIlZ76XWi2cHjxHVu-kbpv0o2QJWBjNAda_93Ah7AW_PcAgz9o082cd6zyTJZAM8HjQnrZ69A6CaKQaCFuf2LLi4p6xRvS_WUn9tVA2K2wmV3_qB6JDKnFNhO3Guvn5tPc_SuoaY",
        "publishDate": "2021-12-15T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "8"
        ],
        "authors": [
          "9"
        ]
      },
      {
        "id": "195",
        "title": "Jetpack Watch Face Library ⌚",
        "content": "We launched the Jetpack Watch Face library written from the ground up in Kotlin, including all functionality from the Wearable Support Library along with many new features such as: Watch face styling which persists across both the watch and phone (with no need for your own database or companion app); Support for a WYSIWYG watch face configuration UI on the phone; Smaller, separate libraries (that only include what you need); Battery improvements through promoting good battery usage patterns out of the box, such as automatically reducing the interactive frame rate when the battery is low; New screenshot APIs so users can see previews of their watch face changes in real time on both the watch and phone.\n\nIf you are still using the Wearable Support Library, we strongly encourage migrating to the new Jetpack libraries to take advantage of the new APIs and upcoming features and bug fixes.",
        "url": "https://android-developers.googleblog.com/2021/12/develop-watch-faces-with-stable-jetpack.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-P4S1eEhqouE/YaaFy_bGD1I/AAAAAAAARNA/-w5O05Mppo8pe0hoeMC1yDNRWiX_mnTOgCLcBGAsYHQ/s0/image1.png",
        "publishDate": "2021-12-01T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "19",
          "3",
          "8"
        ],
        "authors": [
          "22"
        ]
      },
      {
        "id": "196",
        "title": "Rebuilding our Guide to App Architecture 📐",
        "content": "We launched a revamped guide to app architecture which includes best practices. As Android apps grow in size, it’s important to design the code with an architecture in place that allows the app to scale, improves quality and robustness, and makes testing easier. The guide contains pages for UI, domain, and data layers including deep dives into more complex topics, such as how to handle UI events. We also have a learning pathway to walk you through it.",
        "url": "https://android-developers.googleblog.com/2021/12/rebuilding-our-guide-to-app-architecture.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEgnJ0CCtKClhEOE_BDOoWiXGr2eA6LWjn-RPvFjFx8Va97f_1_xCmpF3uI_bUILoQPqJUDlXUbIRVPjvi3oCiFtRVZlcAAkHBa1cJlufG5OvmeovQeiHgH9bLhxREufi-fw7FnxIcmxGmzWuW0DmYUZolsM6rywTSZIm3KtI6yx9jSIeRpuYzRZubke",
        "publishDate": "2021-12-14T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "4"
        ],
        "authors": [
          "23"
        ]
      },
      {
        "id": "197",
        "title": "Google Play Games on PC Beta 🎮",
        "content": "We announced that we’re opening sign-ups for Google Play Games on PC as a beta in Korea, Taiwan, and Hong Kong, allowing users participating in the beta to play a catalog of Google Play games on their PC via a standalone application built by Google. The developer site has a form to express interest, along with information about bringing your Android game to PCs. It involves many of the same updates that you do to optimize your game for Chrome OS devices, such as support for Mouse and Keyboard controls.",
        "url": "https://developers.googleblog.com/2022/01/googleplaygames.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEgsNv-PVLNLlX2SYd2p5DwTN2Jxwb54Rc7Ekbm0LgcFuwHBrF_5Y-DiUblL9oTjmeJ1Y44nPRMMkH5K-xlC0OApgUGxqBpUcfuV1LYPVvKsI67BKTpc_gNhaHsNda6Q1Uk1UvTznmMydqNHtXSqTgSJbjpQCoTGZM_ZLXlkGwMoBFfnMQkAIdl2zjsC",
        "publishDate": "2022-01-19T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "17"
        ],
        "authors": [
          "24"
        ]
      },
      {
        "id": "198",
        "title": "MAD Skills: Gradle 🐘",
        "content": "Murat covered building custom plugins in more depth, including the Artifact API in addition to the Variant API covered previously. It demonstrates building a plugin which automatically updates the version code specified in the app manifest with the git version. With the AGP 7.0 release, you can use these APIs to control build inputs, read, modify, or even replace intermediate and final artifacts.",
        "url": "https://medium.com/androiddevelopers/gradle-and-agp-build-apis-taking-your-plugin-to-the-next-step-95e7bd1cd4c9",
        "headerImageUrl": "https://miro.medium.com/max/1400/0*WkRft2aAKv19MoIm.jpeg",
        "publishDate": "2021-12-01T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "5"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "199",
        "title": "Gradle and AGP Build APIs: Community tip - MAD Skills",
        "content": "On this episode of Gradle and AGP Build APIs for MAD Skills, Alex Saveau walks you through manipulating Android build artifacts with the Android Gradle Plugin (AGP) and Gradle APIs.",
        "url": "https://www.youtube.com/watch?v=8SFfffaB0CU",
        "headerImageUrl": "https://i3.ytimg.com/vi/8SFfffaB0CU/maxresdefault.jpg",
        "publishDate": "2021-12-15T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "5"
        ],
        "authors": [
          "26"
        ]
      },
      {
        "id": "200",
        "title": "Gradle and AGP Build APIs: Taking your plugin to the next step - MAD Skills",
        "content": "On this episode of Gradle and AGP Build APIs for MAD Skills, Murat will discuss Gradle tasks, providers, properties, and basics of task inputs and outputs. Next, you will be able to take your plugin a step further and learn how to get access to various build artifacts using the new Artifact API. ",
        "url": "https://www.youtube.com/watch?v=SB4QlngQQW0",
        "headerImageUrl": "https://i3.ytimg.com/vi/SB4QlngQQW0/maxresdefault.jpg",
        "publishDate": "2021-11-29T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "5"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "201",
        "title": "MAD Skills Gradle and AGP build APIs Wrap Up!",
        "content": "This wrap-up post summarizes the whole MAD Skills Gradle series",
        "url": "https://android-developers.googleblog.com/2021/12/mad-skills-gradle-and-agp-build-apis.html",
        "headerImageUrl": "https://blogger.googleusercontent.com/img/a/AVvXsEgo1Fw61B9qtQESKdVJzcNXOG0RzhA2k85zkDMDNidBiQY7B6uguHXQ9t9IPB9BiHS0WTB1b4fwIgeN5zEIJrmznF9pt5lu9186wvXxJ3IKfLi8Fci8LyMDbQKGYc7nnijJ9_lhrNHtRQamaF2GTSXyJq5_lQk7we3cSfSviOxhgKN9TscMJaGgdMZJ",
        "publishDate": "2021-12-16T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "5"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "202",
        "title": "MAD Skills: DataStore 🗄️",
        "content": "Simona began MAD Skills: DataStore. DataStore is a thread-safe, non-blocking library in Android Jetpack that provides a safe and consistent way to store small amounts of data, such as preferences or application state, replacing SharedPreferences. It provides an implementation that stores typed objects backed by protocol buffers (Proto DataStore) and an implementation that stores key-value pairs (Preferences DataStore).",
        "url": "https://www.youtube.com/watch?v=9ws-cJzlJkU",
        "headerImageUrl": "https://i3.ytimg.com/vi/9ws-cJzlJkU/maxresdefault.jpg",
        "publishDate": "2022-01-18T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "9"
        ],
        "authors": [
          "3"
        ]
      },
      {
        "id": "203",
        "title": "AndroidX releases 🚀",
        "content": "Since the last Now in Android episode, a lot of libraries were promoted to stable! Compose ConstraintLayout brings support for ConstraintLayout syntax to Compose. We also released CoordinatorLayout 1.2, Car App 1.1.0, Room 2.4.0, Sqlite 2.2.0, Collection 1.2.0, and Wear Watchface 1.0.0.\n\nOur first alpha of Jetpack Compose 1.2 was released, along with alphas for Glance 1.0.0, Core-Ktx 1.8.0, WorkManager 2.8.0, Mediarouter 1.3.0, Emoji2 1.1.0, Annotation 1.4.0, Core-RemoteViews, Core-Peformance, and more.",
        "url": "https://developer.android.com/jetpack/androidx/versions/all-channel#december_1_2021",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2021-12-01T00:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "8"
        ],
        "authors": []
      },
      {
        "id": "204",
        "title": "Jetnews for every screen",
        "content": "Alex wrote about the recent updates to Jetnews that improves its behavior across big and small mobile devices. It describes our design and development process so that you can learn our philosophy and associated implementation steps for building an application optimized for all screens with Jetpack Compose, including how to build a list/detail layout.",
        "url": "https://medium.com/androiddevelopers/jetnews-for-every-screen-4d8e7927752",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*678DlYtu4G7wFrq30FQ7Mw.png",
        "publishDate": "2022-01-18T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2"
        ],
        "authors": [
          "22"
        ]
      },
      {
        "id": "205",
        "title": "Simplifying drag and drop",
        "content": "Paul wrote about drag & drop, and how the Android Jetpack DragAndDrop library alpha makes it easier to handle data dropped into your app.",
        "url": "https://medium.com/androiddevelopers/simplifying-drag-and-drop-3713d6ef526e",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*pUe4RBLe7FVlISDtAqeQ4Q.png",
        "publishDate": "2021-12-15T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "8"
        ],
        "authors": [
          "27"
        ]
      },
      {
        "id": "206",
        "title": "Accessibility series 🌐: Handling content that times out - Accessibility on Android",
        "content": "The accessibility series continues on, beginning with an episode on how to properly implement UI elements that disappear after a set amount of time.",
        "url": "https://www.youtube.com/watch?v=X97P6Y8WHl0",
        "headerImageUrl": "https://i3.ytimg.com/vi/X97P6Y8WHl0/maxresdefault.jpg",
        "publishDate": "2021-12-03T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "14"
        ],
        "authors": [
          "28"
        ]
      },
      {
        "id": "207",
        "title": "Accessibility series 🌐: Acessibility Scanner",
        "content": "We also cover how Accessibility Scanner can help you improve your app for all users by suggesting improvements in areas of accessibility.",
        "url": "https://www.youtube.com/watch?v=i1gMzQv0hWU",
        "headerImageUrl": "https://i3.ytimg.com/vi/i1gMzQv0hWU/maxresdefault.jpg",
        "publishDate": "2021-12-10T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "14"
        ],
        "authors": [
          "28"
        ]
      },
      {
        "id": "208",
        "title": "Accessibility series 🌐: Accessibility test framework and Espresso - Accessibility on Android",
        "content": "We investigate how Espresso and the Accessibility Test Framework can help you create automated accessibility tests.",
        "url": "https://www.youtube.com/watch?v=DLN2s16HwcE",
        "headerImageUrl": "https://i3.ytimg.com/vi/DLN2s16HwcE/maxresdefault.jpg",
        "publishDate": "2021-12-22T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "14"
        ],
        "authors": [
          "28"
        ]
      },
      {
        "id": "209",
        "title": "Android TV & Google TV 📺",
        "content": "Mayuri covered best practices for the Watch Next API on Android TV & Google TV, which increases engagement with your app by allowing your content to show up in the Watch Next row.",
        "url": "https://www.youtube.com/watch?v=QFMIP5GOo70",
        "headerImageUrl": "https://i3.ytimg.com/vi/QFMIP5GOo70/maxresdefault.jpg",
        "publishDate": "2022-01-14T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "16"
        ],
        "authors": [
          "29"
        ]
      },
      {
        "id": "210",
        "title": "ADB Podcast 179: Flibberty Widget",
        "content": "In this episode, Chet and Romain talked with Nicole McWilliams and Petr Čermák from the London engineering office about their work on App Widgets and Digital Wellbeing.",
        "url": "https://adbackstage.libsyn.com/flibberty-widget",
        "headerImageUrl": "https://ssl-static.libsyn.com/p/assets/4/0/e/c/40ec1fb11096bffed959afa2a1bf1c87/adb-180-flibberty-widget.png",
        "publishDate": "2021-11-30T00:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "13"
        ],
        "authors": [
          "30",
          "31",
          "32",
          "33"
        ]
      },
      {
        "id": "211",
        "title": "ADB Podcast 180: Kotlin Magic Platform",
        "content": "In this episode, we chat with Yigit Boyar from the Android Toolkit Team about Kotlin multi platform, while Romain provides light background music on his piano.",
        "url": "https://adbackstage.libsyn.com/episode-180-kotlin-magic-platform",
        "headerImageUrl": "https://ssl-static.libsyn.com/p/assets/2/6/2/5/262599d4ce76d20fa04421dee9605cbd/adb-181-kmp.png",
        "publishDate": "2021-12-16T00:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "10"
        ],
        "authors": [
          "30",
          "31",
          "32",
          "34"
        ]
      },
      {
        "id": "212",
        "title": "ADB Podcast 181: Architecture → Fewer bugs at the end",
        "content": "In this episode, we chat with Yigit Boyar (again!) from the Android Toolkit Team and Manuel Vivo from the Developer Relations team about application architecture. The team has released new architecture guidance, and we talk about that guidance here, as well as how our architecture recommendations apply in the new Jetpack Compose world.",
        "url": "https://adbackstage.libsyn.com/episode-181-architecture-fewer-bugs-at-the-end",
        "headerImageUrl": "https://ssl-static.libsyn.com/p/assets/8/d/1/3/8d137b65f392a68c27a2322813b393ee/ADB_181_Architecture.png",
        "publishDate": "2022-01-11T00:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "4"
        ],
        "authors": [
          "31",
          "31",
          "32",
          "23"
        ]
      },
      {
        "id": "213",
        "title": "Android 12",
        "content": "We released Android 12 and pushed it to the Android Open Source Project (AOSP). We introduced a new design language called Material You. We reduced the CPU time used by core system services, added performance class device capabilities, and added new features to improve performance. Users have more control of their privacy with the Privacy Dashboard and other new security and privacy features. We improved the user experience with a unified API for rich content insertion, compatible media transcoding, easier blurs and effects, AVIF image support, enhanced haptics, new camera effects/capabilities, improved native crash debugging, support for rounded screen corners, Play as you download, and Game Mode APIs.",
        "url": "https://android-developers.googleblog.com/2021/10/android-12-is-live-in-aosp.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-mGlzRmn42Rs/YVstltyrboI/AAAAAAAAK3A/44QpoNJDeuoHhlgrRJSbk0L_ZopgFDLFACLcBGAsYHQ/s0/Android%2B12%2Blogo.png",
        "publishDate": "2021-10-03T23:00:00.000Z",
        "type": "DAC - Android version features",
        "topics": [
          "13"
        ],
        "authors": [
          "14"
        ]
      },
      {
        "id": "214",
        "title": "Compose",
        "content": "Jetpack Compose, Android’s modern, native UI toolkit became stable and ready for you to adopt in production. It interoperates with your existing app, integrates with existing Jetpack libraries, implements Material Design with straightforward theming, supports lists with Lazy components using minimal boilerplate, and has a powerful, extensible animation system. You can learn more about working with Compose in the Compose learning path and see where we’re going in future Compose releases in the Compose roadmap.",
        "url": "https://developer.android.com/jetpack/compose",
        "headerImageUrl": "https://www.gstatic.com/devrel-devsite/prod/vab7ee6e3641f10848d404faa598f256587df1a361a1e70cd114230c2961b73d9/android/images/lockup.svg",
        "publishDate": "2021-12-07T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "3"
        ],
        "authors": []
      },
      {
        "id": "215",
        "title": "Training",
        "content": "This year, the Android Training Team released the final four new units of Android Basics in Kotlin.",
        "url": "https://developer.android.com/courses/android-basics-kotlin/course",
        "headerImageUrl": "https://developer.android.com/images/hero-assets/android-basics-kotlin.svg",
        "publishDate": "2021-12-07T00:00:00.000Z",
        "type": "Codelab",
        "topics": [
          "10"
        ],
        "authors": []
      },
      {
        "id": "216",
        "title": "Introduction to Kotlin and Jetpack ",
        "content": "Learn the basics of Jetpack KTX libraries, how to simplify callbacks with coroutines and Flow, and how to use and test Room/WorkManager APIs.",
        "url": "https://youtu.be/nw7nnlHDkHw?list=PLWz5rJ2EKKc98e0f5ZbsgB63MdjZTFgsy",
        "headerImageUrl": "https://i3.ytimg.com/vi/nw7nnlHDkHw/maxresdefault.jpg",
        "publishDate": "2021-12-14T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "10",
          "8"
        ],
        "authors": [
          "6"
        ]
      },
      {
        "id": "217",
        "title": "Introduction to Motion Layout",
        "content": "Learn how to use MotionLayout and its design tool to create rich, animated experiences.",
        "url": "https://www.youtube.com/watch?v=M1jE3W3_NTQ&list=PLWz5rJ2EKKc_PEOEHNBEyy6tPX1EgtUw2",
        "headerImageUrl": "https://i3.ytimg.com/vi/M1jE3W3_NTQ/maxresdefault.jpg",
        "publishDate": "2022-01-19T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "10",
          "2",
          "8"
        ],
        "authors": [
          "35"
        ]
      },
      {
        "id": "218",
        "title": "Introduction to WorkManager",
        "content": "Learn how to schedule critical background work with WorkManager: from basic usage, threading, custom configuration and more.",
        "url": "https://www.youtube.com/watch?v=NtpgWjiXEfg&list=PLWz5rJ2EKKc_J88-h0PhCO_aV0HIAs9Qk",
        "headerImageUrl": "https://i3.ytimg.com/vi/NtpgWjiXEfg/maxresdefault.jpg",
        "publishDate": "2022-03-01T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "8"
        ],
        "authors": [
          "36"
        ]
      },
      {
        "id": "219",
        "title": "Introduction to Navigation",
        "content": "Learn the basics of the Navigation component, specific features of the tool and the APIs to create and navigate to destinations.",
        "url": "https://www.youtube.com/watch?list=PLWz5rJ2EKKc9VpBMZUS9geQtc5RJ2RsUd&v=fiQiMy0HzsY&feature=emb_title",
        "headerImageUrl": "https://i3.ytimg.com/vi/fiQiMy0HzsY/maxresdefault.jpg",
        "publishDate": "2022-03-25T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "8"
        ],
        "authors": [
          "31"
        ]
      },
      {
        "id": "220",
        "title": "Introduction to Performance",
        "content": "Learn about using system tracing and sampling profiling to debug performance issues in apps.",
        "url": "https://www.youtube.com/watch?v=_5LgIrd4O5g&list=PLWz5rJ2EKKc-xjSI-rWn9SViXivBhQUnp",
        "headerImageUrl": "https://i3.ytimg.com/vi/_5LgIrd4O5g/maxresdefault.jpg",
        "publishDate": "2021-07-18T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "7"
        ],
        "authors": [
          "37"
        ]
      },
      {
        "id": "221",
        "title": "Introduction to Hilt",
        "content": "Learn how to add and use Hilt for dependency injection in your Android app, best practices for testing with Hilt, and more advanced content.",
        "url": "https://www.youtube.com/watch?v=mnMCgjuMJPA&list=PLWz5rJ2EKKc_9Qo-RBRYhVmME1iR4oeTK",
        "headerImageUrl": "https://i3.ytimg.com/vi/mnMCgjuMJPA/maxresdefault.jpg",
        "publishDate": "2021-08-22T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "8"
        ],
        "authors": [
          "23"
        ]
      },
      {
        "id": "222",
        "title": "Paging",
        "content": "Learn the basics of paging, from the core types to binding them to your UI elements.",
        "url": "https://www.youtube.com/watch?v=Pw-jhS-ucYA&list=PLWz5rJ2EKKc9L-fmWJLhyXrdPi1YKmvqS",
        "headerImageUrl": "https://i3.ytimg.com/vi/Pw-jhS-ucYA/maxresdefault.jpg",
        "publishDate": "2021-09-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "8"
        ],
        "authors": [
          "38"
        ]
      },
      {
        "id": "223",
        "title": "Introduction to Gradle and AGP Build APIs\n",
        "content": "Learn how to configure your build, customize the build process to your needs and how to write your own plugins to extend your build even further.",
        "url": "https://www.youtube.com/watch?v=mk0XBWenod8&list=PLWz5rJ2EKKc8fyNmwKXYvA2CqxMhXqKXX",
        "headerImageUrl": "https://i3.ytimg.com/vi/mk0XBWenod8/maxresdefault.jpg",
        "publishDate": "2021-11-15T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "5",
          "5"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "224",
        "title": "Google I/O",
        "content": "At I/O we released updates in Jetpack, Compose, Android Studio tooling, Large screens, Wear OS, Testing, and more! Get caught up on all the Android videos from I/O!",
        "url": "https://www.youtube.com/watch?v=D_mVOAXcrtc",
        "headerImageUrl": "https://i3.ytimg.com/vi/D_mVOAXcrtc/maxresdefault.jpg",
        "publishDate": "2021-05-17T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "1"
        ],
        "authors": []
      },
      {
        "id": "225",
        "title": "Android Dev Summit",
        "content": "At Android Dev Summit we released updates on privacy and security, large screens, Android 12, Google Play & Games, Building across screens, Jetpack Compose, Modern Android Development and more. Check out all the videos from ADS!",
        "url": "https://www.youtube.com/watch?v=WZgR5Yf1iq8",
        "headerImageUrl": "https://i3.ytimg.com/vi/WZgR5Yf1iq8/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "1"
        ],
        "authors": []
      },
      {
        "id": "226",
        "title": "Conveying state for Accessibility",
        "content": "In this episode of the Accessibility series, you can learn more about the StateDescription API, when to use stateDescription and contentDescription, and how to represent error states to the end user.",
        "url": "https://youtu.be/JvWM2PjLJls",
        "headerImageUrl": "https://i.ytimg.com/vi/JvWM2PjLJls/maxresdefault.jpg",
        "publishDate": "2021-11-30T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": [
          "39"
        ]
      },
      {
        "id": "227",
        "title": "Take your Gradle plugin to the next step",
        "content": "This third and last episode of the Gradle MAD Skills series teaches you how to get access to various build artifacts using the new Artifact API.",
        "url": "https://youtu.be/SB4QlngQQW0",
        "headerImageUrl": "https://i.ytimg.com/vi/SB4QlngQQW0/maxresdefault.jpg",
        "publishDate": "2021-11-29T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "5"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "228",
        "title": "How to write a Gradle plugin",
        "content": "In this second episode of the Gradle MAD Skills series, Murat explains how to write your own custom Gradle plugin.",
        "url": "https://youtu.be/LPzBVtwGxlo",
        "headerImageUrl": "https://i.ytimg.com/vi/LPzBVtwGxlo/maxresdefault.jpg",
        "publishDate": "2021-11-22T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "5"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "229",
        "title": "Convert YUV to RGB for CameraX Image Analysis",
        "content": "Learn about a new feature in CameraX to convert YUV, the format that CameraX produces, to RGB used for image analysis capabilities available in TensorFlow Lite, for example. Read the blog post for more information about these formats and how to use the new conversion feature.",
        "url": "https://medium.com/androiddevelopers/convert-yuv-to-rgb-for-camerax-imageanalysis-6c627f3a0292",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*cuOorbZgMbRvkSSGuDGccw.png",
        "publishDate": "2021-11-19T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "8",
          "18"
        ],
        "authors": [
          "40"
        ]
      },
      {
        "id": "230",
        "title": "AppCompat, Activity, and Fragment to support multiple back stacks",
        "content": "The 1.4.0 release of these libraries brings stable support for multiple back stacks.",
        "url": "https://developer.android.com/jetpack/androidx/releases/appcompat#1.4.0",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2021-11-17T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "8",
          "2"
        ],
        "authors": []
      },
      {
        "id": "231",
        "title": "Emoji2 adds support for modern emojis",
        "content": "The 1.0 stable release of Emoji2 allows you to use modern emojis in your app.",
        "url": "https://developer.android.com/jetpack/androidx/releases/emoji2#1.0.0",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2021-11-17T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "8",
          "2"
        ],
        "authors": []
      },
      {
        "id": "232",
        "title": "Lifecycle introduces lifecycle-aware coroutine APIs",
        "content": "The new 2.4 release of Lifecycle introduces repeatOnLifecycle and flowWithLifecycle.",
        "url": "https://developer.android.com/jetpack/androidx/releases/lifecycle#2.4.0",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2021-11-17T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "8",
          "4"
        ],
        "authors": []
      },
      {
        "id": "233",
        "title": "Paging release brings changes to LoadState",
        "content": "The new 3.1 release of Paging changes the behavior of LoadState.",
        "url": "https://developer.android.com/jetpack/androidx/releases/paging#3.1.0",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2021-11-17T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "8",
          "2"
        ],
        "authors": []
      },
      {
        "id": "234",
        "title": "Wear tiles released as 1.0 stable",
        "content": "The library that you use to build custom tiles for Wear OS devices is now stable.",
        "url": "https://developer.android.com/jetpack/androidx/releases/wear-tiles#1.0.0",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2021-11-17T00:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "8",
          "19"
        ],
        "authors": []
      },
      {
        "id": "235",
        "title": "About Custom Accessibility Actions",
        "content": "The accessibility series continues on with more information on how to create custom accessibility actions to make your apps more accessible. You can provide a custom action to the accessibility services and implement logic related to the action. For more information, check out the following episode!",
        "url": "https://youtu.be/wWDYIGk0Kdo",
        "headerImageUrl": "https://i.ytimg.com/vi/wWDYIGk0Kdo/maxresdefault.jpg",
        "publishDate": "2021-11-17T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": [
          "39"
        ]
      },
      {
        "id": "236",
        "title": "Improving App Startup: Lessons from the Facebook App",
        "content": "Improving app startup time is not a trivial task and requires a deep understanding of things that affect it. This year, the Android team and the Facebook app team have been working together on metrics and sharing approaches to improve app startup. Read more about the findings in this blog post.",
        "url": "https://android-developers.googleblog.com/2021/11/improving-app-startup-facebook-app.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-5VyrQpFJufM/YaVKxf_DanI/AAAAAAAALS4/ybeza_emDKoKP0gjiNkqfDS_ltwo0075ACLcBGAsYHQ/w1200-h630-p-k-no-nu/AppExcellence_Editorial_LessonsFromFBApp_4209x1253-01%2B%25281%2529%2B%25281%2529.png",
        "publishDate": "2021-11-16T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "7"
        ],
        "authors": []
      },
      {
        "id": "237",
        "title": "Gradle series kicks off",
        "content": "Murat introduces the Gradle series and everything you'll learn in it.",
        "url": "https://youtu.be/mk0XBWenod8",
        "headerImageUrl": "https://i.ytimg.com/vi/mk0XBWenod8/maxresdefault.jpg",
        "publishDate": "2021-11-15T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "5"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "238",
        "title": "Intro to Gradle and AGP",
        "content": "In the first episode of the Gradle MAD Skills series, Murat explains how the Android build system works, and how to configure your build.",
        "url": "https://youtu.be/GjPS4xDMmQY",
        "headerImageUrl": "https://i.ytimg.com/vi/GjPS4xDMmQY/maxresdefault.jpg",
        "publishDate": "2021-11-15T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "5"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "239",
        "title": "ADB Podcast episode 179 Hosts 3, Guests 0",
        "content": "Chet, Romain and Tor sit down to chat about the Android Developer Summit, and in particular all the new features arriving in Android Studio, along with a few other topics like Chet’s new jank stats library, the Android 12L release, and more.",
        "url": "https://adbackstage.libsyn.com/episode-178-hosts-3-guests-0",
        "headerImageUrl": "http://assets.libsyn.com/show/332855?height=250&width=250&overlay=true",
        "publishDate": "2021-11-15T00:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "5",
          "7",
          "13"
        ],
        "authors": [
          "31"
        ]
      },
      {
        "id": "240",
        "title": "The problem with emojis and how emoji2 can help out",
        "content": "Meghan wrote about the new emoji2 library that just became stable.",
        "url": "https://medium.com/androiddevelopers/support-modern-emoji-99f6dea8e57f",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*yAOOlpXKKUl5nWWsPkNb7g.png",
        "publishDate": "2021-11-12T00:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "8",
          "2"
        ],
        "authors": [
          "15"
        ]
      },
      {
        "id": "241",
        "title": "Paging Q&A",
        "content": "In this live session, TJ and Dustin answered your questions in the usual live Q&A format.",
        "url": "https://youtu.be/8i6vrlbIVCc",
        "headerImageUrl": "https://i.ytimg.com/vi/8i6vrlbIVCc/maxresdefault.jpg",
        "publishDate": "2021-11-11T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "242",
        "title": "Thanks for helping us reach 1M YouTube Subscribers",
        "content": "Thank you everyone for following the Now in Android series and everything the Android Developers YouTube channel has to offer. During the Android Developer Summit, our YouTube channel reached 1 million subscribers! Here’s a small video to thank you all.",
        "url": "https://youtu.be/-fJ6poHQrjM",
        "headerImageUrl": "https://i.ytimg.com/vi/-fJ6poHQrjM/maxresdefault.jpg",
        "publishDate": "2021-11-09T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "1"
        ],
        "authors": []
      },
      {
        "id": "243",
        "title": "Community tip on Paging",
        "content": "Tips for using the Paging library from the developer community",
        "url": "https://youtu.be/r5JgIyS3t3s",
        "headerImageUrl": "https://i.ytimg.com/vi/r5JgIyS3t3s/maxresdefault.jpg",
        "publishDate": "2021-11-08T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "244",
        "title": "Transformations and customisations in the Paging Library",
        "content": "A demonstration of different operations that can be performed with Paging. Transformations like inserting separators, when to create a new pager, and customisation options for consuming PagingData.",
        "url": "https://youtu.be/ZARz0pjm5YM",
        "headerImageUrl": "https://i.ytimg.com/vi/ZARz0pjm5YM/maxresdefault.jpg",
        "publishDate": "2021-11-01T00:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": [
          "38"
        ]
      },
      {
        "id": "245",
        "title": "New Compose for Wear OS codelab",
        "content": "In this codelab, you can learn how Wear OS can work with Compose, what Wear OS specific composables are available, and more!",
        "url": "https://developer.android.com/codelabs/compose-for-wear-os",
        "headerImageUrl": "https://developer.android.com/codelabs/compose-for-wear-os/img/4d28d16f3f514083.png",
        "publishDate": "2021-10-27T23:00:00.000Z",
        "type": "Codelab",
        "topics": [
          "3",
          "19"
        ],
        "authors": [
          "41"
        ]
      },
      {
        "id": "246",
        "title": "Building apps which are private by design",
        "content": "Sara N-Marandi, product manager, and Yacine Rezgui, developer relations engineer, provided guidelines and best practices on how to build apps that are private by design, covered new privacy features in Android 12 and previewed upcoming Android concepts.",
        "url": "https://youtu.be/hBVwr2ErQCw",
        "headerImageUrl": "https://i.ytimg.com/vi/hBVwr2ErQCw/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "11"
        ],
        "authors": []
      },
      {
        "id": "247",
        "title": "Memory Safety Tools",
        "content": "Serban Constantinescu, product manager, talked about the Memory Safety Tools that became available starting in Android 11 and have continued to evolve in Android 12. These tools can help address memory bugs and improve the quality and security of your application.",
        "url": "https://youtu.be/JqLcTFpXreg",
        "headerImageUrl": "https://i.ytimg.com/vi/JqLcTFpXreg/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "11"
        ],
        "authors": []
      },
      {
        "id": "248",
        "title": "Increasing User Transparency with Privacy Dashboard",
        "content": "Android is ever evolving in its quest to protect users’ privacy. In Android 12, the platform increases transparency by introducing Privacy Dashboard, which gives users a simple and clear timeline view of the apps that have accessed location, microphone and camera within the past 24 hours. ",
        "url": "https://medium.com/androiddevelopers/increasing-user-transparency-with-privacy-dashboard-23064f2d7ff6",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*cgaSAY9AvPWlndLimzIIzQ.png",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "11"
        ],
        "authors": [
          "15"
        ]
      },
      {
        "id": "249",
        "title": "The most unusual and interesting security issues addressed last year",
        "content": "Lilian Young, software engineer, presented a selection of the most unusual, intricate, and interesting security issues addressed in the last year. Developers and researchers are able to contribute to the security of the Android platform by submitting to the Android Vulnerability Rewards Program.",
        "url": "https://medium.com/androiddevelopers/now-in-android-50-ads-special-9934422f8dd1",
        "headerImageUrl": "https://miro.medium.com/max/1400/0*6h0XYdyki_1jfImJ",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "11"
        ],
        "authors": [
          "43"
        ]
      },
      {
        "id": "250",
        "title": "New Data Safety section in the Play Console",
        "content": "The new Data safety section will give you a simple way to showcase your app’s overall safety. It gives you a place to give users deeper insight into your app’s privacy and security practices, and explain the data your app may collect and why — all before users install.",
        "url": "https://youtu.be/J7TM0Yy0aTQ",
        "headerImageUrl": "https://i.ytimg.com/vi/J7TM0Yy0aTQ/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "11",
          "12"
        ],
        "authors": []
      },
      {
        "id": "251",
        "title": "Building Android UIs for any screen size",
        "content": "Clara Bayarri, engineering manager and Daniel Jacobson, product manager, talked about the state of the ecosystem, focusing on new design guidance, APIs, and tools to help you make the most of your UI on different screen sizes.",
        "url": "https://youtu.be/ir3LztqbeRI",
        "headerImageUrl": "https://i.ytimg.com/vi/ir3LztqbeRI/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "252",
        "title": "What's new for large screens & foldables",
        "content": "Emilie Roberts, Chrome OS developer advocate and Andrii Kulian, Android software engineer, introduced new features focused specifically on making apps look great on large screens, foldables, and Chrome OS. ",
        "url": "https://youtu.be/6-925K3hMHU",
        "headerImageUrl": "https://i.ytimg.com/vi/6-925K3hMHU/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "253",
        "title": "Enable great input support for all devices",
        "content": "Users expect seamless experiences when using keyboards, mice, and stylus. Emilie Roberts taught us how to handle common keyboard and mouse input events and how to get started with more advanced support like keyboard shortcuts, low-latency styluses, MIDI, and more.",
        "url": "https://youtu.be/piLEZYTc_4g",
        "headerImageUrl": "https://i.ytimg.com/vi/piLEZYTc_4g/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "254",
        "title": "Best practices for video apps on foldable devices",
        "content": "Francesco Romano, developer advocate, and Will Chan, product manager at Zoom explored new user experiences made possible by the foldable form factor, focusing on video conferencing and media applications. ",
        "url": "https://youtu.be/DBAek_P0nEw",
        "headerImageUrl": "https://i.ytimg.com/vi/DBAek_P0nEw/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2",
          "18"
        ],
        "authors": []
      },
      {
        "id": "255",
        "title": "Design beautiful apps on foldables and large screens",
        "content": "Liam Spradlin, design advocate, and Jonathan Koren, developer relations engineer, talked about how to design and test Android applications that look and feel great across device types and screen sizes, from tablets to foldables to Chrome OS.",
        "url": "https://youtu.be/DJeJIJKOUbI",
        "headerImageUrl": "https://i.ytimg.com/vi/DJeJIJKOUbI/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "256",
        "title": "12L and new Android APIs and tools for large screens",
        "content": "Dave Burke, vice president of engineering, wrote a post covering the developer preview of 12L, an upcoming feature drop that makes Android 12 even better on large screens. ",
        "url": "https://android-developers.googleblog.com/2021/10/12L-preview-large-screens.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-sjT5kFGiQtg/YXlpg0uByLI/AAAAAAAARJk/XHO_uo5bRJcMeQVm0Fn1wN-qe54FGI7MgCLcBGAsYHQ/w1200-h630-p-k-no-nu/12L-devices-hero.png",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2",
          "13"
        ],
        "authors": []
      },
      {
        "id": "257",
        "title": "New features in ML Kit: Text Recognition V2 & Pose Detections",
        "content": "Zongmin Sun, software engineer, and Valentin Bazarevsky, MediaPipe Engineer, talked about Text Recognition V2 & Pose Detection, recently-released features in ML Kit. ",
        "url": "https://youtu.be/9EKQ0UC04S8",
        "headerImageUrl": "https://i.ytimg.com/vi/9EKQ0UC04S8/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "8",
          "2"
        ],
        "authors": []
      },
      {
        "id": "258",
        "title": "How to retain users with Android backup and restore",
        "content": "In this talk, Martin Millmore, engineering manager, and Ruslan Tkhakokhov, software engineer, explored the benefits of transferring users’ data to a new device, using Backup and Restore to achieve that in a simple and secure way.",
        "url": "https://youtu.be/bg2drEhz1_s",
        "headerImageUrl": "https://i.ytimg.com/vi/bg2drEhz1_s/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "13"
        ],
        "authors": []
      },
      {
        "id": "259",
        "title": "Compatibility changes in Android 12",
        "content": "Developer relations engineers Kseniia Shumelchyk and Slava Panasenko talked about new Android 12 features and changes. They shared tools and techniques to ensure that apps are compatible with the next Android release and users can take advantage of new features, along with app developer success stories.",
        "url": "https://youtu.be/fCMJmV6nqGo",
        "headerImageUrl": "https://i.ytimg.com/vi/fCMJmV6nqGo/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "13"
        ],
        "authors": []
      },
      {
        "id": "260",
        "title": "Building great experiences for Novice Internet Users",
        "content": "Learn the principles to help craft great experiences for the novice Internet user segment from Mrinal Sharma, UX manager, and Amrit Sanjeev, developer relations engineer. They highlight the gap between nascent and tech savvy user segments and suggest strategies in areas to improve the overall user experience. Factors like low functional literacy, being multilingual by default, being less digitally confident, and having no prior internet experience requires that we rethink the way we build apps for these users.",
        "url": "https://youtu.be/Sf_TauUY4LE",
        "headerImageUrl": "https://i.ytimg.com/vi/Sf_TauUY4LE/maxresdefault.jpg",
        "publishDate": "2021-10-26T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "261",
        "title": "Android Basics in Kotlin course 🧑‍💻",
        "content": "Android Basics in Kotlin teaches people with no programming experience how to build simple Android apps. Since the first learning units were released in 2020, over 100,000 beginners have completed it! Today, we’re excited to share that the final unit has been released, and the full Android Basics in Kotlin course is now available.",
        "url": "https://android-developers.googleblog.com/2021/10/announcing-android-basics-in-kotlin.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-BmlW7k8RhME/YWRvsOes9aI/AAAAAAAAQ_g/FpFS6_new9Y7vdzP7P4RPs_x4WHVi4yxQCLcBGAsYHQ/w1200-h630-p-k-no-nu/Android-announcing-android-basics-in-Kotlin-course-16x9.png",
        "publishDate": "2021-10-20T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "10"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "262",
        "title": "Updated Widget docs",
        "content": "Widgets can make a huge impact on your user’s home screen! We updated the App Widgets documentation with the recent changes in the latest OS versions. New pages about how to create a simple widget, an advanced widget, and how to provide flexible widget layouts.",
        "url": "https://developer.android.com/guide/topics/appwidgets",
        "headerImageUrl": "https://www.gstatic.com/devrel-devsite/prod/vab7ee6e3641f10848d404faa598f256587df1a361a1e70cd114230c2961b73d9/android/images/lockup.svg",
        "publishDate": "2021-10-20T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "2"
        ],
        "authors": []
      },
      {
        "id": "263",
        "title": "Extend AGP by creating your own plugins",
        "content": "The Android Gradle Plugin (AGP) contains extension points for plugins to control build inputs and extend its functionality. Starting in version 7.0, AGP has a set of official, stable APIs that you can rely on. We also have a new documentation page that walks you through this and explains how to create your own plugins.",
        "url": "https://developer.android.com/studio/build/extend-agp",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2021-10-20T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "5",
          "5"
        ],
        "authors": []
      },
      {
        "id": "264",
        "title": "Revamped Compose Basics Codelab",
        "content": "If you’re planning to start learning Jetpack Compose, our modern toolkit for building native Android UI, it’s your lucky day! We just revamped the Basics Jetpack Compose codelab to help you learn the core concepts of Compose, and only with this, you’ll see how much it improves building Android UIs.",
        "url": "https://developer.android.com/codelabs/jetpack-compose-basics",
        "headerImageUrl": "https://i.ytimg.com/vi/k3jvNqj4m08/maxresdefault.jpg",
        "publishDate": "2021-10-20T23:00:00.000Z",
        "type": "Codelab",
        "topics": [
          "3"
        ],
        "authors": []
      },
      {
        "id": "265",
        "title": "Material components in Compose",
        "content": "We added a new Material Components and layouts page that goes over the different Material components in Compose such as backdrop, app bars, modal drawers, etc.!",
        "url": "https://developer.android.com/jetpack/compose/layouts/material",
        "headerImageUrl": "https://developer.android.com/images/jetpack/compose/layouts/material/material_components.png",
        "publishDate": "2021-10-20T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "3",
          "2"
        ],
        "authors": []
      },
      {
        "id": "266",
        "title": "How to implement a custom design system",
        "content": "How to implement a custom design system in Compose",
        "url": "https://developer.android.com/jetpack/compose/themes/custom",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2021-10-20T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "3",
          "2"
        ],
        "authors": []
      },
      {
        "id": "267",
        "title": "The anatomy of a theme",
        "content": "Understanding the anatomy of a Compose theme",
        "url": "https://developer.android.com/jetpack/compose/themes/anatomy",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2021-10-20T23:00:00.000Z",
        "type": "Docs 📑",
        "topics": [
          "3"
        ],
        "authors": []
      },
      {
        "id": "268",
        "title": "Paging 📑  Displaying data and its loading state",
        "content": "In the third episode of the Paging video series, TJ adds a local cache to pull from and refresh only when necessary, making use of Room . The local cache acts as the single source of truth for paging data.",
        "url": "https://www.youtube.com/watch?v=OHH_FPbrjtA",
        "headerImageUrl": "https://i.ytimg.com/vi/OHH_FPbrjtA/maxresdefault.jpg",
        "publishDate": "2021-10-17T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "9",
          "2"
        ],
        "authors": [
          "38"
        ]
      },
      {
        "id": "269",
        "title": "Data safety in the Play Console 🔒",
        "content": "Google Play is rolling out the Data safety form in the Google Play Console. With the new Data safety section, developers will now have a transparent way to show users if and how they collect, share, and protect user data, before users install an app.\nRead the blog post to learn more about how to submit your app information in Play Console, how to get prepared, and what your users will see in your app’s store listing starting February.",
        "url": "https://android-developers.googleblog.com/2021/10/launching-data-safety-in-play-console.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-Zde9ioLE3SY/YWh7qiquXKI/AAAAAAAARCU/m6D-qJJe6QowYPcDWUtb3-YzFGn9xIaUwCLcBGAsYHQ/w1200-h630-p-k-no-nu/Android-get-ready-to-sumbit-your-data-safety-secton-social.png",
        "publishDate": "2021-10-17T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "11",
          "12"
        ],
        "authors": [
          "10"
        ]
      },
      {
        "id": "270",
        "title": "Honor every photo - How cameras capture images",
        "content": "Episode 177: Honor every photon. In this episode, Chet, Roman, and Tor have a chat with Bart Wronski from the Google Research team, discussing the camera pipeline that powers the Pixel phones. How cameras capture images, how the algorithms responsible for Pixel’s beautiful images, HDR+ or Night Sight mode works, and more!",
        "url": "https://adbackstage.libsyn.com/episode-177-honor-every-photon",
        "headerImageUrl": "http://assets.libsyn.com/show/332855?height=250&width=250&overlay=true",
        "publishDate": "2021-10-17T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "18"
        ],
        "authors": [
          "31"
        ]
      },
      {
        "id": "271",
        "title": "Accessibility series 🌐 - Touch targets",
        "content": "The accessibility series continues on with more information on how to follow basic accessibility principles to make sure that your app can be used by as many users as possible.\nIn general, you should ensure that interactive elements have a width and height of at least 48dp! In the touch targets episode, you’ll learn about a few ways in which you can make this happen.",
        "url": "https://www.youtube.com/watch?v=Dqqbe8IFBA4",
        "headerImageUrl": "https://i.ytimg.com/vi/Dqqbe8IFBA4/maxresdefault.jpg",
        "publishDate": "2021-10-16T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "14"
        ],
        "authors": [
          "39"
        ]
      },
      {
        "id": "272",
        "title": "Using the CameraX Exposure Compensation API",
        "content": "This blog post by Wenhung Teng talks about how to use the CameraX Exposure Compensation that makes it much simpler to quickly take images with exceptional quality.",
        "url": "https://medium.com/androiddevelopers/using-camerax-exposure-compensation-api-11fd75785bf",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*zinEvf1keSZYuZojr31ehQ.png",
        "publishDate": "2021-10-12T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "18"
        ],
        "authors": [
          "44"
        ]
      },
      {
        "id": "273",
        "title": "Compose for Wear OS in Developer preview ⌚",
        "content": "We’re bringing the best of Compose to Wear OS as well, with built-in support for Material You to help you create beautiful apps with less code. Read the following article to review the main composables for Wear OS we’ve built and point you towards resources to get started using them.",
        "url": "https://android-developers.googleblog.com/2021/10/compose-for-wear-os-now-in-developer.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-RkL3Yokn3XE/YWWmbuX8E7I/AAAAAAAAQ_o/CEmNJ5_mfq0kScxkFGoMpf1BlU5-uBHjACLcBGAsYHQ/w1200-h630-p-k-no-nu/Android-compose-for-wear-os-now-in-dev-review-header-dark.png",
        "publishDate": "2021-10-11T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "19",
          "3"
        ],
        "authors": [
          "41"
        ]
      },
      {
        "id": "274",
        "title": "Paging 📑  How to fetch data and bind the PagingData to the UI",
        "content": "The series on Paging continues on with more content! In the second episode, TJ shows how to fetch data and bind the PagingData to the UI, including headers and footers.",
        "url": "https://www.youtube.com/watch?v=C0H54K63Lww",
        "headerImageUrl": "https://i.ytimg.com/vi/C0H54K63Lww/maxresdefault.jpg",
        "publishDate": "2021-10-10T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": [
          "38"
        ]
      },
      {
        "id": "275",
        "title": "Room adds support for Kotlin Symbol Processing",
        "content": "Yigit Boyar wrote the story about how Room added support for Kotlin Symbol Processing (KSP). Spoiler: it wasn’t easy, but it was definitely worth it.",
        "url": "https://medium.com/androiddevelopers/room-kotlin-symbol-processing-24808528a28e",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*yM7Lf4dC_hwse6YmoCO4uQ.png",
        "publishDate": "2021-10-09T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "9"
        ],
        "authors": [
          "34"
        ]
      },
      {
        "id": "276",
        "title": "Apply special effects to images with the CameraX Extensions API",
        "content": "Have you ever wanted to apply special effects such as HDR or Night mode when taking pictures from your app? CameraX is here to help you! In this article by Charcoal Chen, learn how to do that using the new ExtensionsManager available in the camera-extensions Jetpack library. ",
        "url": "https://medium.com/androiddevelopers/apply-special-effects-to-images-with-the-camerax-extensions-api-d1a169b803d3",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*GZmhCFMCrG4L_mOtwSb0zA.png",
        "publishDate": "2021-10-06T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "18"
        ],
        "authors": [
          "45"
        ]
      },
      {
        "id": "277",
        "title": "Wear OS Jetpack libraries now in stable",
        "content": "The Wear OS Jetpack libraries are now in stable.",
        "url": "https://android-developers.googleblog.com/2021/09/wear-os-jetpack-libraries-now-in-stable.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-9zeEGNCG_As/YUD1UO_3kkI/AAAAAAAAQ8k/tCFBpTCwU4MEQHQNB9XzTOXSf6hd9TkQQCLcBGAsYHQ/w1200-h630-p-k-no-nu/image1.png",
        "publishDate": "2021-09-14T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "8",
          "19"
        ],
        "authors": [
          "41"
        ]
      },
      {
        "id": "278",
        "title": "Android Dev Summit returns on October 27-28, 2021! 📆",
        "content": "Join us October 27–28 for Android Dev Summit 2021! The show kicks off at 10 AM PST on October 27 with The Android Show: a technical keynote where you’ll hear all the latest developer news and updates. From there, we have over 30 sessions on a range of technical Android development topics, and we’ll be answering your #AskAndroid questions live.",
        "url": "https://developer.android.com/dev-summit",
        "headerImageUrl": "https://developer.android.com/dev-summit/images/android-dev-summit-2021.png",
        "publishDate": "2021-10-05T23:00:00.000Z",
        "type": "Event 📆",
        "topics": [
          "1"
        ],
        "authors": []
      },
      {
        "id": "279",
        "title": "Android 12 is live in AOSP! 🤖",
        "content": "We released Android 12 and pushed it to the Android Open Source Project (AOSP). It will be coming to devices later on this year. Thank you for your feedback during the beta.\nAndroid 12 introduces a new design language called Material You along with redesigned widgets, notification UI updates, stretch overscroll, and app launch splash screens. We reduced the CPU time used by core system services, added performance class device capabilities, made ML accelerator drivers updatable outside of platform releases, and prevented apps from launching foreground services from the background and using notification trampolines to improve performance. The new Privacy Dashboard, approximate location, microphone and camera indicators/toggles, and nearby device permissions give users more insight into and control over privacy. We improved the user experience with a unified API for rich content insertion, compatible media transcoding, easier blurs and effects, AVIF image support, enhanced haptics, new camera effects/capabilities, improved native crash debugging, support for rounded screen corners, Play as you download, and Game Mode APIs.",
        "url": "https://android-developers.googleblog.com/2021/10/android-12-is-live-in-aosp.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-7dVmEfR3mJs/YVst2TdY16I/AAAAAAAAK3I/pLnt0r5S-pIaJwcSNsNBqT8w2Y4Ej0yaQCLcBGAsYHQ/w1200-h630-p-k-no-nu/Android%2B12.jpeg",
        "publishDate": "2021-10-03T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "13"
        ],
        "authors": [
          "14"
        ]
      },
      {
        "id": "280",
        "title": "Improved Google Play Console user management 🧑‍💼",
        "content": "The user and permission tools in Play Console have a new, decluttered interface and new team management features, making it easier to make sure every team member has the right set of permissions to fulfill their responsibilities without overexposing unrelated business data.\nWe’ve rewritten permission names and descriptions, clarified differentiation between account and app-level permissions, added new search, filtering, and batch-editing capabilities, and added the ability to export this information to a CSV file. In addition, Play Console users can request access to actions with a justification, and we’ve introduced permission groups to make it easier to assign multiple permissions at once to users that share the same or similar roles.",
        "url": "https://android-developers.googleblog.com/2021/09/improved-google-play-console-user.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-vw3eaKdwzVU/YUjvyJ6zy2I/AAAAAAAAQ9s/m39byf56P8Icog5e5TgCbu9et0VCZh1iACLcBGAsYHQ/w1200-h630-p-k-no-nu/PlayConsole-revamped-user-management-01.png",
        "publishDate": "2021-09-20T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "12"
        ],
        "authors": [
          "46"
        ]
      },
      {
        "id": "281",
        "title": "Making Permissions auto-reset available to billions more devices 🔐",
        "content": "Android 11 introduced permission auto-reset, automatically resetting an app’s runtime permissions when it isn’t used for a few months. In December 2021, we are starting to roll this feature out to devices with Google Play services running Android 6.0 (API level 23) or higher for apps targeting Android 11 (API level 30) or higher. Users can manually enable permission auto-reset for apps targeting API levels 23 to 29.\nSome apps and permissions are automatically exempted from revocation, like active Device Administrator apps used by enterprises, and permissions fixed by enterprise policy. If your app is expected to work primarily in the background without user interaction, you can ask the user to prevent the system from resetting your app’s permissions.",
        "url": "https://android-developers.googleblog.com/2021/09/making-permissions-auto-reset-available.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-W3UAh-gyf3Y/YUJehjKWQjI/AAAAAAAAQ84/zkURLgqMRa4VZK3Is3ENNYG_OjXJxx2pgCLcBGAsYHQ/w1200-h630-p-k-no-nu/Android-making-permissions-auto-reset-social-v2.png",
        "publishDate": "2021-09-16T23:00:00.000Z",
        "type": "DAC - Android version features",
        "topics": [
          "11"
        ],
        "authors": [
          "47"
        ]
      },
      {
        "id": "282",
        "title": "Migrating from Dagger to Hilt",
        "content": "While you will eventually want to migrate all your existing Dagger modules over to Hilt’s built in components, you can start by migrating application-wide components to Hilt’s singleton component. This episode explains how.",
        "url": "https://www.youtube.com/watch?v=Xt1_3Nq4lD0&t=15s",
        "headerImageUrl": "https://i.ytimg.com/vi/Xt1_3Nq4lD0/hqdefault.jpg",
        "publishDate": "2021-09-19T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "4"
        ],
        "authors": [
          "48"
        ]
      },
      {
        "id": "283",
        "title": "ADB Podcast Episode 175: Creating delightful user experiences with Lottie animations",
        "content": "In this episode, Chet, Romain and Tor have a chat with Gabriel Peal from Tonal, well known for his contributions to the Android community on projects such as Mavericks and Lottie. They talked about Lottie and how it helps designers and developers deliver more delightful user experiences by taking complex animations designed in specialized authoring tools such as After Effects, and rendering them efficiently on mobile devices. They also explored the challenges of designing and implementing a rendering engine such as Lottie.",
        "url": "http://adbackstage.libsyn.com/episode-175-lottie",
        "headerImageUrl": "http://assets.libsyn.com/show/332855?height=250&width=250&overlay=true",
        "publishDate": "2021-09-13T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "2"
        ],
        "authors": [
          "31"
        ]
      },
      {
        "id": "284",
        "title": "Hilt extensions",
        "content": "This episode explains how to write your own Hilt Extensions. Hilt Extensions allow you to extend Hilt support to new libraries. Extensions can be created for common patterns in projects, to support non-standard member injection, mirroring bindings, and more.",
        "url": "https://medium.com/androiddevelopers/hilt-extensions-in-the-mad-skills-series-f2ed6fcba5fe",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*a_ZJwMHs17SmEFr3uEbxDg.png",
        "publishDate": "2021-09-12T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "4"
        ],
        "authors": [
          "49"
        ]
      },
      {
        "id": "285",
        "title": "Labeling images for Accessibility",
        "content": "This Accessibilities series episode covers labeling images for accessibility, such as content descriptions for ImageViews and ImageButtons.",
        "url": "https://youtu.be/O2DeSITnzFk",
        "headerImageUrl": "https://i.ytimg.com/vi/O2DeSITnzFk/maxresdefault.jpg",
        "publishDate": "2021-09-09T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "14"
        ],
        "authors": [
          "28"
        ]
      },
      {
        "id": "286",
        "title": "ADB Podcast Episode 174: Compose in Android Studio",
        "content": "In this episode, Tor and Nick are joined by Chris Sinco, Diego Perez and Nicolas Roard to discuss the features added to Android Studio for Jetpack Compose. Tune in as they discuss the Compose preview, interactive preview, animation inspector, and additions to the Layout inspector along with their approach to creating tooling to support Compose’s code-centric system.",
        "url": "http://adbackstage.libsyn.com/episode-174-compose-tooling",
        "headerImageUrl": "http://assets.libsyn.com/content/110962067?height=250&width=250&overlay=true",
        "publishDate": "2021-09-08T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "5",
          "3"
        ],
        "authors": [
          "32"
        ]
      },
      {
        "id": "287",
        "title": "Hilt under the hood",
        "content": "This episode dives into how the Hilt annotation processors generate code, and how the Hilt Gradle plugin works behind the scenes to improve the overall experience when using Hilt with Gradle.",
        "url": "https://medium.com/androiddevelopers/mad-skills-series-hilt-under-the-hood-9d89ee227059",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*a_ZJwMHs17SmEFr3uEbxDg.png",
        "publishDate": "2021-09-07T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "4"
        ],
        "authors": [
          "50"
        ]
      },
      {
        "id": "288",
        "title": "Trackr comes to the Big Screen",
        "content": "A blog post on Trackr, a sample task management app where we showcase Modern Android Development best practices. This post takes you through how applying Material Design and responsive patterns produced a more refined and intuitive user experience on large screen devices.",
        "url": "https://medium.com/androiddevelopers/trackr-comes-to-the-big-screen-9f13c6f927bf",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*678DlYtu4G7wFrq30FQ7Mw.png",
        "publishDate": "2021-09-06T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2"
        ],
        "authors": [
          "51"
        ]
      },
      {
        "id": "289",
        "title": "Accessibility services and the Android Accessibility model",
        "content": "This Accessibilities series episode covers accessibility services like TalkBack, Switch Access and Voice Access and how they help users interact with your apps. Android’s accessibility framework allows you to write one app and the framework takes care of providing the information needed by different accessibility services.",
        "url": "https://youtu.be/LxKat_m7mHk",
        "headerImageUrl": "https://i.ytimg.com/vi/LxKat_m7mHk/maxresdefault.jpg",
        "publishDate": "2021-09-02T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "14"
        ],
        "authors": [
          "39"
        ]
      },
      {
        "id": "290",
        "title": "New Accessibility Pathway",
        "content": "Want even more accessibility? You are in luck, check out this entire new learning pathway aimed at teaching you how to make your app more accessible.",
        "url": "https://developer.android.com/courses/pathways/make-your-android-app-accessible",
        "headerImageUrl": "https://developers.google.com/profile/badges/playlists/make-your-android-app-accessible/badge.svg",
        "publishDate": "2021-08-31T23:00:00.000Z",
        "type": "",
        "topics": [
          "14"
        ],
        "authors": []
      },
      {
        "id": "291",
        "title": "Jetpack Compose 1.0 stable is released",
        "content": "Jetpack Compose, Android’s modern, native UI toolkit is now stable and ready for you to adopt in production. It interoperates with your existing app, integrates with existing Jetpack libraries, implements Material Design with straightforward theming, supports lists with Lazy components using minimal boilerplate, and has a powerful, extensible animation system.",
        "url": "https://android-developers.googleblog.com/2021/07/jetpack-compose-announcement.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-9MiK78CFMLM/YQFurOq9AII/AAAAAAAAQ1A/lKj5GiDnO_MkPLb72XqgnvD5uxOsHO-eACLcBGAsYHQ/w1200-h630-p-k-no-nu/Android-Compose-1.0-header-v2.png",
        "publishDate": "2021-07-27T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "3"
        ],
        "authors": [
          "52"
        ]
      },
      {
        "id": "292",
        "title": "Android Studio Artic Fox stable is released",
        "content": "Android Studio Arctic Fox is now available in the stable release channel. Arctic Fox brings Jetpack Compose to life with Compose Preview, Deploy Preview, Compose support in the Layout Inspector, and Live Editing of literals. Compose Preview works with the @Preview annotation to let you instantly see the impact of changes across multiple themes, screen sizes, font sizes, and more. Deploy Preview deploys snippets of your Compose code to a device or emulator for quick testing. Layout inspector now works with apps written fully in Compose as well as apps that have Compose alongside Views, allowing you to explore your layouts and troubleshoot. With Live Edit of literals, you can edit literals such as strings, numbers, booleans, etc. and see the immediate results change in previews, the emulator, or on a physical device — all without having to compile.\n",
        "url": "https://android-developers.googleblog.com/2021/07/android-studio-arctic-fox-202031-stable.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-cmcRT5BGOTY/YQBKC6asA0I/AAAAAAAAQzg/hZrde9Sgx881Wdf-c__VMkTvsKoVjOwsACLcBGAsYHQ/w1200-h630-p-k-no-nu/Arctic_Fox_Splash_2x%2B%25281%2529.png",
        "publishDate": "2021-07-27T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "5",
          "3"
        ],
        "authors": [
          "53"
        ]
      },
      {
        "id": "293",
        "title": "User control, privacy, security, and safety",
        "content": "Play announced new updates to bolster user control, privacy, and security. The post covered advertising ID updates, including zeroing out the advertising ID when users opt out of interest-based advertising or ads personalization, the developer preview of the app set ID, enhanced protection for kids, and policy updates around dormant accounts and users of the AccessibilityService API.",
        "url": "https://android-developers.googleblog.com/2021/07/announcing-policy-updates-to-bolster.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-pWCVY7BR-z8/YQAzb9zCZsI/AAAAAAAAQzY/2-OetxLvjOUYhHlTFJNw5JSm_BVjkI0VwCLcBGAsYHQ/s0/Untitled.png",
        "publishDate": "2021-07-27T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "12"
        ],
        "authors": [
          "10"
        ]
      },
      {
        "id": "294",
        "title": "Identify performance bottlenecks using system trace",
        "content": "System trace profiling within Android Studio with a detailed walkthrough of app startup performance.",
        "url": "https://www.youtube.com/watch?v=aUrqx9AnDUg",
        "headerImageUrl": "https://i.ytimg.com/vi/aUrqx9AnDUg/hqdefault.jpg",
        "publishDate": "2021-07-25T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "7",
          "5"
        ],
        "authors": [
          "37"
        ]
      },
      {
        "id": "295",
        "title": "Testing in Compose",
        "content": "ADB released episode #171, part of our continuing series on Jetpack Compose. In this episode, Nick and Romain are joined by Filip Pavlis, Jelle Fresen & Jose Alcérreca to talk about Testing in Compose. They discuss how Compose’s testing APIs were developed hand-in-hand with the UI toolkit, making them more deterministic and opening up new possibilities like manipulating time. They go on to discuss the semantics tree, interop testing, screenshot testing and the possibilities for host-side testing.",
        "url": "https://adbackstage.libsyn.com/episode-171-compose-testing",
        "headerImageUrl": "http://assets.libsyn.com/content/108505820?height=250&width=250&overlay=true",
        "publishDate": "2021-06-29T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "3",
          "6"
        ],
        "authors": [
          "54"
        ]
      },
      {
        "id": "296",
        "title": "DataStore reached release candidate status",
        "content": "DataStore has reached release candidate status meaning the 1.0 stable release is right around the corner!",
        "url": "https://developer.android.com/topic/libraries/architecture/datastore",
        "headerImageUrl": "https://developer.android.com/images/social/android-developers.png",
        "publishDate": "2021-06-29T23:00:00.000Z",
        "type": "Jetpack release 🚀",
        "topics": [
          "9"
        ],
        "authors": []
      },
      {
        "id": "297",
        "title": "Scope Storage Myths",
        "content": "Apps will be required to update their targetSdkVersion to API 30 in the second half of the year. That means your app will be required to work with Scoped Storage. In this blog post, Nicole Borrelli busts some Scope storage myths in a Q&A format.",
        "url": "https://medium.com/androiddevelopers/scope-storage-myths-ca6a97d7ff37",
        "headerImageUrl": "https://miro.medium.com/max/1200/1*csWzYUmYq_1HQsqBWk3OTA.jpeg",
        "publishDate": "2021-06-27T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "9",
          "11"
        ],
        "authors": [
          "55"
        ]
      },
      {
        "id": "298",
        "title": "Navigation with Multiple back stacks",
        "content": "As part of the rercommended Material pattern for bottom-navigation, the Jetpack Navigation library makes it easy to implement navigation with multiple back-stacks",
        "url": "https://medium.com/androiddevelopers/navigation-multiple-back-stacks-6c67ba41952f",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*v7S7LKg4TlrMRlneeP224Q.jpeg",
        "publishDate": "2021-06-14T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "299",
        "title": "Build sophisticated search features with AppSearch",
        "content": "AppSearch is an on-device search library which provides high performance and feature-rich full-text search functionality. Learn how to use the new Jetpack AppSearch library for doing high-performance on-device full text searches.",
        "url": "https://android-developers.googleblog.com/2021/06/sophisticated-search-with-appsearch-in-jetpack.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-PmN4MS50wvo/YMj-HmY4N2I/AAAAAAAAQoQ/5eCx8CU1HgAlFQnQ55IOb_CCVRhe8eGewCLcBGAsYHQ/w1200-h630-p-k-no-nu/AppSearch.jpg",
        "publishDate": "2021-06-13T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "8",
          "2"
        ],
        "authors": [
          "56"
        ]
      },
      {
        "id": "300",
        "title": "ADB Podcast Episode 167: Jetpack Compose Layout",
        "content": "In this second episode of our mini-series on Jetpack Compose (AD/BC), Nick and Romain are joined by Anastasia Soboleva, George Mount and Mihai Popa to talk about Compose’s layout system. They explain how the Compose layout model works and its benefits, introduce common layout composables, discuss how writing your own layout is far simpler than Views, and how you can even animate layout.",
        "url": "https://adbackstage.libsyn.com/episode-167-jetpack-compose-layout",
        "headerImageUrl": "http://assets.libsyn.com/content/105399023?height=250&width=250&overlay=true",
        "publishDate": "2021-06-13T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "3"
        ],
        "authors": [
          "57"
        ]
      },
      {
        "id": "301",
        "title": "Create an application CoroutineScope using Hilt",
        "content": "Learn how to create an applicatioon-scoped CoroutineScope using Hilt, and how to inject it as a dependency.",
        "url": "https://medium.com/androiddevelopers/create-an-application-coroutinescope-using-hilt-dd444e721528",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*MgDtM-AJmc2m2hg5chkflg.png",
        "publishDate": "2021-06-09T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "4"
        ],
        "authors": [
          "23"
        ]
      },
      {
        "id": "302",
        "title": "Android 12 Beta 2 Update",
        "content": "The second Beta of Android 12 has just been released for you to try. Beta 2 adds new privacy features like the Privacy Dashboard and continues our work of refining the release.",
        "url": "https://android-developers.googleblog.com/2021/06/android-12-beta-2-update.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-tLt-TVPqpjA/YKMRwRPMfjI/AAAAAAAAQik/JNtMesFZ2i87RyBACHAVEC14CvcU7G__wCLcBGAsYHQ/w1200-h630-p-k-no-nu/Screen%2BShot%2B2021-05-17%2Bat%2B9.00.30%2BPM.png",
        "publishDate": "2021-06-08T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "13"
        ],
        "authors": [
          "14"
        ]
      },
      {
        "id": "303",
        "title": "Top 3 things in Android 12  | Android @ Google I/O '21",
        "content": "Did you miss the latest in Android 12 at Google I/O 2021? Android Software Engineer Chet Haase will recap the top three themes in Android 12 from this year’s Google I/O!",
        "url": "https://www.youtube.com/watch?v=tvf1wmD5H0M",
        "headerImageUrl": "https://i.ytimg.com/vi/tvf1wmD5H0M/maxresdefault.jpg",
        "publishDate": "2021-06-08T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "13"
        ],
        "authors": [
          "31"
        ]
      },
      {
        "id": "304",
        "title": "ADB Podcast Episode 166: Security Deposit",
        "content": "In this episode, Chad and Jeff from the Android Security team join Tor and Romain to talk about… security. They explain what the platform does to help preserve user trust and device integrity, why it sometimes means restricting existing APIs, and touch on what apps can do or should worry about.",
        "url": "http://adbackstage.libsyn.com/episode-166-security-deposit",
        "headerImageUrl": "http://assets.libsyn.com/show/332855?height=250&width=250&overlay=true",
        "publishDate": "2021-06-07T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "11"
        ],
        "authors": [
          "32"
        ]
      },
      {
        "id": "305",
        "title": "Multiple Back Stacks",
        "content": "A deep dive into multiple back stacks and some of the work it took to make this feature happen in Fragments and Navigation",
        "url": "https://medium.com/androiddevelopers/multiple-back-stacks-b714d974f134",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*5-lbc-YBJlZnxVFPvNMPAQ.png",
        "publishDate": "2021-06-06T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2"
        ],
        "authors": [
          "58"
        ]
      },
      {
        "id": "306",
        "title": "Building across devices | Android @ Google I/O '21",
        "content": "Did you miss the latest in Building across screens at Google I/O 2021? Product Manager Diana Wong will recap the top three announcements from this year’s Google I/O!",
        "url": "https://www.youtube.com/watch?v=O5oRiIUk_F4",
        "headerImageUrl": "https://i.ytimg.com/vi/O5oRiIUk_F4/maxresdefault.jpg",
        "publishDate": "2021-06-02T23:00:00.000Z",
        "type": "Video 📺",
        "topics": [
          "2"
        ],
        "authors": [
          "59"
        ]
      },
      {
        "id": "307",
        "title": "Navigation in Feature Modules",
        "content": "Feature modules delivered with Play Feature delivery at not downloadedd at install time, but only when the app requestss them. Learn how to use the dynamic features navigation library to include the graph from the feature module.",
        "url": "https://medium.com/androiddevelopers/navigation-in-feature-modules-322ac3d79334",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*v7S7LKg4TlrMRlneeP224Q.jpeg",
        "publishDate": "2021-06-01T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "2"
        ],
        "authors": [
          "25"
        ]
      },
      {
        "id": "308",
        "title": "ADB Podcast Episode 165: Material Witnesses",
        "content": "In this episode, Chet and Romain chattedd with Hunter and Nick from the Material Design team about recent additions and improvements to the Material Design Component libraries: transitions, motion theming, Compose, large screens support and guidance, etc.",
        "url": "http://adbackstage.libsyn.com/episode-165-material-witnesses",
        "headerImageUrl": "http://assets.libsyn.com/show/332855?height=250&width=250&overlay=true",
        "publishDate": "2021-06-01T23:00:00.000Z",
        "type": "Podcast 🎙",
        "topics": [
          "2"
        ],
        "authors": [
          "31"
        ]
      },
      {
        "id": "309",
        "title": "Grow Your Indie Game with Help From Google Play",
        "content": "Google Play is opening submissions for two of our annual developer programs - the Indie Games Accelerator and the Indie Games Festival. These programs are designed to help small games studios grow on Google Play, no matter what stage they are in",
        "url": "https://developers.googleblog.com/2021/06/grow-your-indie-game-with-help-from-google-play.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-MNEblg7_8fA/YK7lludSxJI/AAAAAAAAKQM/_YIT15giTk42oPXWIhK6l2FBVt5PCFKTwCLcBGAsYHQ/w1200-h630-p-k-no-nu/Joint_Announcement_Android%2BDevelopers%2BBlog_Header_1200x600%2B%25282%2529.png",
        "publishDate": "2021-05-31T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "12",
          "17"
        ],
        "authors": [
          "60"
        ]
      },
      {
        "id": "310",
        "title": "Untrusted Touch Events in Android",
        "content": "Android 12 prevents touch events from being deliverred if these touches first pass through a window from a different app to ensure users can see what they are interacting with. Learn about alternatives, to see if your app will be affected and how you can test to see if your app will be impacted.",
        "url": "https://medium.com/androiddevelopers/untrusted-touch-events-2c0e0b9c374c",
        "headerImageUrl": "https://miro.medium.com/max/1400/1*lvwe7v_bcNsNXI_7ltFkJA.jpeg",
        "publishDate": "2021-05-25T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "13"
        ],
        "authors": [
          "15"
        ]
      },
      {
        "id": "311",
        "title": "Android @ Google I/O: 3 things to know in Modern Android Development",
        "content": "This year’s Google I/O brought lots of updates for Modern Android Development. Learn about the top 3 things you should know.",
        "url": "https://android-developers.googleblog.com/2021/05/mad-spotlight.html",
        "headerImageUrl": "https://1.bp.blogspot.com/-8cqMFObMeko/YK5RbJ7Yr_I/AAAAAAAAQkw/Iw4_hRZwa7QD1CmVGnZUZ4NjYowXZadTgCLcBGAsYHQ/w1200-h630-p-k-no-nu/Android_PostIO_blog-MAD.png",
        "publishDate": "2021-05-24T23:00:00.000Z",
        "type": "Article 📚",
        "topics": [
          "1"
        ],
        "authors": [
          "61"
        ]
      }
    ]
""".trimIndent()
