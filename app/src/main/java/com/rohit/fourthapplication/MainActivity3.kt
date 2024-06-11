package com.rohit.fourthapplication

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    var tvName: TextView? = null
    var name = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
            intent?.extras?.let {
                intent?.extras?.let {
                    //getting
                    name = it.getString("name") ?: ""
                    println("name ${name}")
                }
                tvName = findViewById(R.id.name)
                tvName?.setText(name)
        }
    }
}