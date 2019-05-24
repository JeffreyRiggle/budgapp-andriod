package com.ilusr.budgapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class General : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general)

        setupListeners()
    }

    private fun setupListeners() {
        val mainButton = findViewById<Button>(R.id.btn_main)

        mainButton.setOnClickListener {
            setContentView(R.layout.activity_main)
        }
    }
}
