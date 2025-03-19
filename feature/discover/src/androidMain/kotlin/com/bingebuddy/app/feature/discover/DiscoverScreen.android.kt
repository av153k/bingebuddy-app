package com.bingebuddy.app.feature.discover

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

actual class DiscoverScreen {
    @Composable
    actual fun View() {
        Scaffold {
            innerPadding -> Text("Discover from Android", modifier = Modifier.padding(innerPadding))
        }
    }

}