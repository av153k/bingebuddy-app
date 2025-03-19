package com.bingebuddy.app.core.designsystem

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable


actual class AppButton {

    @Composable
    actual fun Primary(label: String, onClick: () -> Unit) {
            Button(
                onClick = onClick,
                content = { Text(label) }
            )
    }
}