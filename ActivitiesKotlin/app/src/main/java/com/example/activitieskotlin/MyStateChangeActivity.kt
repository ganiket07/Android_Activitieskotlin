package com.example.activitieskotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MyStateChangeActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        // Initialize Activity and inflate the UI.
        Log.d("MyStateChangeActivity", "onCreate()")

    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        // Will only be called if the Activity has been
        // killed by the system since it was last visible.
        Log.d("MyStateChangeActivity", "onRestoreInstanceState")

    }

    override fun onRestart() {
        super.onRestart()
        // Load changes knowing that the Activity has already
        // been visible within this process.
        Log.d("MyStateChangeActivity", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        // Resume any paused UI updates, threads, or processes required
        // by the Activity but suspended when it was inactive.
        Log.d("MyStateChangeActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyStateChangeActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyStateChangeActivity", "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyStateChangeActivity", "onDestroy")
    }
}

