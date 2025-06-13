package com.example.scenepick.feature.saved

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
internal fun SavedRoute(
    modifier: Modifier = Modifier,
    viewModel: SavedViewModel = hiltViewModel()
) {
    val savedScreenText by remember { mutableStateOf("Saved Screen") }

    SavedScreen(
        modifier = modifier,
        savedScreenText = savedScreenText
    )
}

@Composable
internal fun SavedScreen(
    modifier: Modifier = Modifier,
    savedScreenText: String,
) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = savedScreenText)
    }
}