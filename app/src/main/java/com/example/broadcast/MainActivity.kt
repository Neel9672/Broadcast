package com.example.broadcast

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var airplaneModeReceiver: AirplaneMode
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Register Dynamically the broadcast Receiver
        var intentFilter: IntentFilter = IntentFilter("android.intent.action.AIRPLANE_MODE")

        airplaneModeReceiver = AirplaneMode()
        registerReceiver(airplaneModeReceiver, intentFilter)
    }

    override fun onDestroy() {

        unregisterReceiver(airplaneModeReceiver)
        super.onDestroy()
    }
}