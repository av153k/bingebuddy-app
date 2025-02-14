### 🚧⚠️ UNDER HEAVY DEVELOPMENT ⚠️🚧

## Bingebuddy

![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-yellow?logo=kotlin) ![Static Badge](https://img.shields.io/badge/Development-In_Progress-orange?logo=jetpackcompose)

This is a [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html) project targeting Android, iOS, Desktop. This is more like my journey while learning kotlin multiplatform. It uses [The Movie Database](https://www.themoviedb.org/) for showing all the information related to movies and TV shows.

### 💻Tech stack
- Kotlin
- Kotlin Multiplatform
- Jetpack Compose
- SwiftUI

### 🔌API Used

- The Movie Database - [The Movie Database API](https://www.themoviedb.org/documentation/api)

### 🖼️Design inspirations

- [Movie Streaming App, UI Kit](https://dribbble.com/shots/22427925-Movie-Streaming-App-UI-Kit)
- [Movie Streaming Mobile IOs App](https://dribbble.com/shots/20852069-Movie-Streaming-Mobile-IOS-App)

### 📂Folder structure

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.  
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.  
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,  
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,   
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/shared` is for the code that will be shared between all targets in the project.  
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here too.

* `/ui/designsystem` is for code related to design system of this project. Since I will try to implement atomic design system as much as I can in this app, this folder will contain atoms, molecules, app themes(colors, types and shapes)



Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…