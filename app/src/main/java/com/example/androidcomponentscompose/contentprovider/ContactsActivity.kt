package com.example.androidcomponentscompose.contentprovider

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.androidcomponentscompose.ui.screens.ContactsScreen
import com.example.androidcomponentscompose.ui.theme.AndroidComponentsComposeTheme

class ContactsActivity: ComponentActivity() {
    companion object{
        const val ARG_SOME_TEXT = "ARG_SOME_TEXT"
        fun newIntent(context: Context, someText: String) =
            Intent(context, ContactsActivity::class.java).apply {
                putExtra(ARG_SOME_TEXT, someText)
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  someText = intent?.extras?.getString(ARG_SOME_TEXT)
        Log.d("check data", "Contacts Activity: onCreate, text = $someText")
        setContent {
            AndroidComponentsComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ContactsScreen()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("check data", "Contacts Activity: onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("check data", "Contacts Activity: onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("check data", "Contacts Activity: onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("check data", "Contacts Activity: onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("check data", "Contacts Activity: onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("check data", "Contacts Activity: onDestroy")

    }
}