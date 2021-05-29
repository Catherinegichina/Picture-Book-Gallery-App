package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)

        var button4=findViewById<Button>(R.id.btnnext4)
        button4.setOnClickListener{
            var intent= Intent(baseContext,page5::class.java)
            startActivity(intent)
        }
        var button44=findViewById<Button>(R.id.btnback4)
        button44.setOnClickListener{
            var intent= Intent(baseContext,page3::class.java)
            startActivity(intent)
        }
    }
}
