package com.rohit.fourthapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var name : EditText? =null
    var college : EditText? =null
    var check : Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
            name = findViewById(R.id.name)
            college = findViewById(R.id.college)
            check = findViewById(R.id.check)
        check?.setOnClickListener {
            var intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("name",name?.text?.toString()?.trim())
            intent.putExtra("College",college?.text?.toString()?.trim())
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "On resume", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "on Stop", Toast.LENGTH_SHORT).show()
    }
}