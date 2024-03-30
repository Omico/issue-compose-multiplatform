package me.omico.gpi.shared

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    val defaultTypography = MaterialTheme.typography
    val indieFlowerTypography = remember {
        defaultTypography.copy(
            displayLarge = defaultTypography.displayLarge.copy(fontFamily = FontFamily_IndieFlower),
            displayMedium = defaultTypography.displayMedium.copy(fontFamily = FontFamily_IndieFlower),
            displaySmall = defaultTypography.displaySmall.copy(fontFamily = FontFamily_IndieFlower),
            headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = FontFamily_IndieFlower),
            headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = FontFamily_IndieFlower),
            headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = FontFamily_IndieFlower),
            titleLarge = defaultTypography.titleLarge.copy(fontFamily = FontFamily_IndieFlower),
            titleMedium = defaultTypography.titleMedium.copy(fontFamily = FontFamily_IndieFlower),
            titleSmall = defaultTypography.titleSmall.copy(fontFamily = FontFamily_IndieFlower),
            bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = FontFamily_IndieFlower),
            bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = FontFamily_IndieFlower),
            bodySmall = defaultTypography.bodySmall.copy(fontFamily = FontFamily_IndieFlower),
            labelLarge = defaultTypography.labelLarge.copy(fontFamily = FontFamily_IndieFlower),
            labelMedium = defaultTypography.labelMedium.copy(fontFamily = FontFamily_IndieFlower),
            labelSmall = defaultTypography.labelSmall.copy(fontFamily = FontFamily_IndieFlower),
        )
    }

    var currentTypography by remember { mutableStateOf(defaultTypography) }
    MaterialTheme(typography = currentTypography) {
        AlertDialog(
            onDismissRequest = { },
            title = { Text("Select Typography") },
            text = {
                Row {
                    Button(
                        onClick = { currentTypography = defaultTypography },
                        content = { Text("Default") },
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = { currentTypography = indieFlowerTypography },
                        content = { Text("Indie Flower") },
                    )
                }
            },
            confirmButton = { },
            dismissButton = { },
        )
    }
}

expect val FontFamily_IndieFlower: FontFamily
