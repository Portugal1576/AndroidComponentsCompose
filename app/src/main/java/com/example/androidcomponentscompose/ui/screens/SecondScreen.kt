package com.example.androidcomponentscompose.ui.screens

import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidcomponentscompose.servises.CountService
import com.example.androidcomponentscompose.ui.theme.AndroidComponentsComposeTheme

@Composable
fun SecondScreen() {
    val context = LocalContext.current
    val activity = if (context is Activity) context else null
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Second Activity screen")
        Button(onClick = {
            activity?.finish()
        }) {
            Text(text = "Go to First activiti")
        }

        Row(
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Button(onClick = {
                activity?.startService(Intent(context, CountService::class.java))
            }) {
                Text(text = "Start service")
            }
            Button(
                modifier = Modifier.padding(start = 20.dp),
                onClick = {
                    activity?.stopService(Intent(context, CountService::class.java))

                }) {
                Text(text = "Stop service")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SecondScreenPreview() {
    AndroidComponentsComposeTheme {
        SecondScreen()
    }
}