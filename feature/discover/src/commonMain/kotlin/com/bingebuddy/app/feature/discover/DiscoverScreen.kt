package com.bingebuddy.app.feature.discover

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
expect fun DiscoverScreen()


expect class DiscoverScreen {

    @Composable
    fun View()

}