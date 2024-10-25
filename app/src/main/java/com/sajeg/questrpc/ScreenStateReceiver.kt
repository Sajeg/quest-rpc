package com.sajeg.questrpc

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ScreenStateReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        when (p1?.action) {
            Intent.ACTION_SCREEN_ON -> {
                ActivityManager.start(p0!!)
                ActivityManager.appChanged("com.oculus.vrshell", p0)
            }

            Intent.ACTION_SCREEN_OFF -> {
                ActivityManager.stop(p0!!)
            }
        }
    }
}