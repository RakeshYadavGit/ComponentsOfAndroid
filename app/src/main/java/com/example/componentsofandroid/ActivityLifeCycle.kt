package com.example.componentsofandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityLifeCycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }
}