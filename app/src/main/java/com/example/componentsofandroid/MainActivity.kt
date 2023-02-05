package com.example.componentsofandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun goToActivity(view: View) {
        startActivity(Intent(this, ActivityLifeCycle::class.java))
    }
    fun goToService(view: View) {
        startActivity(Intent(this, ServiceActivity::class.java))
    }
    fun goToBroadcastReceiver(view: View) {
        startActivity(Intent(this,BroadcastReceiverActivity::class.java))
    }
    fun goToContentProvider(view: View) {
        startActivity(Intent(this, ContentProviderActivity::class.java))
    }
}