package com.example.androidcomponentscompose.ui

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.androidcomponentscompose.receivers.SomeBroadcastReceived
import com.example.androidcomponentscompose.ui.screens.FirstScreen
import com.example.androidcomponentscompose.ui.screens.SecondScreen
import com.example.androidcomponentscompose.ui.theme.AndroidComponentsComposeTheme

class SecondActivity: ComponentActivity() {
    companion object{
        const val ARG_SOME_TEXT = "ARG_SOME_TEXT"
        fun newIntent(context: Context, someText: String) =
            Intent(context, SecondActivity::class.java).apply {
                putExtra(ARG_SOME_TEXT, someText)
            }
        }

    lateinit var receiver: SomeBroadcastReceived

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  someText = intent?.extras?.getString(ARG_SOME_TEXT)
        Log.d("check data", "Second Activity: onCreate, text = $someText")
        receiver = SomeBroadcastReceived()
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver, it)
        }
        setContent {
            AndroidComponentsComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SecondScreen()
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
        unregisterReceiver(receiver)
        Log.d("check data", "Second Activity: onDestroy")

    }
}