package de.rogallab.android.compose

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import de.rogallab.android.compose.ui.RegisterScreen
import de.rogallab.android.compose.ui.RegisterScreen2
import de.rogallab.android.compose.ui.RegisterScreen3
import de.rogallab.android.compose.ui.theme.AppTheme

class MainActivity : BaseActivity("ok>MainActivity       .") {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContent {

         AppTheme(

         ) {
            Surface(
               modifier = Modifier.fillMaxSize(),
               color = MaterialTheme.colors.background
            ) {
               var name by remember { mutableStateOf("") }

               Log.d("ok>ComposeView        .", "Composition {$name}")
               RegisterScreen3(
                 name = name,
                 onNameChange = { name = it },
               )
            }
         }
      }
  }
}
