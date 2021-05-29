package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
        var button1=findViewById<Button>(R.id.btnnext1)
        button1.setOnClickListener {
            var intent= Intent(baseContext,page2::class.java)
            startActivity(intent)
        }
        var button11=findViewById<Button>(R.id.btnback1)
        button11.setOnClickListener {
            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}