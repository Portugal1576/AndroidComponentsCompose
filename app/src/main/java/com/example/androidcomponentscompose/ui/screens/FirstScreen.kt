package com.example.androidcomponentscompose.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidcomponentscompose.ui.theme.AndroidComponentsComposeTheme

@Composable
fun FirstScreen(){

}

@Preview(showSystemUi = true)
@Composable
fun FirstScreenPreview(){
    AndroidComponentsComposeTheme {
        FirstScreen()
    }
}
