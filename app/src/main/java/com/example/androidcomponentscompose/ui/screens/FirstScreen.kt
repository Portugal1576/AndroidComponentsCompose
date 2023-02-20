package com.example.androidcomponentscompose.ui.screens

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidcomponentscompose.contentprovider.ContactsActivity
import com.example.androidcomponentscompose.ui.SecondActivity
import com.example.androidcomponentscompose.ui.theme.AndroidComponentsComposeTheme

@Composable
fun FirstScreen(){
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "First Activity screen")
        Button(onClick = {
            val intent1 = Intent(context, SecondActivity::class.java)
            val intent2 = SecondActivity.newIntent(context = context, "Hello")
            context.startActivity(intent2)
        }) {
            Text(text = "Go to Second activity")
        }
        Button(onClick = {
            val intent2 = ContactsActivity.newIntent(context = context, "Hello")
            context.startActivity(intent2)
        }) {
            Text(text = "Go to Contacts activity")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun FirstScreenPreview(){
    AndroidComponentsComposeTheme {
        FirstScreen()
    }
}
