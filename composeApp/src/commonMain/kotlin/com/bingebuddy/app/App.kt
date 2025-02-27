package com.bingebuddy.app

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview

import com.bingebuddy.app.feature.discover.DiscoverScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        DiscoverScreen()
    }
}