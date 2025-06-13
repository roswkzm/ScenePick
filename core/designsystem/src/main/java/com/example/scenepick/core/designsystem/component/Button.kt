package com.example.scenepick.core.designsystem.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.scenepick.core.designsystem.icon.SpIcons
import com.example.scenepick.core.designsystem.theme.ScenePickTheme
import com.example.scenepick.core.designsystem.theme.ThemePreviews

@Composable
fun SpButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    enabled: Boolean = true,
    contentPadding: PaddingValues = PaddingValues(horizontal = 8.dp, vertical = 5.dp),
    leadingIcon: @Composable (() -> Unit)? = null,
    text: @Composable () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = MaterialTheme.shapes.small,
        enabled = enabled,
        colors = colors,
        contentPadding = contentPadding,
        content = {
            ButtonContent(
                leadingIcon = leadingIcon,
                text = text
            )
        },
    )
}

@Composable
fun RowScope.ButtonContent(
    leadingIcon: @Composable (() -> Unit)? = null,
    text: @Composable () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (leadingIcon != null) {
            leadingIcon()
        }
        text()
    }
}

@ThemePreviews
@Composable
fun MwIconButtonPreview() {
    ScenePickTheme {
        SpBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            SpButton(
                modifier = Modifier,
                onClick = {},
                leadingIcon = { Icon(imageVector = SpIcons.Add, contentDescription = null) },
                text = { Text("Test button") },
            )
        }
    }
}

@ThemePreviews
@Composable
fun MwButtonPreview() {
    ScenePickTheme {
        SpBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            SpButton(
                modifier = Modifier,
                onClick = {},
                text = { Text("Test button") },
            )
        }
    }
}