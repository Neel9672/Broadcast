package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneMode: BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        if(p1?.action != null && p1.action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
            var isAirplaneMode : Boolean = p1.getBooleanExtra("state", false)

            if (isAirplaneMode){
                Toast.makeText(p0,
                    "Airplane mode Is ON", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(p0,
                    "Airplane mode Is OFF", Toast.LENGTH_SHORT).show()
            }
        }
    }
}