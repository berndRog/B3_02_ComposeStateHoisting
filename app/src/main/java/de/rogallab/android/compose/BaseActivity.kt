package de.rogallab.android.compose

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity


open class BaseActivity(
   private val _tag: String
) : ComponentActivity() {


   // Start of full lifetime
   // Activity is first created
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      if (savedInstanceState == null)
         Log.i(_tag, "onCreate() Bundle == null")
      else
         Log.i(_tag, "onCreate() Bundle != null")
   }

   // Activity is restarted
   override fun onRestart() {
      super.onRestart()
      Log.i(_tag, "onRestart()")
   }

   // Start of visible lifetime
   // Activity is visible
   override fun onStart() {
      super.onStart()
      Log.i(_tag, "onStart()")
   }

   // Start of the active lifetime
   // Activity interacts with the user
   override fun onResume() {
      super.onResume()
      Log.i(_tag, "onResume()")
   }

   // End of active lifetime
   // User is leaving activity
   override fun onPause() {
      Log.i(_tag, "onPause()")
      super.onPause()
   }

   // End of visible lifetime
   // Activity is no longer visible
   override fun onStop() {
      Log.i(_tag, "onStop()")
      super.onStop()
   }

   // End of full lifetime
   // Called before the activity is destroyed.
   override fun onDestroy() {
      Log.i(_tag, "onDestroy()")
      super.onDestroy()
   }

   // override save/restore state methods -------------------------------------
   // Save instance state: invoked when the activity may be temporarily destroyed,
   override fun onSaveInstanceState(savedStateBundle: Bundle) {
      super.onSaveInstanceState(savedStateBundle)
      Log.i(_tag, "onSaveInstanceState()")
   }

   override fun onRestoreInstanceState(savedInstanceState: Bundle) {
      super.onRestoreInstanceState(savedInstanceState)
      Log.i(_tag, "onRestoreInstanceState()")
   }

   override fun onConfigurationChanged(newConfig: Configuration) {
      super.onConfigurationChanged(newConfig)

      // Checks the orientation of the screen
      if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
         Log.i(_tag, "landscape")
      } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
         Log.i(_tag, "portrait")
      }
   }

   override fun onWindowFocusChanged(hasFocus: Boolean) {
      Log.i(_tag, "onWindowFocusChanged() $hasFocus")
      super.onWindowFocusChanged(hasFocus)
   }

   override fun onBackPressed() {
      Log.i(_tag, "onBackPressed()")
      super.onBackPressed()
   }

   override fun onTrimMemory(level: Int) {
      super.onTrimMemory(level)
      Log.i(_tag, "onTrimMemory() $level")
      if (level == TRIM_MEMORY_RUNNING_MODERATE) Log.i(_tag, "TRIM_MEMORY_RUNNING_MODERATE")
      if (level == TRIM_MEMORY_RUNNING_LOW) Log.i(_tag, "TRIM_MEMORY_RUNNING_LOW")
      if (level == TRIM_MEMORY_RUNNING_CRITICAL) Log.i(_tag, "TRIM_MEMORY_RUNNING_CRITICAL")
      if (level == TRIM_MEMORY_BACKGROUND) Log.i(_tag, "TRIM_MEMORY_BACKGROUND")
      if (level == TRIM_MEMORY_COMPLETE) Log.i(_tag, "TRIM_MEMORY_COMPLETE")
      if (level == TRIM_MEMORY_UI_HIDDEN) Log.i(_tag, "TRIM_MEMORY_UI_HIDDEN")
      if (level == TRIM_MEMORY_MODERATE) Log.i(_tag, "TRIM_MEMORY_MODERATE")
   }
}
