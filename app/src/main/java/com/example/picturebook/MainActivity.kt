package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var button=findViewById<Button>(R.id.btnnext)
        button.setOnClickListener{
            var intent=Intent(baseContext,page1::class.java)
            startActivity(intent)
        }
    }
}