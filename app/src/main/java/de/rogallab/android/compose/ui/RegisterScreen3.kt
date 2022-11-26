package de.rogallab.android.compose.ui

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RegisterScreen3(
   name: String,                      // State ↓
   onNameChange: (String) -> Unit     // State ↓
) {

   Log.d("ok>RegisterScreen3    .", "Composition {$name}")

   RegisterContent(
      name = name,                         // State ↓
      onNameChange = { onNameChange(it) }
   )

}

