package com.ilusr.budgapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListeners()
    }

    private fun setupListeners() {
        val generalButton = findViewById<Button>(R.id.btn_general)

        generalButton.setOnClickListener {
            setContentView(R.layout.activity_general)
        }
    }
}
