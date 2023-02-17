package com.example.androidcomponentscompose.ui.screens

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.androidcomponentscompose.ui.theme.AndroidComponentsComposeTheme

class SecondActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("check data", "Second Activity: onCreate")
        setContent {
            AndroidComponentsComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FirstScreen()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("check data", "Second Activity: onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("check data", "Second Activity: onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("check data", "Second Activity: onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("check data", "Second Activity: onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("check data", "Second Activity: onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("check data", "Second Activity: onDestroy")

    }
}