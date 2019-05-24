package com.ilusr.budgapp

import android.content.Intent
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
            val generalIntent = Intent(this, General::class.java)
            startActivity(generalIntent)
        }

        val budgetButton = findViewById<Button>(R.id.btn_budget)

        budgetButton.setOnClickListener {
            val budgetIntent = Intent(this, Budget::class.java)
            startActivity(budgetIntent)
        }

        val incomeButton = findViewById<Button>(R.id.btn_income)

        incomeButton.setOnClickListener {
            val incomeIntent = Intent(this, Income::class.java)
            startActivity(incomeIntent)
        }

        val historyButton = findViewById<Button>(R.id.btn_history)

        historyButton.setOnClickListener {
            val historyIntent = Intent(this, History::class.java)
            startActivity(historyIntent)
        }
    }
}
