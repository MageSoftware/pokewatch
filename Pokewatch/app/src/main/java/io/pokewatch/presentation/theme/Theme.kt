package io.pokewatch.presentation.theme

import androidx.compose.runtime.Composable
import androidx.wear.compose.material.MaterialTheme

@Composable
fun PokewatchTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        content = content
    )
}