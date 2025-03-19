package com.bingebuddy.app.core.designsystem

import androidx.compose.runtime.Composable

expect class AppButton {

    @Composable
    fun Primary(label: String, onClick: () -> Unit)
}