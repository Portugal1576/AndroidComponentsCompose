package com.example.androidcomponentscompose.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class SomeBroadcastReceived: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneMode = intent?.getBooleanExtra("state", false)?: false
        if (isAirplaneMode){
            Log.d("check data", "Airplane mode enabled")
        }
        else{
            Log.d("check data", "Airplane mode disabled")
        }
    }
}