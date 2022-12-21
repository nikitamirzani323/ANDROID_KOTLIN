package com.toto.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_layout = findViewById<Button>(R.id.btn_layout)
        val btn_splash = findViewById<Button>(R.id.btn_splash)

        btn_layout.setOnClickListener {
            val intent_layout = Intent(this,layout::class.java)
            startActivity(intent_layout)
            Toast.makeText(this,"Click",Toast.LENGTH_SHORT).show()
        }
        btn_splash.setOnClickListener {
            val intent_splash = Intent(this,Splash::class.java)
            startActivity(intent_splash)
        }
    }
}