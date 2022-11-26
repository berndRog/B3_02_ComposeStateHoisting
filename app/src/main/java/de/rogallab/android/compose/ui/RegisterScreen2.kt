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
fun RegisterScreen2() {

   var name by remember { mutableStateOf("") }

   Log.d("ok>RegisterScreen2    .", "Composition {$name}")

   RegisterContent(
      name = name,                                     // State ↓
      onNameChange = { value:String -> name = value }  // Event ↑  
   )

}

@Composable
fun RegisterContent(
   name: String,                 // State ↓
   onNameChange: (String)->Unit  // Event ↑
) {

   Column(modifier = Modifier
      .padding(all = 8.dp)
      .fillMaxSize()
   ) {

      Log.d("ok>RegisterContent    .", "Composition {$name}")


      TextField(
         value = name,                          // State ↓
         onValueChange = { onNameChange(it) },  // Event ↑
         placeholder = { Text( text = "Name"  ) },
         modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
      )

      if(name.length > 20) {
         Text(
            text = "Der eingegebene Name ist zu lang. \nEs sind maximal 20 Zeichen erlaubt",
            color = Color.Red
            )
      }
      
   }
}
