package com.example.componentsofandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
    }

    fun startRingtoneService(view: View) {
        startService(Intent(this,RingtoneService::class.java))
    }

    fun stopRingtoneService(view: View) {
        stopService(Intent(this,RingtoneService::class.java))
    }
}